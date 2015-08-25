package h01;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class Show extends Applet {

		  public void init() {
			  setBackground(Color.blue);
		  }

		  public void paint(Graphics g) {
			  g.setColor(Color.yellow);
			  g.drawString("Bilal Sahraoui", 50, 60 );
		  }
		}