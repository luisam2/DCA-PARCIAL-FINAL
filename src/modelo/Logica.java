package modelo;

import java.util.ArrayList;
import java.util.List;

import excepciones.Atrapado;
import processing.core.PApplet;

public class Logica implements Runnable{

	private PApplet app;
	private List<Marco> marcos;
	private int iF;
	private int sA;
	private int rE;
	
	
	public Logica(PApplet app) {
		this.app = app;
		}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
		
	

	

	
//METODO RUN
	
	/***
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			for (int i = 0; i < marcos.size(); i++) {
				
				Marco b = marcos.get(i);
				b.moverse();
				try {
			
				} catch (Atrapado e) {
			
					System.out.println(e.getMessage());
				}
				}
				
				
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}***/
	
	

		
		
	
	
}//final
