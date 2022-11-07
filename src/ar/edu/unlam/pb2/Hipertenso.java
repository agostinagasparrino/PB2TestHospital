package ar.edu.unlam.pb2;

public class Hipertenso extends Paciente {

	public Hipertenso(Integer historiaClinica, Integer dni, String nombre, String apellido) {
		super(historiaClinica, dni, nombre, apellido);
	}

	@Override
	public Boolean alimentar(Plato plato) {
		if(plato.contieneSal()== true) {
			return false;
		}
		return true;
	}

}
