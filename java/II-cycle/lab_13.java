import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab_13 extends Applet implements ActionListener
{
     TextField t1;
     Label l=new Label("Enter the Value                 ");
     Button b=new Button("FACTORIAL");
     public void init()
     { 
          t1=new TextField(3);
          add(t1);
          add(b);
          add(l);
          b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
        int f=1;
        int no=Integer.parseInt(t1.getText());
        if(no>0)
        {
              for(int i=1;i<=no;i++)
              {
                   f=f*i;
              }
              l.setText("The Factorial is "+Integer.toString(f));
        }    
     }       
}               


