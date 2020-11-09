/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Comparator;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author juan
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    Configuracion config = Configuracion.getInstance();

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {
        initComponents();

        // inicializacion
        txtMediaLlegadasClientes.setValue(config.getMediaMinutosLlegadaClientes());
        txtMinutosToleranciaClientes.setValue(config.getMinutosMaxExperaPorNuevosProductos());
        txtMinutosAtencionA.setValue(config.getMinutosAtencionEmpleadosA());
        txtMinutosAtencionB.setValue(config.getMinutosAtencionEmpleadosB());
        txtStockInicial.setValue(config.getCantidadStockProductosInicial());
        txtMinutosEntreEncendidos.setValue(config.getMinutosEntreEncendidosHorno());
        txtMinutosTemperaturaMaxima.setValue(config.getMinutosTemperaturaMaximaHorno());
        txtTemperaturaInicial.setValue(config.getTemperaturaInicialHorno());
        txtCantCocinarSiHayStock.setValue(config.getCantProductosCocinarSiHayStock());
        txtCantCocinarSiNoHayStock.setValue(config.getCantProductosCocinarSiNoHayStock());
        txtCantMaxCompraCliente.setValue(config.getCantidadMaxCompraCliente());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMediaLlegadasClientes = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMinutosToleranciaClientes = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCantMaxCompraCliente = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMinutosAtencionA = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMinutosAtencionB = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtStockInicial = new javax.swing.JFormattedTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMinutosEntreEncendidos = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMinutosTemperaturaMaxima = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTemperaturaInicial = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCantCocinarSiHayStock = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantCocinarSiNoHayStock = new javax.swing.JFormattedTextField();
        btnSimular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSimulacion = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(1, 3, 1, 0));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));
        jPanel3.setLayout(new java.awt.GridLayout(0, 2));

        jLabel7.setText("Distribucion de Llegadas");
        jPanel3.add(jLabel7);

        jLabel8.setText("Exponencial Negativa");
        jPanel3.add(jLabel8);

        jLabel5.setText("Media Llegada Clientes");
        jPanel3.add(jLabel5);

        txtMediaLlegadasClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtMediaLlegadasClientes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(txtMediaLlegadasClientes);

        jLabel10.setText("Minutos Tolerancia Clientes");
        jPanel3.add(jLabel10);

        txtMinutosToleranciaClientes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtMinutosToleranciaClientes.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(txtMinutosToleranciaClientes);

        jLabel15.setText("Cant. Max. Compra Cliente");
        jPanel3.add(jLabel15);

        txtCantMaxCompraCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCantMaxCompraCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel3.add(txtCantMaxCompraCliente);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados"));
        jPanel4.setLayout(new java.awt.GridLayout(0, 2));

        jLabel9.setText("Distribucion de Atencion");
        jPanel4.add(jLabel9);

        jLabel14.setText("Uniforme");
        jPanel4.add(jLabel14);

        jLabel11.setText("Minutos T. Atencion Distr Unif A");
        jPanel4.add(jLabel11);

        txtMinutosAtencionA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtMinutosAtencionA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtMinutosAtencionA);

        jLabel12.setText("Minutos T. Atencion Distr Unif B");
        jPanel4.add(jLabel12);

        txtMinutosAtencionB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtMinutosAtencionB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtMinutosAtencionB);

        jLabel13.setText("Stock Inicial");
        jPanel4.add(jLabel13);

        txtStockInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtStockInicial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(txtStockInicial);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Horno"));
        jPanel5.setLayout(new java.awt.GridLayout(0, 2));

        jLabel1.setText("Minutos entre Encedidos");
        jPanel5.add(jLabel1);

        txtMinutosEntreEncendidos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtMinutosEntreEncendidos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(txtMinutosEntreEncendidos);

        jLabel2.setText("Minutos Temp. Maxima");
        jPanel5.add(jLabel2);

        txtMinutosTemperaturaMaxima.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtMinutosTemperaturaMaxima.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(txtMinutosTemperaturaMaxima);

        jLabel3.setText("Temp. Inicial");
        jPanel5.add(jLabel3);

        txtTemperaturaInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.000"))));
        txtTemperaturaInicial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(txtTemperaturaInicial);

        jLabel4.setText("Cant. Cocinar si Hay Stock");
        jPanel5.add(jLabel4);

        txtCantCocinarSiHayStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCantCocinarSiHayStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(txtCantCocinarSiHayStock);

        jLabel6.setText("Cant. Cocinar si NO hay Stock");
        jPanel5.add(jLabel6);

        txtCantCocinarSiNoHayStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtCantCocinarSiNoHayStock.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(txtCantCocinarSiNoHayStock);

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1);

        btnSimular.setText("Simular");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimular);

        tablaSimulacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "5", "dcsd", null, "dfd", null, null, null, null, null, null, null, null},
                {"2", "6", "dfd", null, "dfd", null, null, null, null, null, null, null, null},
                {"3", "7", "df", null, "df", null, null, null, null, null, null, null, null},
                {"4", null, "dfd", null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Reloj", "Evento", "Proxima Lleg Cliente", "Cola Clientes", "Empl 1 - Estado", "Empl 1 - Prox Fin ate", "Empl 2 - Estado", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        jScrollPane1.setViewportView(tablaSimulacion);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        comenzarSimulacion();
    }//GEN-LAST:event_btnSimularActionPerformed

    private Long nroCliente = 0l;

    public void comenzarSimulacion() {
        nroCliente = 0l;
        VectorEstado anterior = new VectorEstado();
        VectorEstado actual = getVectorEstadoInicial();
        int nroFilaTabla = 0;

        // Seteos de la tabla
        DefaultTableModel tableModel = new DefaultTableModel();
        tablaSimulacion.setModel(tableModel);
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
        tableModel.addColumn("Horno - Prox Ini Coccion");
        tableModel.addColumn("Horno - Prox Fin Coccion");
        tableModel.addColumn("Horno - Cant Cocinar");

        // Comienza la simulacion
        while (!(actual.getEventoActual().getTipoEvento().equals(TipoEvento.FIN_SIMULACION))) {

            System.out.println(actual.getEventoActual());

            if (actual.getEventoActual().getTipoEvento().equals(TipoEvento.LLEGADA_CLIENTE)) {
                Cliente cliente = getNuevoCliente(actual.getReloj());
                actual.setInfoEvento("Cliente " + cliente.getNroCliente() + ", cantidad: " + cliente.getCantidadPedida());

                // Cuando un cliente llega, si no hay productos para vender en los próximos 5 minutos, se retira.
                if (actual.getCantidadStockProductos().equals(0l)) {
                    cliente.setMomentoEsperaAgotada(actual.getReloj().plusSeconds((long) (Configuracion.getInstance().getMinutosMaxExperaPorNuevosProductos() * 60)));
                    //
                    actual.addEvento(
                            new Evento(TipoEvento.ESPERA_CLIENTE_AGOTADA,
                                    cliente.getMomentoEsperaAgotada()));
                    //
                    actual.getCola().agregarClienteACola(cliente);
                } else {
                    if (hayEmpleadosLibres(actual)) {
                        Empleado empleado = getEmpleadoLibre(actual);
                        empleado.empezarAtenderCliente(cliente, actual);
                    } else {
                        actual.getCola().agregarClienteACola(cliente);
                    }
                }

                // genera la proxima llegada
                actual.addEvento(
                        new Evento(TipoEvento.LLEGADA_CLIENTE,
                                getMomentoProximaLlegadaCliente(actual.getReloj())));

            } else if (actual.getEventoActual().getTipoEvento().equals(TipoEvento.ESPERA_CLIENTE_AGOTADA)) {
                // Si sigue sin haber productos el cliente se va
                if (actual.getCantidadStockProductos().equals(0l)) {
                    actual.getCola().notificarEsperaClienteAgotada(actual.getReloj());
                }

            } else if (actual.getEventoActual().getTipoEvento().equals(TipoEvento.FIN_ATENCION)) {
                Empleado empleado = getEmpleadoTerminoAtender(actual);
                empleado.finalizarAtencion();

                if (actual.getCantidadStockProductos() > 0 && actual.getCola().hayClientesEnEspera()) {
                    Cliente cliente = actual.getCola().getProximoClienteAtender();
                    empleado.empezarAtenderCliente(cliente, actual);
                }

            } else if (actual.getEventoActual().getTipoEvento().equals(TipoEvento.INICIO_COCCION)) {
                actual.getHorno().empezarCoccion(actual.getCantidadStockProductos() > 0
                        ? Configuracion.getInstance().getCantProductosCocinarSiHayStock()
                        : Configuracion.getInstance().getCantProductosCocinarSiNoHayStock(),
                        actual);

            } else if (actual.getEventoActual().getTipoEvento().equals(TipoEvento.FIN_COCCION)) {
                actual.incrementarStock(actual.getHorno().getCantidadCocinar());
                actual.notificarClientesEnEsperaDeProductos();
                actual.getHorno().finalizarCoccion();

                if (actual.getCola().hayClientesEnEspera()
                        && hayEmpleadosLibres(actual)) {
                    Empleado empleado = getEmpleadoLibre(actual);
                    Cliente cliente = actual.getCola().getProximoClienteAtender();
                    empleado.empezarAtenderCliente(cliente, actual);
                }

                if (actual.getCola().hayClientesEnEspera()
                        && hayEmpleadosLibres(actual)) {
                    Empleado empleado = getEmpleadoLibre(actual);
                    Cliente cliente = actual.getCola().getProximoClienteAtender();
                    empleado.empezarAtenderCliente(cliente, actual);
                }

            }

            tableModel.insertRow(nroFilaTabla,
                     new Object[]{actual.getReloj().toString(),
                        actual.getEventoActual().getTipoEvento().name(),
                        actual.getInfoEvento(),
                        actual.getMomentoProxLlegadaCli(),
                        actual.getCola().getTamanoCola(),
                        actual.getCola().getOrdenClientesEnCola(),
                        actual.getCantidadStockProductos(),
                        actual.getEstadoEmpleado(1).name(),
                        actual.getProximoFinAteEmpleado(1),
                        actual.getEstadoEmpleado(2).name(),
                        actual.getProximoFinAteEmpleado(2),
                        actual.getHorno().getEstado().name(),
                        actual.getProximoIniCoccion(),
                        actual.getHorno().getMomentoFinCoccion(),
                        actual.getHorno().getCantidadCocinar()});
            nroFilaTabla += 1;

            // Genero el vector estado actual nuevo
            anterior = actual;
            actual = getActual(anterior);
        }

        System.out.println("Fin Simulacion!!");

    }

    private Cliente getNuevoCliente(LocalTime reloj) {
        // Mejorar esto
        Double random = GeneradorRandom.nextDouble();
        int cantidadPedida = 0;

        Double paso = 1d / Configuracion.getInstance().getCantidadMaxCompraCliente();
        Double cotaInferior = 0d;
        Double cotaSuperior = paso;
        Boolean encontroCantidad = false;

        while (!encontroCantidad) {
            cantidadPedida += 1;
            if (cotaInferior <= random && random < cotaSuperior) {
                encontroCantidad = true;
            }
            cotaInferior += paso;
            cotaSuperior += paso;
        }

        nroCliente += 1;
        return new Cliente(nroCliente, reloj, cantidadPedida);
    }

    private boolean hayEmpleadosLibres(VectorEstado vector) {
        return vector.getListEmpleados()
                .stream()
                .anyMatch(c -> c.getEstado().equals(EstadoServidor.LIBRE));
    }

    private Empleado getEmpleadoLibre(VectorEstado vector) {
        Empleado empleado = vector.getListEmpleados()
                .stream()
                .filter(c -> c.getEstado().equals(EstadoServidor.LIBRE))
                .findFirst()
                .orElse(null);

        return empleado;
    }

    public LocalTime getMomentoProximaLlegadaCliente(LocalTime reloj) {
        Double minutosHastaProximaLlegada
                = (-1 * Configuracion.getInstance().getMediaMinutosLlegadaClientes()) * Math.log(1 - GeneradorRandom.nextDouble());
        return reloj.plusSeconds((long) (minutosHastaProximaLlegada * 60));
    }

    public Empleado getEmpleadoTerminoAtender(VectorEstado actual) {
        return actual.getListEmpleados()
                .stream()
                .filter(p -> actual.getReloj().equals(p.getMomentoFinAtencion()))
                .findFirst()
                .get();
    }

    private VectorEstado getVectorEstadoInicial() {
        VectorEstado actual = new VectorEstado();
        // Setup vector estado inicial
        for (int i = 1; i <= Configuracion.getInstance().getCantidadEmpleados(); i++) {
            Empleado empleado = new Empleado(i);
            actual.addEmpleado(empleado);
        }

        actual.setCantidadStockProductos(Configuracion.getInstance().getCantidadStockProductosInicial());

        actual.setHorno(new Horno());

        actual.setCola(new Cola());

        actual.setReloj(LocalTime.ofSecondOfDay(0));
        actual.setEventoActual(
                new Evento(TipoEvento.INICIO_SIMULACION,
                        actual.getReloj()));
        actual.addEvento(
                new Evento(TipoEvento.LLEGADA_CLIENTE,
                        getMomentoProximaLlegadaCliente(actual.getReloj())));
        actual.addEvento(
                new Evento(TipoEvento.INICIO_COCCION,
                        actual.getReloj().plusSeconds((long) (Configuracion.getInstance().getMinutosEntreEncendidosHorno() * 60))));
        actual.addEvento(
                new Evento(TipoEvento.FIN_SIMULACION,
                        actual.getReloj().plusHours(23 * Configuracion.getInstance().getDiasSimular())));

        return actual;
    }

    private Evento getProximoEvento(VectorEstado vector) {
        return vector.getListEventos()
                .stream()
                .sorted(Comparator.comparing(Evento::getMomentoOcurrencia))
                .findFirst()
                .orElse(null);
    }

    private VectorEstado getActual(VectorEstado anterior) {
        VectorEstado actual = new VectorEstado();
        actual.setEventoActual(getProximoEvento(anterior));
        actual.setReloj(actual.getEventoActual().getMomentoOcurrencia());
        actual.setListEmpleados(anterior.getListEmpleados());
        actual.setHorno(anterior.getHorno());
        actual.setCola(anterior.getCola());
        actual.setListEventos(anterior.getListEventos());
        actual.getListEventos().remove(actual.getEventoActual());
        actual.setCantidadStockProductos(anterior.getCantidadStockProductos());
        return actual;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaSimulacion;
    private javax.swing.JFormattedTextField txtCantCocinarSiHayStock;
    private javax.swing.JFormattedTextField txtCantCocinarSiNoHayStock;
    private javax.swing.JFormattedTextField txtCantMaxCompraCliente;
    private javax.swing.JFormattedTextField txtMediaLlegadasClientes;
    private javax.swing.JFormattedTextField txtMinutosAtencionA;
    private javax.swing.JFormattedTextField txtMinutosAtencionB;
    private javax.swing.JFormattedTextField txtMinutosEntreEncendidos;
    private javax.swing.JFormattedTextField txtMinutosTemperaturaMaxima;
    private javax.swing.JFormattedTextField txtMinutosToleranciaClientes;
    private javax.swing.JFormattedTextField txtStockInicial;
    private javax.swing.JFormattedTextField txtTemperaturaInicial;
    // End of variables declaration//GEN-END:variables
}
