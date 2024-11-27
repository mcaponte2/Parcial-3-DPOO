package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.Controlador;

public class PFormulario extends JPanel {
	private JTextField tR;
	private JTextField tG;
	private JTextField tB;
	private JButton bCuadrado;
	private JButton bCirculo;
	private Controlador controlador;
	private FParcial fParcial;
	
	public FParcial getfParcial() {
		return fParcial;
	}
	
	public PFormulario(FParcial fParcial) {
		this.fParcial = fParcial;
		this.tR= new JTextField();
		this.tG= new JTextField();
		this.tR= new JTextField();
		this.bCuadrado= new JButton("Cuadrado");
		this.bCirculo= new JButton("Circulo");
		this.bCuadrado.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				insertarCuadrado();
			}
		});
		this.bCirculo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//insertarCirculo();
			}
		});
		
		this.controlador= new Controlador(this);
		this.setLayout(new GridLayout(4,2,10,10));
		this.add(new JLabel ("R"));
		this.add(this.tR);
		this.add(new JLabel("G"));
		this.add(this.tG);
		this.add(new JLabel("B"));
		this.add(this.tB);
		this.add(this.bCuadrado);
		this.add(this.bCirculo);
		
		}
	
	public void insertarCuadrado() {
		int RR= Integer.parseInt((this.tR.getText()));
		int GG=Integer.parseInt((this.tG.getText()));
		int BB=Integer.parseInt((this.tB.getText()));
		this.controlador.insertarCuadrado(RR, GG, BB);
	}
	
	public void intertarCirculo() {
		int RR= Integer.parseInt((this.tR.getText()));
		int GG=Integer.parseInt((this.tG.getText()));
		int BB=Integer.parseInt((this.tB.getText()));
		this.controlador.insertarCirculo(RR, GG, BB);
	}
}

