package ar.edu.unlam.pb2;

public class Diabetico extends Paciente {
	private gradoDeDiabetes tipoDeDiabetes;
	private Integer cantidadDeInsulinaEnElPaciente;

	public Diabetico(Integer historiaClinica, Integer dni, String nombre, String apellido, gradoDeDiabetes tipoDeDiabetes) {
		super(historiaClinica, dni, nombre, apellido);
		this.tipoDeDiabetes = tipoDeDiabetes;
		cantidadDeInsulinaEnElPaciente = 0;
	}
	
	public Boolean aplicarInsulina() {
		if(cantidadDeInsulinaEnElPaciente <2 && gradoDeDiabetes.tipo1 == tipoDeDiabetes) {
			cantidadDeInsulinaEnElPaciente ++;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Boolean alimentar(Plato platoAConsumir) {
		if(platoAConsumir.contieneAzucar()== true) {
			return false;
		}
		return true;
	}


}
