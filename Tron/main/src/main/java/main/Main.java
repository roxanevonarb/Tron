package main;
/**
 * <h1>The Enumeration Main</h1>
 * 
 * @author Arthur-Michel
 * @version 1.0
 */
import controller.GameControler;
import controller.IController;
import model.Grid;
import model.ITronModel;
import model.TronModel;
import view.Frame;
import view.IView;

public abstract class Main {

    public static void main(final String[] args) {

    	final ITronModel model = new TronModel();
    	model.setGrid(new Grid());
    	final IView view = new Frame(model);	
    	
    	IController game = new GameControler(model, view);
    	game.play();
    	
    }

}
