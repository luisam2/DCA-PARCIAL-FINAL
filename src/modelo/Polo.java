package modelo;


import java.util.List;
import processing.core.PApplet;


public abstract class Polo implements Runnable {
	
	PApplet app;
	private float posX, posY, velX, velY, dir, radio;
	private float r, g, b;
	private boolean atrapado;

	public Polo(PApplet app, float posX, float posY) {
		
		this.app=app;
		this.posX=posX;
		this.posY=posY;
		velX=2;
		velY=2;
		dir=(int) app.random(4);
		radio = 40;
	}

	public abstract void moverse();

	public void pintarPolo() {
		app.fill(255,0,255);//CAMBIAR
		app.ellipse(posX, posY, radio, radio);
		app.text("POLO", posX-20, posY+40);//CAMBIAR
	}

	public int getPosx() {
		return getPosx();
	}

	public void setPosx(int posx) {
		this.posX = posx;
	}

	public int getPosy() {
		return getPosy();
	}

	public void setPosy(int posy) {
		this.posY = posy;
	}

	protected abstract void atrapado(boolean c);

	
	
	

}//final
