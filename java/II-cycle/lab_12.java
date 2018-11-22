import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class lab_12 extends Applet implements ActionListener
{
     TextField t1;
     Label l1,l2;
     Button b;
     public void init()
     { 
          t1=new TextField(5);
          b=new Button("Display");
          l2=new Label("");
          l1=new Label("Enter a five digit No.");
          add(l1);
          add(t1);
          add(b);
          add(l2);
          b.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
     {
       int n1=Integer.parseInt(t1.getText());
       int n2=n1;
       int rev=0;   
       if(n1>9999 && n1<100000)
       {               
           while(n1!=0)
	     {
	        int d=n1%10;        /* ITERATION FOR THE REVERSE OF THE NUMBER */
	        rev=(rev*10)+d;
	        n1=n1/10;
	       }
          if(n2==rev)
          {   
               l2.setText("It is a Palindrome Number");
          }
          else
          {      
               l2.setText("It is NOT a Palindrome Number");
          }
       }
       else
          l2.setText("Enter a FIVE Digit No. Man");
     }            
}               

