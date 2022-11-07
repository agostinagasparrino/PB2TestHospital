package ar.edu.unlam.pb2;

public class Celiaco extends Paciente {

	public Celiaco(Integer historiaClinica, Integer dni, String nombre, String apellido) {
		super(historiaClinica, dni, nombre, apellido);
	}

	@Override
	public Boolean alimentar(Plato plato) {
		if(plato.contieneHarina()== true) {
			return false;
		}
		return true;
	}

}
