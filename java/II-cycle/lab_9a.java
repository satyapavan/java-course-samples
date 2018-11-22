                      /* PROGRAN TO PRINT THE CYLINDER */

import java.awt.*;
import java.applet.*;
public class lab_9a extends Applet
{
     public void paint(Graphics ssp)     
     {                        /* LOGIC FOR CYLINDER */
          ssp.drawOval(50,50,150,30);
          ssp.drawLine(50,65,50,215);
          ssp.drawLine(200,65,200,215);    
          ssp.drawArc(50,200,150,30,0,-180);     
     }    
}      