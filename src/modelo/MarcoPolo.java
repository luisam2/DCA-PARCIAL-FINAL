package modelo;
import processing.core.PApplet;
import processing.core.PImage;

public abstract class MarcoPolo {


	private int posx;
	private int posy;

	
	public MarcoPolo (int px, int py){
		posx = px;
		posy = py;
	}
	
	
	public abstract void moverse();

	public abstract void pintar();

	public int getPosx() {
		return posx;
	}

	public void setPosx(int posx) {
		this.posx = posx;
	}

	public int getPosy() {
		return posy;
	}

	public void setPosy(int posy) {
		this.posy = posy;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	

}//final
