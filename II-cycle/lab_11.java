import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab_11 extends Applet implements ActionListener
{
     Label l;
     TextField t1;
     Button b;
     Graphics g;
     public void init()
     { 
          l=new Label("Enter the side");
          t1=new TextField(8);
          b=new Button(" DRAW ");
          add(l);add(t1);add(b);
          b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {	  
         g=getGraphics();
         g.drawRect(60,60,Integer.parseInt(t1.getText()),
                           Integer.parseInt(t1.getText()));
     }      
}               

