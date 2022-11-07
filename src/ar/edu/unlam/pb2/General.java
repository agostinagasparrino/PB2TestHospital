package ar.edu.unlam.pb2;

public class General extends Paciente{

	public General(Integer historiaClinica, Integer dni, String nombre, String apellido) {
		super(historiaClinica, dni, nombre, apellido);
	}

	@Override
	public Boolean alimentar(Plato plato) {
		return true;
	}

}
