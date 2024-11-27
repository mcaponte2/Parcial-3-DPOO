package presentacion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import control.Controlador;

public class FParcial extends JFrame{
	private PLienzo pLienzo;
	private PFormulario pFormulario;
	private Controlador controlador;
	
	public PLienzo getpLienzo() {
		return pLienzo;
	}
	
	public FParcial() {
		this.controlador=controlador;
		this.setTitle("Parcial Maria Clara Aponte");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800,800);
		this.setLayout(new BorderLayout());
		this.pLienzo = new PLienzo();
		this.pFormulario=new PFormulario(this);
		
		this.add(this.pFormulario, BorderLayout.WEST);
		this.add(this.pLienzo, BorderLayout.CENTER);
		
		
		this.setVisible(true);
	}
	
	public static void main(String[]args) {
		new FParcial();
	}

}
