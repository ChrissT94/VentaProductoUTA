package org.uta.ventas.model;

public class Producto {
	
	private int codigoProducto;
	private String nombreProducto;
	private String descripcionProducto;
	private OrigenEnum origen;
	private int precioVentaProducto;
	private int stockProducto;
	
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	
	public OrigenEnum getOrigen() {
		return origen;
	}
	
	public void setOrigen(OrigenEnum origen) {
		this.origen = origen;
	}
	
	public int getPrecioVentaProducto() {
		return precioVentaProducto;
	}
	
	public void setPrecioVentaProducto(int precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}
	
	public int getStockProducto() {
		return stockProducto;
	}
	
	public void setStockProducto(int stockProducto) {
		this.stockProducto = stockProducto;
	}
	
	
}
