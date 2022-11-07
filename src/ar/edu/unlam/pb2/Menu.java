package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Menu {
	private ArrayList <Plato> platosDelMenu = new ArrayList <Plato>();
	
	public void agregarPlato(Plato platoDelMenu) {
		platosDelMenu.add(platoDelMenu);
	}

	public Integer cantidadDePlatos() {
		return platosDelMenu.size();
	}

}
