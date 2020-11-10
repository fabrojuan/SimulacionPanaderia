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
public class Evento {
   
	private TipoEvento tipoEvento;
	private LocalDateTime momentoOcurrencia;
	
	public Evento(TipoEvento tipoEvento, LocalDateTime momentoOcurrencia) {
		super();
		this.tipoEvento = tipoEvento;
		this.momentoOcurrencia = momentoOcurrencia;
	}
	
	@Override
	public String toString() {
		return tipoEvento.toString().concat(" - ").concat(momentoOcurrencia.toString());
	}
	
	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public LocalDateTime getMomentoOcurrencia() {
		return momentoOcurrencia;
	}
	public void setMomentoOcurrencia(LocalDateTime momentoOcurrencia) {
		this.momentoOcurrencia = momentoOcurrencia;
	}
 
}
