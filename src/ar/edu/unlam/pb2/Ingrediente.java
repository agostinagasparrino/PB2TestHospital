package ar.edu.unlam.pb2;

public class Ingrediente {
	private tipo familiaDelIngrediente;
	private coccion coccionDelIngrediente;

	public Ingrediente(tipo familiaDelIngrediente, coccion coccionDelIngrediente) {
		this.familiaDelIngrediente = familiaDelIngrediente;
		this.coccionDelIngrediente = coccionDelIngrediente;
	}

	public tipo getFamiliaDelIngrediente() {
		return familiaDelIngrediente;
	}

	public coccion getCoccionDelIngrediente() {
		return coccionDelIngrediente;
	}

}
