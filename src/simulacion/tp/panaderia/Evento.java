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
public class Evento {
   
	private TipoEvento tipoEvento;
	private LocalTime momentoOcurrencia;
	
	public Evento(TipoEvento tipoEvento, LocalTime momentoOcurrencia) {
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
	public LocalTime getMomentoOcurrencia() {
		return momentoOcurrencia;
	}
	public void setMomentoOcurrencia(LocalTime momentoOcurrencia) {
		this.momentoOcurrencia = momentoOcurrencia;
	}
 
}
