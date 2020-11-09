package simulacion.tp.panaderia;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class VectorEstado {
    
	private LocalTime reloj;
	private Evento eventoActual;
	private Cola cola;
	private List<Empleado> listEmpleados;
	private Horno horno;
	private List<Evento> listEventos; 
	private Long cantidadStockProductos;
        private String infoEvento;

    
	public VectorEstado() {
		listEmpleados = new ArrayList<Empleado>(0);
		listEventos = new ArrayList<Evento>(0);
	}
        
        public void notificarClientesEnEsperaDeProductos() {
            cola.notificarClientesEnEsperaDeProductos();
            List<Evento> list = listEventos
                    .stream()
                    .filter(p->p.getTipoEvento().equals(TipoEvento.ESPERA_CLIENTE_AGOTADA))
                    .collect(Collectors.toList());
            listEventos.removeAll(list);
        }
        
        public EstadoServidor getEstadoEmpleado(int idEmpleado) {
            return listEmpleados
                    .stream()
                    .filter(p -> p.getId() == idEmpleado)
                    .map(p->p.getEstado())
                    .findFirst()
                    .orElse(null);
        }
        
        public String getProximoFinAteEmpleado(int idEmpleado) {
            Empleado empleado =  listEmpleados
                    .stream()
                    .filter(p -> p.getId() == idEmpleado)
                    .findFirst()                    
                    .orElse(null);
            
            if(empleado == null || empleado.getMomentoFinAtencion() == null) 
                return " - ";
            else
                return empleado.getMomentoFinAtencion().toString();
        }
        
        public String getProximoIniCoccion() {
            Evento eventoInicioCoccion = listEventos
                    .stream()
                    .filter(p->p.getTipoEvento().equals(TipoEvento.INICIO_COCCION))
                    .findFirst()
                    .orElse(null);
            
            if(eventoInicioCoccion != null)
                return eventoInicioCoccion.getMomentoOcurrencia().toString();
            
            return "-";
        }
	
	public void disminuirStock(Long cantidadDisminuir) {
		cantidadStockProductos -= cantidadDisminuir;
	}
	
	public void incrementarStock(Long cantidadIncrementar) {
		cantidadStockProductos += cantidadIncrementar;
	}
	
	public Evento getProximoEventoInicioCoccion() {
		return listEventos
				.stream()
				.filter(p -> p.getTipoEvento().equals(TipoEvento.INICIO_COCCION))
				.findFirst()
				.orElse(null);
	}
        
        public String getMomentoProxLlegadaCli() {
            Evento evento = listEventos
                    .stream()
                    .filter(p->p.getTipoEvento().equals(TipoEvento.LLEGADA_CLIENTE))
                    .findFirst()
                    .orElse(null);
            
            if(evento != null) {
                return evento.getMomentoOcurrencia().toString();
            }
            
            return "-";
        }
	
	public void addEmpleado(Empleado empleado) {
		listEmpleados.add(empleado);
	}
	
	public void addEvento(Evento evento) {
		listEventos.add(evento);
	}
	
	public LocalTime getReloj() {
		return reloj;
	}

	public void setReloj(LocalTime reloj) {
		this.reloj = reloj;
	}

	public Evento getEventoActual() {
		return eventoActual;
	}

	public void setEventoActual(Evento eventoActual) {
		this.eventoActual = eventoActual;
	}

	public Cola getCola() {
		return cola;
	}

	public void setCola(Cola cola) {
		this.cola = cola;
	}

	public void setHorno(Horno horno) {
		this.horno = horno;
	}

	public List<Empleado> getListEmpleados() {
		return listEmpleados;
	}

	public void setListEmpleados(List<Empleado> listEmpleados) {
		this.listEmpleados = listEmpleados;
	}

	public Horno getHorno() {
		return horno;
	}

	public List<Evento> getListEventos() {
		return listEventos;
	}

	public void setListEventos(List<Evento> listEventos) {
		this.listEventos = listEventos;
	}

	public Long getCantidadStockProductos() {
		return cantidadStockProductos;
	}

	public void setCantidadStockProductos(Long cantidadStockProductos) {
		this.cantidadStockProductos = cantidadStockProductos;
	}
	
        public String getInfoEvento() {
            return infoEvento;
        }

        public void setInfoEvento(String infoEvento) {
            this.infoEvento = infoEvento;
        }
}
