package PaSkCode;
import java.util.ArrayList;


public class PSysModel {
    // ArrayList or similar of particles
    // each particle: x, y, velX, velY, radius
	public ArrayList<Particle> particleList;
	
    PSysModel() {
	// instantiate list of particles
    	particleList = new ArrayList<Particle>();
    }

    // add a particle to list
    void add(int rad, int x, int y, int vx, int vy) {
    	Particle particles = new Particle(rad,x,y,vx,vy);
    	particleList.add(particles);
    }


    // update state of each particle in list
    void update(int bw, int bh) {

    	for(Particle particles : particleList){

            particles.setX( particles.getX() + particles.getVelX() );
            particles.setY( particles.getY() + particles.getVelY() );

            if (particles.getX() >= bw-particles.getRadius() && particles.getVelX() > 0) {
                particles.setVelX(- particles.getVelX());
            }
            else if (particles.getX() < particles.getRadius() && particles.getVelX() < 0) { 
                particles.setVelX(- particles.getVelX());
            }

            if (particles.getY() >= bh-particles.getRadius() && particles.getVelY() > 0) {
                particles.setVelY(-particles.getVelY());
            }
            else if (particles.getY() < particles.getRadius() && particles.getVelY() < 0) {
                particles.setVelY(-particles.getVelY());
            }   

        }
    }

}
