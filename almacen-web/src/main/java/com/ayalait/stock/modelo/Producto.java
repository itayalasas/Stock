package com.ayalait.stock.modelo;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="producto")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="codigo")
	private String codigo;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="categoria")
	private int categoria;

	@Column(name="um")
	private int um;

	@Column(name="precioventa")
	private double precioventa;

	@Column(name="cantidadminima")
	private int cantidadminima;	
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="idestado")
	private String idestado;
	
	@Column(name="idiva")
	private int idiva;
	
	@Column(name="tipoproducto")
	private int tipoproducto;
	
	@Column(name="inventariable")
	private boolean inventariable;
	
	@Column(name="disponible")
	private boolean disponible;
	
	@Column(name="imagen")
	private String imagen;
	
	
	private int cantidadResenas;
    private double promedioEstrellas;
    private int descuentoPorcentaje;

	@Column(name="marca")
	private int marca;
	
	@Column(name="modelo")
	private int modelo;
	
	private int moneda;
	
	private double preciooriginal;
	
	private int descuento;
	
	private int cuotaspago;
	
	@Column(name="porcentaje_mas_vendido")
	private double porcentajeMasVendido;
	@Column(name="posicion_mas_vendido")
	private int posicionMasVendido;
	
		
	public double getPreciooriginal() {
		return preciooriginal;
	}


	public void setPreciooriginal(double preciooriginal) {
		this.preciooriginal = preciooriginal;
	}


	public int getCuotaspago() {
		return cuotaspago;
	}


	public void setCuotaspago(int cuotaspago) {
		this.cuotaspago = cuotaspago;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public int getMarca() {
		return marca;
	}


	public void setMarca(int marca) {
		this.marca = marca;
	}


	public int getModelo() {
		return modelo;
	}


	public void setModelo(int modelo) {
		this.modelo = modelo;
	}


	public Producto() {
		super();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public int getUm() {
		return um;
	}


	public void setUm(int um) {
		this.um = um;
	}


	public double getPrecioventa() {
		return precioventa;
	}


	public void setPrecioventa(double precioventa) {
		this.precioventa = precioventa;
	}


	public int getCantidadminima() {
		return cantidadminima;
	}


	public void setCantidadminima(int cantidadminima) {
		this.cantidadminima = cantidadminima;
	}

	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getIdestado() {
		return idestado;
	}


	public void setIdestado(String idestado) {
		this.idestado = idestado;
	}


	public int getIdiva() {
		return idiva;
	}


	public void setIdiva(int idiva) {
		this.idiva = idiva;
	}


	public int getTipoproducto() {
		return tipoproducto;
	}


	public void setTipoproducto(int tipoproducto) {
		this.tipoproducto = tipoproducto;
	}


	public boolean isInventariable() {
		return inventariable;
	}


	public void setInventariable(boolean inventariable) {
		this.inventariable = inventariable;
	}


	public boolean isDisponible() {
		return disponible;
	}


	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public int getMoneda() {
		return moneda;
	}


	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}


	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	public int getCantidadResenas() {
		return cantidadResenas;
	}


	public void setCantidadResenas(int cantidadResenas) {
		this.cantidadResenas = cantidadResenas;
	}


	public double getPromedioEstrellas() {
		return promedioEstrellas;
	}


	public void setPromedioEstrellas(double promedioEstrellas) {
		this.promedioEstrellas = promedioEstrellas;
	}


	public int getDescuentoPorcentaje() {
		return descuentoPorcentaje;
	}


	public void setDescuentoPorcentaje(int descuentoPorcentaje) {
		this.descuentoPorcentaje = descuentoPorcentaje;
	}


	public double getPorcentajeMasVendido() {
		return porcentajeMasVendido;
	}


	public void setPorcentajeMasVendido(double porcentajeMasVendido) {
		this.porcentajeMasVendido = porcentajeMasVendido;
	}


	public int getPosicionMasVendido() {
		return posicionMasVendido;
	}


	public void setPosicionMasVendido(int posicionMasVendido) {
		this.posicionMasVendido = posicionMasVendido;
	}


	
	

}