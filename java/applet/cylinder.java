import java.awt.*;
import java.applet.*;
public class cylinder extends Applet
{
     public void paint(Graphics ssp)
     {
          setBackground(Color.black);
          setForeground(Color.yellow);
          ssp.drawOval(50,50,150,30);
          ssp.drawLine(50,65,50,215);
          ssp.drawLine(200,65,200,215);    
          ssp.drawArc(50,200,150,30,0,-180);     
 
          ssp.setColor(Color.pink);
          ssp.fillRect(250,265,150,150);
          ssp.fillArc(250,400,150,30,0,-180);     
          ssp.setColor(Color.yellow);
          ssp.fillOval(250,250,150,30);
     }
}      