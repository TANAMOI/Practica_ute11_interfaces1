package interfaces;

public class Alumno extends Persona {
	
	private String curso;
	
	public Alumno() {
		super();
		
	}
	public Alumno (String nombre,int anyoNacimiento,int productos,String curso) {
		
		super(nombre,anyoNacimiento,productos);
		this.curso=curso;
		
	}
	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}
	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String toString() {
		return "El nombre del alumno/a es "+ super.getNombre()+ " y esta cursando "+ getCurso() + " que ha nacido en el año "+super.getAnyoNacimiento();
	}
}
