import java.awt.*;
import java.applet.*;
public class palindrome extends Applet
{
     TextField t1;
     public void init()
     { 
          t1=new TextField(8);
          add(t1);
        //  t1.setText("0");
     }
     public void paint(Graphics ssp)
     {
          int no1=0,no2=0,rev=0,d=0;
          String s1,s;
          ssp.drawString("Input the Value...",10,50); 
          try
          {
               s1=t1.getText();
               no1=Integer.parseInt(s1);
          }
          catch(Exception e)
          {
          }
          no2=no1;
          while(no1!=0)
          {
               d=no1%10;
               rev=(rev*10)+d;
               no1/=10;
          }
         // s=String.valueOf(no2);
         // ssp.drawString(s,10,75);            
               
          if(no2==rev)
          {   
               ssp.drawString("It is a Palindrome Number",25,75);
          }
          else
          {      
               ssp.drawString("It is NOT a Palindrome Number",25,75);
          }
     }
     public boolean action(Event event,Object obj)
     {
       repaint();
       return true;
     }       
}               
