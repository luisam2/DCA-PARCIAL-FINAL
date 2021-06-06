package modelo;

import java.util.List;
import processing.core.PApplet;

public class Marco implements Runnable {
	
	PApplet app;
	private float posX, posY, velX, velY, dirX, dirY, radio;
	private boolean Acercar;
	private float r, g, b;

	public Marco(PApplet app, float posX, float posY, float velX, float velY ) {
	
		this.app=app;
	
		this.setPosX(posX);
		this.setPosY(posY);
		
		radio = 40;
		
		velX=2;
		velY=2;
		
		dirX=app.width/2;
		dirY=app.height/2;
	
		Acercar = false;
		
	}


	public void run () {
		
		while(true) {
			try {
				Thread.sleep(1000);
				Acercar = true;
				Thread.sleep(1000);
				Acercar = false;
				
			} catch (Exception e) {
				
		}
	}
	
}


public void PintarMarco() {
		
		app.fill(r,g,b);
		app.ellipse(getPosX(), getPosY(), radio, radio);
		app.text("MARCO", getPosX()-10, getPosY()+10);
		
	}

public void moverse() {
	
	this.setPosX(velY + this.getPosy());
	//System.out.println(velY+" "+this.getPosy());
	if (this.getPosy() >= 800 || this.getPosy() <= 0) {
		velY= velY * -1;
	}
	this.setPosX(velX + this.getPosy());
	//System.out.println(velX+" "+this.getPosx());
	if (this.getPosy() >= 800 || this.getPosy() <= 0) {
		velX = velX * -1;
	}
}	


	private void setPosX(float f) {
	// TODO Auto-generated method stub
	
}


	private int getPosy() {
	// TODO Auto-generated method stub
	return 0;
}


	public float getDirX() {
		return dirX;
	}


	public void setDirX(float dirX) {
		this.dirX = dirX;
	}


	public float getDirY() {
		return dirY;
	}


	public void setDirY(float dirY) {
		this.dirY = dirY;
	}

	public boolean acercarActivado() {
		return Acercar;
	}

	public void setAcercar(boolean setAcercar) {
		this.Acercar = Acercar;
	}


	public float getPosX() {
		return posX;
	}


	public float getPosY() {
		return posY;
	}


	public void setPosY(float posY) {
		this.posY = posY;
	}


	
	
}//final
