package h04;
import java.applet.Applet;
import java.awt.*;


@SuppressWarnings("serial")
public class Lijnen_Rechthoeken extends Applet {
	
	  public void init() {
		  setSize(400, 400);
	  }
	  
	  public void paint(Graphics g) {
		  setBackground(Color.red);
		  g.setColor(Color.blue);
		  int[] xPoints = {100,50,150};
		  int[] yPoints = {100,200,200};
		  g.drawPolygon(xPoints, yPoints, 3);
	  }

}
		