package logica;

import java.util.Observable;

public class Parcial extends Observable {
	private Figura figura;
	
	public Parcial() {
		this.figura=null;
	}
	
	public void insertarFigura(int r, int g, int b) {
		Figura nuevaFigura = new Figura(r, g, b);
	}




}
