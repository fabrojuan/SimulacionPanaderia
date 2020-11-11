package simulacion.tp.panaderia;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

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
    
    private Long nroFila;
    private LocalDateTime reloj;
    private Evento eventoActual;
    private Cola cola;
    private List<Empleado> listEmpleados;
    private Horno horno;
    private List<Evento> listEventos;
    private Long cantidadStockProductos;
    private String infoEvento;
    private Long cantClientesSistema;
    private Long cantClientesPerdidos;
    DateTimeFormatter formatter;
    NumberFormat formatPorcentaje;

    public VectorEstado() {
        nroFila = 1l;
        formatPorcentaje = NumberFormat.getPercentInstance(Locale.US);
        formatPorcentaje.setMinimumFractionDigits(4);
        formatPorcentaje.setMaximumFractionDigits(4);
        formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        listEmpleados = new ArrayList<Empleado>(0);
        listEventos = new ArrayList<Evento>(0);
        infoEvento = "";
        cantClientesSistema = 0l;
        cantClientesPerdidos = 0l;
    }

    public void notificarClientesEnEsperaDeProductos() {
        cola.notificarClientesEnEsperaDeProductos();
        List<Evento> list = listEventos
                .stream()
                .filter(p -> p.getTipoEvento().equals(TipoEvento.ESPERA_CLIENTE_AGOTADA))
                .collect(Collectors.toList());
        listEventos.removeAll(list);
    }

    public EstadoServidor getEstadoEmpleado(int idEmpleado) {
        return listEmpleados
                .stream()
                .filter(p -> p.getId() == idEmpleado)
                .map(p -> p.getEstado())
                .findFirst()
                .orElse(null);
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

    public Object[] getFilaImprimir() {
        Object[] result = new Object[19];
        result[0] = nroFila;
        result[1] = getReloj().format(formatter);
        result[2] = getEventoActual().getTipoEvento().name();
        result[3] = getInfoEvento();
        
        Evento eventoProximaLLegadaCliente = listEventos
                .stream()
                .filter(p -> p.getTipoEvento().equals(TipoEvento.LLEGADA_CLIENTE))
                .findFirst()
                .orElse(null);

        if (eventoProximaLLegadaCliente != null) {
            result[4] = eventoProximaLLegadaCliente.getMomentoOcurrencia().format(formatter);
        } else {
            result[4] = "-";
        }
        
        result[5] = cola.getTamanoCola();
        result[6] = cola.getOrdenClientesEnCola();
        result[7] = getCantidadStockProductos();
        result[8] = getEstadoEmpleado(1).name();
        
        Empleado empleado1 = listEmpleados
                .stream()
                .filter(p -> p.getId() == 1)
                .findFirst()
                .orElse(null);

        if (empleado1 == null || empleado1.getMomentoFinAtencion() == null) {
            result[9] = "-";
        } else {
            result[9] = empleado1.getMomentoFinAtencion().format(formatter);
        }
        
        result[10] = getEstadoEmpleado(2).name();
        
        Empleado empleado2 = listEmpleados
                .stream()
                .filter(p -> p.getId() == 2)
                .findFirst()
                .orElse(null);

        if (empleado2 == null || empleado2.getMomentoFinAtencion() == null) {
            result[11] = "-";
        } else {
            result[11] = empleado2.getMomentoFinAtencion().format(formatter);
        }
        
        result[12] = horno.getEstado().name();
        
        
        Evento eventoInicioCoccion = listEventos
                .stream()
                .filter(p -> p.getTipoEvento().equals(TipoEvento.INICIO_COCCION))
                .findFirst()
                .orElse(null);

        if (eventoInicioCoccion != null) {
            result[13] = eventoInicioCoccion.getMomentoOcurrencia().format(formatter);
        } else {
            result[13] = "-";
        }

        result[14] = horno.getMomentoFinCoccion() != null ? horno.getMomentoFinCoccion().format(formatter) : "";
        result[15] = horno.getCantidadCocinar();
        result[16] = getCantClientesSistema();
        result[17] = getCantClientesPerdidos();
        result[18] = formatPorcentaje.format(getPorcClientesPerdidos());
        
        return result;
    }
    
    public DefaultTableModel getTableModel() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Fila");
        tableModel.addColumn("Reloj");
        tableModel.addColumn("Evento");
        tableModel.addColumn("Info Evento");
        tableModel.addColumn("Prox Lleg Cli");
        tableModel.addColumn("Cola");
        tableModel.addColumn("Orden Cola");
        tableModel.addColumn("Stock");
        tableModel.addColumn("Empl 1 - Estado");
        tableModel.addColumn("Empl 1 - Prox Fin Ate");
        tableModel.addColumn("Empl 2 - Estado");
        tableModel.addColumn("Empl 2 - Prox Fin Ate");
        tableModel.addColumn("Horno - Estado");
        tableModel.addColumn("Horno - Prox Ini Cocci\u00f3n");
        tableModel.addColumn("Horno - Prox Fin Cocci\u00f3n");
        tableModel.addColumn("Horno - Cant Cocinar");
        tableModel.addColumn("Total Clientes");
        tableModel.addColumn("Total Perdidos");
        tableModel.addColumn("% Perdidos");
        return tableModel;
    }

    public void addEmpleado(Empleado empleado) {
        listEmpleados.add(empleado);
    }

    public void addEvento(Evento evento) {
        listEventos.add(evento);
    }
    
        public Long getNroFila() {
        return nroFila;
    }

    public void setNroFila(Long nroFila) {
        this.nroFila = nroFila;
    }

    public LocalDateTime getReloj() {
        return reloj;
    }

    public void setReloj(LocalDateTime reloj) {
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

    public Long getCantClientesSistema() {
        return cantClientesSistema;
    }

    public void setCantClientesSistema(Long cantClientesSistema) {
        this.cantClientesSistema = cantClientesSistema;
    }

    public Long getCantClientesPerdidos() {
        return cantClientesPerdidos;
    }

    public void setCantClientesPerdidos(Long cantClientesPerdidos) {
        this.cantClientesPerdidos = cantClientesPerdidos;
    }

    public Double getPorcClientesPerdidos() {
        if(cantClientesSistema == 0)
            return 0d;
        return cantClientesPerdidos.doubleValue() / cantClientesSistema.doubleValue();
    }

}
