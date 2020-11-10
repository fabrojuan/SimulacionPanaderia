/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author juan
 */
public class Cola {
	private List<Cliente> listItemsCola;
	
	public Cola() {
		listItemsCola = new ArrayList<Cliente>(0);
	}
	
	public void agregarClienteACola(Cliente cliente) {
		listItemsCola.add(cliente);
	}
	
	public void notificarNoHayProductos() {
		listItemsCola = new ArrayList<Cliente>(0);
	}
        
        public int getTamanoCola() {
            return listItemsCola.size();
        }
        
        public void removerClienteDeCola(Cliente cliente) {
            listItemsCola.remove(cliente);
        }
	
	public void notificarEsperaClienteAgotada(LocalDateTime momentoToleranciaMaximo) {
		Cliente clienteSeVa = listItemsCola
				.stream()
				.filter(p -> momentoToleranciaMaximo.equals(p.getMomentoEsperaAgotada()))
				.findFirst()
				.orElse(null);
		
		if(clienteSeVa != null) {
			listItemsCola.remove(clienteSeVa);
		}
	}
	
	public boolean hayClientesEnEspera() {
		return listItemsCola.size() > 0;
	}
	
	public Cliente getProximoClienteAtender() {
		return listItemsCola
				.stream()
				.sorted(Comparator.comparing(Cliente::getMomentoLlegadaPanaderia))
				.findFirst()
				.orElse(null);
	}
	
        public String getOrdenClientesEnCola() {
            return listItemsCola
                    .stream()
                    .sorted(Comparator.comparing(Cliente::getMomentoLlegadaPanaderia))
                    .map(p->p.getNroCliente())
                    .collect(Collectors.toList())
                    .toString();
        }
        
        public void notificarClientesEnEsperaDeProductos() {
            listItemsCola.stream().forEach(p->p.setMomentoEsperaAgotada(null));
        }
}
