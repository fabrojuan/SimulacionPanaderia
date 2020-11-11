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
public class Cliente {

	private Long nroCliente;
	private LocalDateTime momentoLlegadaPanaderia;
	private LocalDateTime momentoEsperaAgotada;
	private int cantidadPedida;
	
	public Cliente(Long nroCliente, LocalDateTime momentoLlegadaPanaderia, int cantidadPedida) {
		super();
		this.nroCliente = nroCliente;
		this.momentoLlegadaPanaderia = momentoLlegadaPanaderia;
		this.cantidadPedida = cantidadPedida;
	}
	public Long getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(Long nroCliente) {
		this.nroCliente = nroCliente;
	}
	public LocalDateTime getMomentoLlegadaPanaderia() {
		return momentoLlegadaPanaderia;
	}
	public void setMomentoLlegadaPanaderia(LocalDateTime momentoLlegadaPanaderia) {
		this.momentoLlegadaPanaderia = momentoLlegadaPanaderia;
	}
	public int getCantidadPedida() {
		return cantidadPedida;
	}
	public void setCantidadPedida(int cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}
	public LocalDateTime getMomentoEsperaAgotada() {
		return momentoEsperaAgotada;
	}
	public void setMomentoEsperaAgotada(LocalDateTime momentoEsperaAgotada) {
		this.momentoEsperaAgotada = momentoEsperaAgotada;
	}
	
}
