package staafdiagram;

import java.awt.*;
import java.applet.Applet;


public class StaafDiagram extends Applet {
		     
int Valerie;
int Hans;
int Jeroen;

public void init () {
	
setSize (500,500);

	Jeroen = 125;
	Valerie = 65;
	Hans = 70;
			
}
		      public void paint(Graphics draw) 
		      {   
		    	setBackground(Color.green);
		        draw.drawLine(35, 260, 400, 260);
		        draw.drawLine(35, 260, 35, 100);
		        //x en y lijn van de diagram
		        draw.drawLine(35, 240, 400, 240);
		        draw.drawLine(35, 220, 400, 220);
		        draw.drawLine(35, 200, 400, 200);
		        draw.drawLine(35, 180, 400, 180);
		        draw.drawLine(35, 160, 400, 160);
		        draw.drawLine(35, 140, 400, 140);
		        draw.drawLine(35, 120, 400, 120);
		        //horizontale lijnen
		        draw.drawString("Valerie", 100, 290);
		        draw.drawString("Hans", 200, 290);
		        draw.drawString("Jeroen", 300, 290);
		        draw.drawString("20", 20, 245);
		        draw.drawString("40", 20, 225);
		        draw.drawString("60", 20, 205);
		        draw.drawString("80", 20, 185);
		        draw.drawString("100", 13, 165);
		        draw.drawString("120", 13, 145);
		        draw.drawString("140", 13, 125);
		        //gegevens
		        draw.setColor(Color.red);
		        draw.fillRect(105, 260 - Valerie, 30, Valerie);
		        draw.setColor(Color.white);
		        draw.fillRect(200, 260 - Hans, 30, Hans);
		        draw.setColor(Color.blue);
		        draw.fillRect(305, 260 - Jeroen, 30, Jeroen);
		        //diagram
		      }
		      
		    		    
		    
}