package interfaces;

public class MainPersona {

	public static void main(String[] args) {
		
		//vamos a crear objetos de las distintas clases 
		
		Alumno a = new Alumno("Ana",2000,0,"primero");
		Profesor b = new Profesor (1600.00,"Andres",1972,100);
		Profesor_descuento c = new Profesor_descuento();
		Alumno_descuento d = new Alumno_descuento ();
		
		//imprimimos los datos de los objetos y calculamos dto definido en la clase Calcua_desto		
		System.out.println(b.toString()+". El descuento del prfesor es de: "+c.calculaDescuento(100)+
				"€");
		
		System.out.println(a.toString()+". El descuento del alumno es de: " + d.calculaDescuento(100)+
				"€");
		

	}

}
