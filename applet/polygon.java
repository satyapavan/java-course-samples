import java.awt.*;
import java.applet.*;
public class polygon extends Applet
{
     public void paint(Graphics ssp)
     {
         int x[]={10,40,30,90};
         int y[]={40,10,80,90};
         int n=x.length;
         ssp.drawPolygon(x,y,n);
     }
}