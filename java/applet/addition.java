import java.awt.*;
import java.applet.*;
public class addition extends Applet
{
     TextField t1,t2;
     public void init()
     { 
          t1=new TextField(8);
          t2=new TextField(8);
          add(t1);
          add(t2);
     }
     public void paint(Graphics ssp)
     {
          float x=0,y=0,z=0;
          String s1,s2,s;
          ssp.drawString("Input the Values...",10,50); 
          try
          {
               s1=t1.getText();
               x=Float.parseFloat(s1);
               s2=t2.getText();
               y=Float.parseFloat(s2);
          }
          catch(Exception e)
          {
          }
          z=x+y;
          s=String.valueOf(z);
          ssp.drawString("The Sum is :  ",10,75);
          ssp.drawString(s,135,75);
          
          z=x-y;
          s=String.valueOf(z);
          ssp.drawString("The Difference is :  ",10,95);
          ssp.drawString(s,135,95);

          z=x*y;
          s=String.valueOf(z);
          ssp.drawString("The Multiplication is :  ",10,115);
          ssp.drawString(s,135,115);
          
          if(x==0 && y==0)
              z=1;
          else    
              z=x/y;
          s=String.valueOf(z);
          ssp.drawString("The Division is :  ",10,135);
          ssp.drawString(s,135,135);

     }
     public boolean action(Event event,Object obj)
     {
       repaint();
       return true;
     }       
}               