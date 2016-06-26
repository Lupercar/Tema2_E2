package alquiler;

import java.util.Date;

import inquilino.factory.Inquilino;
import inquilino.factory.interfaz.InquilinoCreable;
import piso.Piso;

public class Alquiler {
	private Date fechaContrato;
	private InquilinoCreable inquilino;
	private Piso piso;
	private static final double IVA = 0.21; // imagino que el iva es el 21%

	public Alquiler(Date fechaContrato, InquilinoCreable inquilino, Piso piso) {
		super();
		setFechaContrato(fechaContrato);
		setInquilino(inquilino);
		setPiso(piso);
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}
	
	public InquilinoCreable getInquilino() {
		return inquilino;
	}

	public void setInquilino(InquilinoCreable inquilino) {
		this.inquilino = inquilino;
	}

	

	public double getPrecioAlquiler() {
		return piso.getPrecioBaseMensual() * (1 + IVA - inquilino.getDescuento());
	}
	
	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	@Override
	public String toString(){
		return 	"[Fecha: {" + this.getFechaContrato() + "}\n" +
				"{Inquilino: {" + this.getInquilino() + "}\n" +
				"{Piso: {" + this.getPiso() + "}\n" +
				"{Precio con IVA y descuento: {" + this.getPrecioAlquiler() + "}\n" +
				"]";
	}
}// fin class Alquiler
