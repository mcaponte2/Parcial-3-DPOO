package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import control.Controlador;

public class PLienzo extends JPanel implements Observer {
	private Controlador controlador;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}


}
