/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.time.LocalTime;

/**
 *
 * @author juan
 */
public class Cliente {

	private Long nroCliente;
	private LocalTime momentoLlegadaPanaderia;
	private LocalTime momentoEsperaAgotada;
	private int cantidadPedida;
	
	public Cliente(Long nroCliente, LocalTime momentoLlegadaPanaderia, int cantidadPedida) {
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
	public LocalTime getMomentoLlegadaPanaderia() {
		return momentoLlegadaPanaderia;
	}
	public void setMomentoLlegadaPanaderia(LocalTime momentoLlegadaPanaderia) {
		this.momentoLlegadaPanaderia = momentoLlegadaPanaderia;
	}
	public int getCantidadPedida() {
		return cantidadPedida;
	}
	public void setCantidadPedida(int cantidadPedida) {
		this.cantidadPedida = cantidadPedida;
	}
	public LocalTime getMomentoEsperaAgotada() {
		return momentoEsperaAgotada;
	}
	public void setMomentoEsperaAgotada(LocalTime momentoEsperaAgotada) {
		this.momentoEsperaAgotada = momentoEsperaAgotada;
	}
	
}
