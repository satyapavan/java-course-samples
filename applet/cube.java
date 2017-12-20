import java.awt.*;
import java.applet.*;
public class cube extends Applet
{
     public void paint(Graphics ssp)
     {
          setBackground(Color.black);
          ssp.setColor(Color.pink);
          ssp.drawRect(50,50,150,150);
          ssp.drawRect(80,80,150,150);
          ssp.setColor(Color.yellow);
          ssp.drawLine(50,50,80,80);
          ssp.drawLine(200,200,230,230);
          ssp.drawLine(50,200,80,230);
          ssp.drawLine(200,50,230,80);
          ssp.setColor(Color.orange);
          ssp.drawString("CUBE",100,30);
     }
}          