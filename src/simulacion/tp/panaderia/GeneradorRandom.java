/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.util.Random;

/**
 *
 * @author juan
 */
public class GeneradorRandom {
   
	private static Random random;
	
	public static Double nextDouble() {
		if(random == null)
			random = new Random();
		
		return random.nextDouble();
	}
 
}
