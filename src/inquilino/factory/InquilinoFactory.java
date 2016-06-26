package inquilino.factory;

import inquilino.factory.interfaz.InquilinoCreable;

public class InquilinoFactory {
	public enum TipoInquilino {
		INQUILINO_PARTICULAR, INQUILINO_EMPRESA
	};

	public InquilinoCreable newInstance(String nombre, String codigo, TipoInquilino tipoInquilino){
		InquilinoCreable inquilino = null;
		double descuento = 0.0; 
		
		switch (tipoInquilino) {
		case INQUILINO_PARTICULAR:
			inquilino = new InquilinoParticular(nombre, codigo, descuento); 
			break;

		case INQUILINO_EMPRESA:
			descuento = 0.1; 
			inquilino = new InquilinoEmpresa(nombre, codigo, descuento); 
			break;
		}
		
		return inquilino; 
	}
}// fin class InquilinoFactory
