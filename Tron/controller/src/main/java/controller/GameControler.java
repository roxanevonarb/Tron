package controller;

import model.ITronModel;
import view.IView;

public class GameControler implements IController {
	
	IView view ;
	ITronModel model;
	
	public GameControler(ITronModel model , IView view) {
		this.model=model;
		this.view=view;
		
		
		
	}
	
	
	
	
	public void play(){
		model.getGrid().getRider1().move();
		model.getGrid().getRider2().move();
		
		
	}

}
