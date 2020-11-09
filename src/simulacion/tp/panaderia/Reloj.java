/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author juan
 */
public class Reloj {
    
	private static LocalTime momentoActual;
	
	public static LocalTime getMomentoActual() {
		if(momentoActual == null)
			momentoActual = LocalTime.ofSecondOfDay(0);
		
		return momentoActual;
	}
	
	public void setMomentoActual(LocalTime momentoActual) {
		Reloj.momentoActual = momentoActual;
	}
	
	public void agregarDuracionAMomentoActual(Duration duracion) {
		Reloj.momentoActual.plusNanos(duracion.toNanos());
	}

}
