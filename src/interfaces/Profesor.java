package interfaces;

public class Profesor extends Persona {
	
	private double salario;
	
	public Profesor() {
		super();
		
	}
	public Profesor (double salar,String nombre,int anyoNacimiento,int productos) {
		
		super(nombre, anyoNacimiento,productos);
		salario = salar;
		
	}
	/**
	 * @return the salario
	 */
	public double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		
		return "El nombre del profesor/a es " + super.getNombre()+ " que ha nacido en el año "+super.getAnyoNacimiento()
		+" y tiene un salario de "+salario;
	}
}
