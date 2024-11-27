package control;

import logica.Figura;
import logica.Parcial;
import presentacion.PFormulario;
import presentacion.PLienzo;


public class Controlador {
	private Parcial parcial;
	private PFormulario pFormulario;
	private Figura figura;
	
	public Controlador(PFormulario pFormulario) {
		this.pFormulario=pFormulario;
		this.parcial= new Parcial();
		this.parcial.addObserver(this.pFormulario.getfParcial().getpLienzo());
		
	}
	
	public void insertarCuadrado(int r, int g, int b) {

		this.parcial.insertarFigura(r, g, b);
	}
	
	public void insertarCirculo(int r, int g, int b) {
		this.parcial.insertarFigura(r, g, b);
	}
	
}
