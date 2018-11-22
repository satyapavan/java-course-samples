                             /* TO PRINT THE POLYGON */

import java.awt.*;
import java.applet.*;
public class lab_9f extends Applet
{
     public void paint(Graphics ssp)
     {                   /* ARRAY DECLARATIONS */
         int x[]={50,200,350,50,350,50};
         int y[]={200,50,200,100,100,200};
         int n=x.length;   /* GETTING THE LENGTH */
         ssp.drawPolygon(x,y,n);
         ssp.drawString("Star created using the Polygon",100,30);
     }
}