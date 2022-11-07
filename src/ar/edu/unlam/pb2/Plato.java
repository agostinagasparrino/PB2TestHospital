package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Plato {
	private ArrayList <Ingrediente> ingredientesEnElPlato = new ArrayList <Ingrediente> ();

	public void agregarIngrediente(Ingrediente ingredienteParaAgregar) {
		ingredientesEnElPlato.add(ingredienteParaAgregar);
	}

	public Integer cantidadDeIngredientesEnElPlato() {
		return ingredientesEnElPlato.size();
	}

	public boolean contieneAzucar() {
		for (Ingrediente ingrediente : ingredientesEnElPlato) {
			if(ingrediente.getFamiliaDelIngrediente()==tipo.azucar) {
				return true;
			}
		}
		return false;
	}

	public boolean sinCoccion() {
		for (Ingrediente ingrediente : ingredientesEnElPlato) {
			if(ingrediente.getCoccionDelIngrediente()==coccion.crudo) {
				return true;
			}
		}
		return false;
	}

	public boolean contieneHarina() {
		for (Ingrediente ingrediente : ingredientesEnElPlato) {
			if(ingrediente.getFamiliaDelIngrediente()==tipo.harina) {
				return true;
			}
		}
		return false;
	}

	public boolean contieneSal() {
		for (Ingrediente ingrediente : ingredientesEnElPlato) {
			if(ingrediente.getFamiliaDelIngrediente()==tipo.sal) {
				return true;
			}
		}
		return false;
	}

}
