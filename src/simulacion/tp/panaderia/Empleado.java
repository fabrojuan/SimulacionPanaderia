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
public class Empleado {
    
	private int id;
	private EstadoServidor estado;
	private LocalDateTime momentoFinAtencion;
	
	public Empleado(int id) {
            this.id = id;
		estado = EstadoServidor.LIBRE;
	}

	public void empezarAtenderCliente(Cliente cliente, VectorEstado actual) {
		estado = EstadoServidor.OCUPADO;
                
                actual.getCola().removerClienteDeCola(cliente);
		
		// Stock
		if(cliente.getCantidadPedida() >= actual.getCantidadStockProductos()) {
			actual.disminuirStock(actual.getCantidadStockProductos());
			
			// Clientes. Si estaba esperando su turno, y se terminan los productos, se retira
			actual.getCola().notificarNoHayProductos();
			
			// aca tambien deberia disparar un nuevo inicio de coccion controlando si no esta el horno ya cocinando.
			actual.getHorno().notificarNoHayProductos(actual);
		} else {
			actual.disminuirStock((long) cliente.getCantidadPedida());
		}
		
		// Esta panadería cuenta con dos empleados, cualquiera de los cuales demora entre 0,5 y 1,5 minutos (distribución uniforme) 
		// en atender a un cliente, independientemente de cuántas cosas compre el cliente 
		Double minutosAtencion = Configuracion.getInstance().getMinutosAtencionEmpleadosA() 
				+ (Configuracion.getInstance().getMinutosAtencionEmpleadosB() - Configuracion.getInstance().getMinutosAtencionEmpleadosA())
					* GeneradorRandom.nextDouble();
		
		momentoFinAtencion = actual.getReloj().plusSeconds((long) (minutosAtencion * 60));
		
		actual.addEvento(new Evento(TipoEvento.FIN_ATENCION, momentoFinAtencion));
	}
	
	public void finalizarAtencion() {
		estado = EstadoServidor.LIBRE;
		momentoFinAtencion = null;
	}

	// Getters y Setters
	public EstadoServidor getEstado() {
		return estado;
	}

	public void setEstado(EstadoServidor estado) {
		this.estado = estado;
	}

	public LocalDateTime getMomentoFinAtencion() {
		return momentoFinAtencion;
	}

	public void setMomentoFinAtencion(LocalDateTime momentoFinAtencion) {
		this.momentoFinAtencion = momentoFinAtencion;
	}
	
        public int getId() {
            return id;
        }
}
