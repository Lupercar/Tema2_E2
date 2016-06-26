package inquilino.factory;

//Descuento del 10% 
public class InquilinoEmpresa extends Inquilino {

	public InquilinoEmpresa() {
		this("", "", 0.1); 
	}

	public InquilinoEmpresa(String nombre, String codigo, double descuento) {
		super(nombre, codigo, descuento);
		// TODO Auto-generated constructor stub
	}
	
}
