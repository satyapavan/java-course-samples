                            /* TO PRINT THE CUBE */

import java.awt.*;
import java.applet.*;
public class lab_9b extends Applet
{
     public void paint(Graphics ssp)
     {
          ssp.drawRect(50,50,150,150);     /* INNER  SQUARE */
          ssp.drawLine(50,50,80,80);
          ssp.drawLine(200,200,230,230);
          ssp.drawRect(80,80,150,150);     /* OUTER  SQUARE */
          ssp.drawLine(50,200,80,230);
          ssp.drawLine(200,50,230,80);
          ssp.drawString("CUBE",120,30);
     }
}          