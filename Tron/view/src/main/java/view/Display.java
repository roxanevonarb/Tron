package view;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.IElements;
import model.ITronModel;

public class Display extends JPanel implements Observer {
	/** The serial version. */
	private static final long serialVersionUID = 1L;
	
	/** The model. */
	private ITronModel model;
	
	
	public Display(ITronModel model) {
		this.setBackground(Color.BLACK);
		this.setVisible(true);
		System.out.println("Affichage");
		this.model = model;
		
		for (IElements entity : model.getGrid().getRider1().getParticles()) {
			((Observable) entity).addObserver(this);
			
		}
		for (IElements entity : model.getGrid().getRider2().getParticles()) {
			((Observable) entity).addObserver(this);		
		}
		
	}
	
	public void drawGrid(Graphics g)throws IOException, InterruptedException {
		
		
	}
	
	
	
	
	
	
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
			 try {
				drawGrid(g);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		this.repaint();
		
	}

}
