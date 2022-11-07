package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHospital {

	@Test
	public void queSeCreaUnPlato() {
		Plato plato1 = new Plato ();
		Ingrediente vacio = new Ingrediente (tipo.carneRoja, coccion.horno);
		Ingrediente papas = new Ingrediente (tipo.verdura, coccion.horno);
		
		plato1.agregarIngrediente(vacio);
		plato1.agregarIngrediente(papas);
		
		Integer valorEsperado = 2;
		Integer valorObtenido = plato1.cantidadDeIngredientesEnElPlato();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSeCreaUnMenu() {
		Plato plato1 = new Plato ();
		Ingrediente vacio = new Ingrediente (tipo.carneRoja, coccion.horno);
		Ingrediente papas = new Ingrediente (tipo.verdura, coccion.horno);
		
		plato1.agregarIngrediente(vacio);
		plato1.agregarIngrediente(papas);
		
		Plato plato2 = new Plato ();
		Ingrediente pan = new Ingrediente (tipo.harina, coccion.horno);
		Ingrediente ensalada = new Ingrediente (tipo.verdura, coccion.crudo);
		
		plato1.agregarIngrediente(pan);
		plato1.agregarIngrediente(ensalada);
		
		Menu menuDeOctubre = new Menu ();
		menuDeOctubre.agregarPlato(plato1);
		menuDeOctubre.agregarPlato(plato2);
		
		Integer valorEsperado = 2;
		Integer valorObtenido = menuDeOctubre.cantidadDePlatos();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queSeCreaUnPacienteDiabetico() {
		Diabetico paciente1 = new Diabetico (001, 37931874, "Matias", "Gomez", gradoDeDiabetes.tipo1);
		assertNotNull(paciente1);
	}
	
	@Test
	public void queSeLeDaInsulinaAUnPacienteDiabetico() {
		Diabetico paciente1 = new Diabetico (001, 37931874, "Matias", "Gomez", gradoDeDiabetes.tipo1);
		
		assertTrue(paciente1.aplicarInsulina());
	}
	
	@Test
	public void queNoSeLeDaInsulinaAUnPacienteDiabeticoTipo2() {
		Diabetico paciente1 = new Diabetico (001, 37931874, "Matias", "Gomez", gradoDeDiabetes.tipo2);
		
		assertFalse(paciente1.aplicarInsulina());
	}
	
	@Test
	public void queNoSeLeDaInsulinaAUnPacienteDiabeticoMasDeDosVeces() {
		Diabetico paciente1 = new Diabetico (001, 37931874, "Matias", "Gomez", gradoDeDiabetes.tipo1);
		
		paciente1.aplicarInsulina();
		paciente1.aplicarInsulina();
		
		assertFalse(paciente1.aplicarInsulina());
	}

	@Test
	public void queUnPacienteDiabeticoNoPuedaComerUnPlatoConAzucar() {
		Diabetico paciente1 = new Diabetico (001, 37931874, "Matias", "Gomez", gradoDeDiabetes.tipo1);
		
		Plato ensaladaDeFrutas = new Plato ();
		Ingrediente fruta = new Ingrediente (tipo.fruta, coccion.crudo);
		Ingrediente azucar = new Ingrediente (tipo.azucar, coccion.crudo);
		
		
		ensaladaDeFrutas.agregarIngrediente(fruta);
		ensaladaDeFrutas.agregarIngrediente(azucar);
		
		assertFalse(paciente1.alimentar(ensaladaDeFrutas));
	}
	
	@Test
	public void queUnPacienteOncologicoNoPuedaComerUnPlatoConAlimentosCrudos() {
		Oncologico paciente1 = new Oncologico (001, 37931874, "Matias", "Gomez");
		
		Plato ensaladaDeFrutas = new Plato ();
		Ingrediente fruta = new Ingrediente (tipo.fruta, coccion.crudo);
		Ingrediente azucar = new Ingrediente (tipo.azucar, coccion.crudo);
		
		
		ensaladaDeFrutas.agregarIngrediente(fruta);
		ensaladaDeFrutas.agregarIngrediente(azucar);
		
		assertFalse(paciente1.alimentar(ensaladaDeFrutas));
	}
	
	@Test
	public void queUnPacienteCeliacoNoConsumaHarinas() {
		Celiaco paciente1 = new Celiaco (001, 37931874, "Matias", "Gomez");
		
		Plato pizza = new Plato ();
		Ingrediente masa = new Ingrediente (tipo.harina, coccion.horno);
		Ingrediente salsaDeTomate = new Ingrediente (tipo.verdura, coccion.crudo);
		Ingrediente queso = new Ingrediente (tipo.lacteo, coccion.crudo);
		
		
		pizza.agregarIngrediente(masa);
		pizza.agregarIngrediente(salsaDeTomate);
		pizza.agregarIngrediente(queso);
		
		assertFalse(paciente1.alimentar(pizza));
	}
	
	@Test
	public void queUnPacienteHipertensoNoConsumaSal() {
		Hipertenso paciente1 = new Hipertenso (001, 37931874, "Matias", "Gomez");
		
		Plato pizza = new Plato ();
		Ingrediente masa = new Ingrediente (tipo.harina, coccion.horno);
		Ingrediente salsaDeTomate = new Ingrediente (tipo.verdura, coccion.crudo);
		Ingrediente queso = new Ingrediente (tipo.lacteo, coccion.crudo);
		Ingrediente sal = new Ingrediente (tipo.sal, coccion.crudo);
		
		
		pizza.agregarIngrediente(masa);
		pizza.agregarIngrediente(salsaDeTomate);
		pizza.agregarIngrediente(queso);
		pizza.agregarIngrediente(sal);
		
		assertFalse(paciente1.alimentar(pizza));
	}
	
	@Test
	public void queUnPacienteGeneralPuedeComerCualquierAlimento() {
		General paciente1 = new General (001, 37931874, "Matias", "Gomez");
		
		Plato pizza = new Plato ();
		Ingrediente masa = new Ingrediente (tipo.harina, coccion.horno);
		Ingrediente salsaDeTomate = new Ingrediente (tipo.verdura, coccion.crudo);
		Ingrediente queso = new Ingrediente (tipo.lacteo, coccion.crudo);
		Ingrediente sal = new Ingrediente (tipo.sal, coccion.crudo);
		
		
		pizza.agregarIngrediente(masa);
		pizza.agregarIngrediente(salsaDeTomate);
		pizza.agregarIngrediente(queso);
		pizza.agregarIngrediente(sal);
		
		assertTrue(paciente1.alimentar(pizza));
	}

}
