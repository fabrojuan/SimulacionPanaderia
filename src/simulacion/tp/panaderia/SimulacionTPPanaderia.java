/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.awt.Frame;

/**
 *
 * @author juan
 */
public class SimulacionTPPanaderia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PantallaPrincipal principal = new PantallaPrincipal();
        principal.setTitle("Simulacion Panaderia - Juan Fabro - 40684");
        principal.setExtendedState(Frame.MAXIMIZED_BOTH);
        principal.setVisible(true);
    }
    
}
