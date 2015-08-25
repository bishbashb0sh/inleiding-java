package h01;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Applet_voornaam extends Applet {

	      public void init() {
		  setSize(400, 400);
		  setBackground(Color.white);}

	      public void paint(Graphics g) {
		  g.setColor(Color.blue);
		  g.drawString("Bilal", 50, 60 );
		  g.setColor(Color.red);
		  g.drawString("Sahraoui", 50, 70 );
	      }
}