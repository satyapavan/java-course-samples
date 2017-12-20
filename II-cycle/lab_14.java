import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab_14 extends Applet implements ActionListener
{
     TextField t1;
     Label l=new Label("Enter the Value to find the Exponent");
     Button b=new Button("EXPONENT");
     public void init()
     { 
          t1=new TextField(3);
          add(t1);add(b);add(l);
          b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
         double x=Double.parseDouble(t1.getText());
         double y=0;
         y=Math.exp(x);
         l.setText("The Exponent of "+x+" is "+Double.toString(y));
     }       
}               