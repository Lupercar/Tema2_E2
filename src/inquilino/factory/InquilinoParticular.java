package inquilino.factory;

public class InquilinoParticular extends Inquilino{
	
	//Por defecto le pongo 0% de descuento esta clase tendr� ese descuento siempre
	public InquilinoParticular() {
		this("", "", 0.0); 
	}

	public InquilinoParticular(String nombre, String codigo, double descuento) {
		super(nombre, codigo, descuento);
		// TODO Auto-generated constructor stub
	}
}//fin class InquilinoParticular
