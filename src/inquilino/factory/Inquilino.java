package inquilino.factory;

import inquilino.factory.interfaz.InquilinoCreable;

/*
 * La propiedad nombre representa el nombre completo
 * La propiedad codigo representa las distintas documentaciones oficiales NIF, CIF, pasaporte o lo que sea
 * Todos los tipos de inquilinos tienen un descuento, pues el cero tambien es un descuento. 
 * 
 * Aplicamos el patrón factory a esta clase base, por tanto, sus métodos públicos vienen de una interfaz
 *  llamada InquilinoCreable
 *  
 *   La interfaz la muevo a su paquete factory.interfaz
 *   
 *   Pongo la clase Inquilo como abstracta para evitar que me creen un objeto de dicha clase
 *   
 *   Creo constructor sin parámetros y con parámetros
 *   
 *   Me creo las clases hijas InquilinoParticular e InquilinoEmpresa con sus constructores
 *   
 *   Reescribo toString de Inquilino para comprobar luego en App que todo funcione chachi 
 */
abstract public class Inquilino implements InquilinoCreable {
	private String nombre;
	private String codigo;
	private double descuento;

	public Inquilino() {
		this("", "", 0);
	}

	public Inquilino(String nombre, String codigo, double descuento) {
		super();
		this.setNombre(nombre);
		this.setCodigo(codigo);
		this.setDescuento(descuento);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factory.InquilinoCreable#getNombre()
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factory.InquilinoCreable#setNombre(java.lang.String)
	 */
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factory.InquilinoCreable#getCodigo()
	 */
	@Override
	public String getCodigo() {
		return codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factory.InquilinoCreable#setCodigo(java.lang.String)
	 */
	@Override
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factory.InquilinoCreable#getDescuento()
	 */
	@Override
	public double getDescuento() {
		return descuento;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see factory.InquilinoCreable#setDescuento(double)
	 */
	@Override
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return 	"Nombre: " + this.getNombre() + 
				" Codigo: " + this.getCodigo() + 
				" Descuento: " + this.getDescuento();
	}
}// fin class Inquilino
