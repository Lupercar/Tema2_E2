package consola;

import java.util.Date;

import alquiler.Alquiler;
import inquilino.factory.InquilinoFactory;
import inquilino.factory.InquilinoFactory.TipoInquilino;
import inquilino.factory.interfaz.InquilinoCreable;
import piso.Piso;

/*
 * Pasos:
 * 1.- Aplico patrón Factory a la clase Inquilino
 * 2.- Creo clase Piso
 * 3.- Creo clase Alquiler has-a de clases InquiloCreable y Piso
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejemplo clase Inquilino
		InquilinoFactory f = new InquilinoFactory(); 
		
		InquilinoCreable i1 = f.newInstance("Inquilino1", "3242ed3", TipoInquilino.INQUILINO_PARTICULAR); 
		InquilinoCreable i2 = f.newInstance("Inquilino2", "fdfds33", TipoInquilino.INQUILINO_EMPRESA); 
		
		System.out.println(i1);
		System.out.println(i2);
		
		//Ejemplo clase Piso
		Piso p1 = new Piso(1, "A", 200d); 
		Piso p2 = new Piso(2, "B", 230d); 
		
		System.out.println(p1);
		
		
		//Ejemplo clase alquiler
		System.out.println("");
		Alquiler al1 = new Alquiler(new Date(), i2, p1); 
		System.out.println(al1);
	}
}//fin class App
