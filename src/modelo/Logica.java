package modelo;

import java.util.ArrayList;
import java.util.List;
import processing.core.PApplet;

public class Logica implements Runnable{

	private PApplet app;
	private List<Marco> marcos = new ArrayList<Marco>();;
	private ArrayList<Polo> polos = new ArrayList<Polo>();
	
	/***public Logica(PApplet app) {
		
		this.app = app;
		marcos.add(new Marco(app, 15, 20, 5, 5));
	
		for (int i = 0; i < 20; i++) {
			polos.add(new Polo(app,(int) app.random(app.width),(int) app.random(app.height)));
		}

	} ***/

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
