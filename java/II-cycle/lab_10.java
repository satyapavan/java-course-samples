import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab_10 extends Applet implements ActionListener
{
     TextField t1,t2;
     Button b;
     Label l1,l2,l;
     float x,y;
     String s1,s2;
     public void init()
     { 
          t1=new TextField(8);
          t2=new TextField(8);
           b=new Button("Display");
           l1=new Label("Ist Value :");
           l2=new Label("2nd Value :");
           l=new Label("Enter the Input Values");
           add(l1);      add(t1);
           add(l2);      add(t2);
           add(b);       add(l);
           b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
           String st=e.getActionCommand();
           x=Float.parseFloat(t1.getText());
           y=Float.parseFloat(t2.getText());
           l.setText("The Result is "+Float.toString(x+y));
     }       
}               