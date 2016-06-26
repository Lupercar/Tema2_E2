package piso;

public class Piso {
	private int numeroPlanta;
	private String numeroPuerta;
	private double precioBaseMensual;

	public Piso() {
		this(0, "", 0d);
	}

	public Piso(int planta, String puerta, double precio) {
		super();
		this.setNumeroPlanta(planta);
		this.setNumeroPuerta(puerta);
		this.setPrecioBaseMensual(precio);
	}

	public int getNumeroPlanta() {
		return numeroPlanta;
	}

	public void setNumeroPlanta(int numeroPlanta) {
		this.numeroPlanta = numeroPlanta;
	}

	public String getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(String numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public double getPrecioBaseMensual() {
		return precioBaseMensual;
	}

	public void setPrecioBaseMensual(double precioBaseMensual) {
		this.precioBaseMensual = precioBaseMensual;
	}
	
	@Override
	public String toString() {
		return 	this.getNumeroPlanta() + "/" + 
				this.getNumeroPuerta() + "/" + 
				this.getPrecioBaseMensual() + "euros.";
	}
}// fin class Piso
