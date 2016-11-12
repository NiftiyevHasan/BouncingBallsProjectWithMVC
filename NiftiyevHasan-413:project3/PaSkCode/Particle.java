package PaSkCode;


public class Particle{

	private int radius, x , y , velX, velY;

	Particle(int rad, int x , int y, int velX, int velY){
		this.radius = rad;
		this.x = x;
		this.y = y;
		this.velX = velX;
		this.velY = velY;
	}

	// Accessors

	public int getRadius(){
		return radius;
	}


	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public int getVelX(){
		return velX;
	}

	public int getVelY(){
		return velY;
	}

	// Mutators

	public void setRadius(int radius ){
		this.radius = radius;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setVelX(int velX){
		this.velX = velX;
	}

	public void setVelY(int velY){
		this.velY = velY;
	}

	
	public String toString(){
		return ("Particle:\t" + radius + "\t" + x + "\t" + y + "\t" + velX +
									 "\t" + velY + "\t");
	}

}
