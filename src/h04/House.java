package h04;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class House extends Applet {

  public void init() {
	  setSize(800, 800);
  }

  public void paint(Graphics g) {
      setBackground(Color.blue);
      g.setColor(Color.red);
      g.drawRect(52, 190, 95, 150);
	  int[] xPoints = {100,50,150};
      int[] yPoints = {100,200,200};
      g.drawPolygon(xPoints, yPoints, 3);
      g.drawRect(52, 300, 20, 40);
      g.drawRect(90, 210, 50, 40);
      g.drawRect(90, 297, 40, 40);
  }
}