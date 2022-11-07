package ar.edu.unlam.pb2;

public class Oncologico extends Paciente{

	public Oncologico(Integer historiaClinica, Integer dni, String nombre, String apellido) {
		super(historiaClinica, dni, nombre, apellido);
	}

	@Override
	public Boolean alimentar(Plato plato) {
		if(plato.sinCoccion()== true) {
			return false;
		}
		return true;
	}

}
