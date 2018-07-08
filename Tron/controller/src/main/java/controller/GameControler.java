package controller;
/**
 * <h1>The Contrller Class</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
import model.ITronModel;
import view.IView;

public class GameControler implements IController {
	
	IView view ;
	ITronModel model;
	/*
	 * Constructor
	 * @param Model , View
	 * 
	 * 
	 */
	public GameControler(ITronModel model , IView view) {
		this.model=model;
		this.view=view;
		
		
		
	}
	
	/*
	 * play the game
	 * 
	 * 
	 * (non-Javadoc)
	 * @see controller.IController#play()
	 */
	
	
	public void play(){
		// tant que les deux joueurs de sont pas morts
		while(model.getGrid().getRider1().isAlive() && model.getGrid().getRider2().isAlive()) {
			//on bouge le rider 1
			model.getGrid().getRider1().move();
			//si il est mort 
			if(model.getGrid().getRider1().isAlive() == false)
				//on affiche le message
				this.view.displayMessage("Rider 2 Win (Blue)");
			
			
			
			// pareil pour le rider 2
			model.getGrid().getRider2().move();
			if(model.getGrid().getRider2().isAlive() == false)
				this.view.displayMessage("Rider 1 Win (Red) ");
			try {
				//Boucle de temps de jeu
				Thread.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
