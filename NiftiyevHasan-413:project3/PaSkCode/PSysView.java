package PaSkCode;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class PSysView {
    
    PSysView() {
    }

    // draw all particles in psm
    void draw(PSysModel psm, Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        for (Particle particles : psm.particleList){
            
            g2d.setColor(Color.RED);
            g2d.fillOval(particles.getX() - particles.getRadius(),
            			 particles.getY() - particles.getRadius(), particles.getRadius() * 2, particles.getRadius() * 2);

        }
    }

    // dump information on all particles in psm
    void dump(PSysModel psm, int lc) {

    	   System.out.println("Frame " + lc);
        
        for (Particle particles: psm.particleList){
        	System.out.println(particles.getRadius() + "\t" + particles.getX() + "\t" + particles.getY() + "\t" + particles.getVelX() + "\t" + particles.getVelY());
        }
	    //System.out.println(radius + " " + px + " " + py + " " + velX + " " + velY);

    }
}
