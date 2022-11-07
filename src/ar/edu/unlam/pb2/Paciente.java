package ar.edu.unlam.pb2;

public abstract class Paciente {
	private Integer historiaClinica;
	private Integer dni;
	private String nombre;
	private String apellido;

	public Paciente(Integer historiaClinica, Integer dni, String nombre, String apellido) {
		this.historiaClinica = historiaClinica;
		this.dni = dni;
		this.nombre =  nombre;
		this.apellido = apellido;
	}
	
	abstract public Boolean alimentar(Plato plato);


}
