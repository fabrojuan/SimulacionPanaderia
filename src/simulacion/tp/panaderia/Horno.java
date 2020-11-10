/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.time.LocalDateTime;

/**
 *
 * @author juan
 */
public class Horno {
    

	private EstadoServidor estado;
	private LocalDateTime momentoFinCoccion;
	private Long cantidadCocinar;
	
	public Horno() {
		estado = EstadoServidor.LIBRE;
	}
	
	public void empezarCoccion(Long cantidadProductosCocinar, VectorEstado actual) {
		estado = EstadoServidor.OCUPADO;
		cantidadCocinar = cantidadProductosCocinar;
		
		// La cocción de los productos finaliza cuando el horno permanece 15 minutos en temperatura máxima. 
		// La tasa de cambio de la temperatura del horno está representada por la siguiente ecuación
		Double minutosLlevaEnCoccion = 0d;
		Double minutosTemperaturaMaxima = Configuracion.getInstance().getMinutosTemperaturaMaximaHorno();
		Double minutosLlevaEnTemperaturaMaxima = 0d;
		Double deltaMinuto = Configuracion.getInstance().gethRoungeKuttaHorno();
		
		Double T = Configuracion.getInstance().getTemperaturaInicialHorno();
		Double K1 = deltaMinuto * (-0.5 * T + 900d/cantidadProductosCocinar);
		Double K2 = deltaMinuto * (-0.5 * (T + 0.5 * K1) + 900 / cantidadProductosCocinar );
		Double K3 = deltaMinuto * (-0.5 * (T + 0.5 * K2) + 900 / cantidadProductosCocinar );
		Double K4 = deltaMinuto * (-0.5 * (T + K3) + 900 / cantidadProductosCocinar );
		
		while(minutosLlevaEnTemperaturaMaxima < minutosTemperaturaMaxima) {
			Double TAnterior = T;
			T += (K1 + 2 * K2 + 2 * K3 + K4) / 6;
			K1 = deltaMinuto * (-0.5 * T + 900d/cantidadProductosCocinar);
			K2 = deltaMinuto * (-0.5 * (T + 0.5 * K1) + 900 / cantidadProductosCocinar );
			K3 = deltaMinuto * (-0.5 * (T + 0.5 * K2) + 900 / cantidadProductosCocinar );
			K4 = deltaMinuto * (-0.5 * (T + K3) + 900 / cantidadProductosCocinar );
			
			// Si hubo una diferencia de menos de un grado considero que no cambio la temperatura
			if(Math.abs(T - TAnterior) < 1 ) {
				minutosLlevaEnTemperaturaMaxima += deltaMinuto;
			} else {
				minutosLlevaEnTemperaturaMaxima = 0d;
			}
			
			minutosLlevaEnCoccion += deltaMinuto;
		}
		
		momentoFinCoccion = actual.getReloj().plusSeconds((long) (minutosLlevaEnCoccion * 60));
		
		actual.addEvento(
				new Evento(TipoEvento.FIN_COCCION, 
						momentoFinCoccion));
		
		// Programo tambien el nuevo inicio de coccion
		LocalDateTime momentoNuevoInicioCoccion = actual.getReloj().plusSeconds((long) (Configuracion.getInstance().getMinutosEntreEncendidosHorno() * 60));
		if(momentoNuevoInicioCoccion.isBefore(momentoFinCoccion)) {
			momentoNuevoInicioCoccion = momentoFinCoccion.plusSeconds(1);
		} 
		
		actual.addEvento(
				new Evento(TipoEvento.INICIO_COCCION, 
						momentoNuevoInicioCoccion));
	}
	
	public void notificarNoHayProductos(VectorEstado actual) {
		Evento proximoEeventoInicioCoccion = actual.getProximoEventoInicioCoccion();
		
		if(EstadoServidor.LIBRE.equals(estado)) {
			if(proximoEeventoInicioCoccion != null) {
				proximoEeventoInicioCoccion.setMomentoOcurrencia(actual.getReloj().plusSeconds(1l));
			} else {
				actual.addEvento(new Evento(TipoEvento.INICIO_COCCION, 
						actual.getReloj().plusSeconds(1l)));
			}			
			
		} else {
			if(proximoEeventoInicioCoccion != null) {
				proximoEeventoInicioCoccion.setMomentoOcurrencia(momentoFinCoccion.plusSeconds(1l));
			} else {
				actual.addEvento(new Evento(TipoEvento.INICIO_COCCION, 
						momentoFinCoccion.plusSeconds(1l)));
			}		
		}
	}
	
	public void finalizarCoccion() {
		estado = EstadoServidor.LIBRE;
		momentoFinCoccion = null;
		cantidadCocinar = null;
	}
	
	// Getters y Setters
	public EstadoServidor getEstado() {
		return estado;
	}
	public LocalDateTime getMomentoFinCoccion() {
		return momentoFinCoccion;
	}

	public Long getCantidadCocinar() {
		return cantidadCocinar;
	}
	

}
