/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion.tp.panaderia;

/**
 *
 * @author juan
 */
public class Configuracion {
    
	private static Configuracion configuracion;
	
	private Double mediaMinutosLlegadaClientes;
	private int cantidadEmpleados;
	private Double minutosAtencionEmpleadosA;
	private Double minutosAtencionEmpleadosB;
	private Long cantidadMinCompraCliente;
	private Long cantidadMaxCompraCliente;
	private Double minutosTemperaturaMaximaHorno;
	private Long diasSimular;
	private Double productosCompraClienteA;
	private Double productosCompraClienteB;
	private Long cantidadStockProductosInicial;
	private Double minutosMaxExperaPorNuevosProductos;
	private Double minutosEntreEncendidosHorno;
	private Double temperaturaInicialHorno;
	private Long cantProductosCocinarSiHayStock;
	private Long cantProductosCocinarSiNoHayStock;
	private Double hRoungeKuttaHorno;
	
	public Configuracion() {
		mediaMinutosLlegadaClientes = 3d;
		cantidadEmpleados = 2;
		minutosAtencionEmpleadosA = 0.5d;
		minutosAtencionEmpleadosB = 1.5d;
		cantidadMinCompraCliente = 1l;
		cantidadMaxCompraCliente = 3l;
		minutosTemperaturaMaximaHorno = 15d;
		diasSimular = 2l;
		cantidadStockProductosInicial = 15l;
		minutosMaxExperaPorNuevosProductos = 5d;
		minutosEntreEncendidosHorno = 45d;
		temperaturaInicialHorno = 5d;
		cantProductosCocinarSiHayStock = 30l;
		cantProductosCocinarSiNoHayStock = 45l;
		hRoungeKuttaHorno = 0.5d;
	}
		
	public static Configuracion getInstance() {
		if(configuracion == null)
			configuracion = new Configuracion();
		
		return configuracion;
	}

	public Double getMediaMinutosLlegadaClientes() {
		return mediaMinutosLlegadaClientes;
	}

	public void setMediaMinutosLlegadaClientes(Double mediaMinutosLlegadaClientes) {
		this.mediaMinutosLlegadaClientes = mediaMinutosLlegadaClientes;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	public Double getMinutosAtencionEmpleadosA() {
		return minutosAtencionEmpleadosA;
	}

	public void setMinutosAtencionEmpleadosA(Double minutosAtencionEmpleadosA) {
		this.minutosAtencionEmpleadosA = minutosAtencionEmpleadosA;
	}

	public Double getMinutosAtencionEmpleadosB() {
		return minutosAtencionEmpleadosB;
	}

	public void setMinutosAtencionEmpleadosB(Double minutosAtencionEmpleadosB) {
		this.minutosAtencionEmpleadosB = minutosAtencionEmpleadosB;
	}

	public Long getCantidadMinCompraCliente() {
		return cantidadMinCompraCliente;
	}

	public void setCantidadMinCompraCliente(Long cantidadMinCompraCliente) {
		this.cantidadMinCompraCliente = cantidadMinCompraCliente;
	}

	public Long getCantidadMaxCompraCliente() {
		return cantidadMaxCompraCliente;
	}

	public void setCantidadMaxCompraCliente(Long cantidadMaxCompraCliente) {
		this.cantidadMaxCompraCliente = cantidadMaxCompraCliente;
	}

	public Double getMinutosTemperaturaMaximaHorno() {
		return minutosTemperaturaMaximaHorno;
	}

	public void setMinutosTemperaturaMaximaHorno(Double minutosTemperaturaMaximaHorno) {
		this.minutosTemperaturaMaximaHorno = minutosTemperaturaMaximaHorno;
	}

	public Long getDiasSimular() {
		return diasSimular;
	}

	public void setDiasSimular(Long diasSimular) {
		this.diasSimular = diasSimular;
	}

	public Double getProductosCompraClienteA() {
		return productosCompraClienteA;
	}

	public void setProductosCompraClienteA(Double productosCompraClienteA) {
		this.productosCompraClienteA = productosCompraClienteA;
	}

	public Double getProductosCompraClienteB() {
		return productosCompraClienteB;
	}

	public void setProductosCompraClienteB(Double productosCompraClienteB) {
		this.productosCompraClienteB = productosCompraClienteB;
	}

	public Long getCantidadStockProductosInicial() {
		return cantidadStockProductosInicial;
	}

	public void setCantidadStockProductosInicial(Long cantidadStockProductosInicial) {
		this.cantidadStockProductosInicial = cantidadStockProductosInicial;
	}

	public Double getMinutosMaxExperaPorNuevosProductos() {
		return minutosMaxExperaPorNuevosProductos;
	}

	public void setMinutosMaxExperaPorNuevosProductos(Double minutosMaxExperaPorNuevosProductos) {
		this.minutosMaxExperaPorNuevosProductos = minutosMaxExperaPorNuevosProductos;
	}

	public Double getMinutosEntreEncendidosHorno() {
		return minutosEntreEncendidosHorno;
	}

	public void setMinutosEntreEncendidosHorno(Double minutosEntreEncendidosHorno) {
		this.minutosEntreEncendidosHorno = minutosEntreEncendidosHorno;
	}

	public Double getTemperaturaInicialHorno() {
		return temperaturaInicialHorno;
	}

	public void setTemperaturaInicialHorno(Double temperaturaInicialHorno) {
		this.temperaturaInicialHorno = temperaturaInicialHorno;
	}

	public Long getCantProductosCocinarSiHayStock() {
		return cantProductosCocinarSiHayStock;
	}

	public void setCantProductosCocinarSiHayStock(Long cantProductosCocinarSiHayStock) {
		this.cantProductosCocinarSiHayStock = cantProductosCocinarSiHayStock;
	}

	public Long getCantProductosCocinarSiNoHayStock() {
		return cantProductosCocinarSiNoHayStock;
	}

	public void setCantProductosCocinarSiNoHayStock(Long cantProductosCocinarSiNoHayStock) {
		this.cantProductosCocinarSiNoHayStock = cantProductosCocinarSiNoHayStock;
	}

	public Double gethRoungeKuttaHorno() {
		return hRoungeKuttaHorno;
	}

	public void sethRoungeKuttaHorno(Double hRoungeKuttaHorno) {
		this.hRoungeKuttaHorno = hRoungeKuttaHorno;
	}

}
