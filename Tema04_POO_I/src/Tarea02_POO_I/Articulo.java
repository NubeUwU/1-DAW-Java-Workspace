package Tarea02_POO_I;

public class Articulo {

	private String codigoBarras="";
	private String denominacion="";
	private int unidades=0;
	private double precioCompra=0;
	private int beneficio=0;
	
	
	public String getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public String getDenominacion() {
		return denominacion;
	}


	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public int getBeneficio() {
		return beneficio;
	}


	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}

	public Articulo(String codigoBarras, String denominacion, int unidades, double precioCompra, int beneficio) {
		super();
		this.codigoBarras = codigoBarras;
		this.denominacion = denominacion;
		this.unidades = unidades;
		this.precioCompra = precioCompra;
		this.beneficio = beneficio;
	}	
	
	@Override
	public String toString() {
		return "Articulo [codigoBarras=" + codigoBarras + ", denominacion=" + denominacion + ", unidades=" + unidades
				+ ", precioCompra=" + precioCompra + ", beneficio=" + beneficio + "]";
	}
		
	public double pvp() {
        return (precioCompra - ((precioCompra * beneficio) / 100));
        
    }

}
