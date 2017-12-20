import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class check extends Applet implements ItemListener
{
       Label l0,l1,l2,l3,l4,l5;
       Checkbox c0,c1,c2,c3,c4,c5,c6,c7,c8,c9;
       Checkbox b1,b2,b3,b4,b5,b6;
       CheckboxGroup cg1=new CheckboxGroup();
       CheckboxGroup cg2=new CheckboxGroup();
       CheckboxGroup cg3=new CheckboxGroup();
       Panel p1=new Panel();
       Panel p2=new Panel();
       Panel p3=new Panel();
       Panel p4=new Panel();     
            
       public void init()
       {    
            p1.setLayout(new FlowLayout(0,20,5));
            p2.setLayout(new FlowLayout(0,20,5));
            p3.setLayout(new FlowLayout(0,20,5));
            p4.setLayout(new GridLayout(3,2));
            setLayout(new GridLayout(10,1));
            l0=new Label("                          STUDENT DATABASE");
            l1=new Label("Student's Group in B.Tech is");
            l2=new Label("Present Year of Study is");
            l3=new Label("Gender of the Student is");
            l4=new Label("Select Your subjects of interest");
            l5=new Label();
            add(l0);add(l1);add(p1);
            p1.add(c0=new Checkbox("E.C.E",cg1,false));
            p1.add(c1=new Checkbox("C.S.E",cg1,false));
            p1.add(c2=new Checkbox("I.T",cg1,false));
            p1.add(c3=new Checkbox("E.E.E",cg1,false));
            add(l2);add(p2);
            p2.add(c4=new Checkbox("I/IV",cg2,false));
            p2.add(c5=new Checkbox("II/IV",cg2,false));
            p2.add(c6=new Checkbox("III/IV",cg2,false));
            p2.add(c7=new Checkbox("IV/IV",cg2,false));
            add(l3);add(p3);
            p3.add(c8=new Checkbox("MALE",cg3,false));
            p3.add(c9=new Checkbox("FEMALE",cg3,false));
            add(l4);add(p4);
            b1=new Checkbox("OOPS with JAVA");
            b2=new Checkbox("Computer Networks");
            b3=new Checkbox("RADAR Engineering");
            b4=new Checkbox("Optical Communication");
            b5=new Checkbox("Satellite Communication");
            b6=new Checkbox("Artificial Intellegence");
            p4.add(b1);p4.add(b2);p4.add(b3);
            p4.add(b4);p4.add(b5);p4.add(b6);
            add(l5);
            c0.addItemListener(this);c1.addItemListener(this);
            c2.addItemListener(this);c3.addItemListener(this);
            c4.addItemListener(this);c5.addItemListener(this);
            c6.addItemListener(this);c7.addItemListener(this);
            c8.addItemListener(this);c9.addItemListener(this);
            b1.addItemListener(this);b2.addItemListener(this);
            b3.addItemListener(this);b4.addItemListener(this);
            b5.addItemListener(this);b6.addItemListener(this);
        }    
        public void itemStateChanged(ItemEvent i)
        {
        	boolean q1=(c0.getState()||c1.getState()||c2.getState()||c3.getState());
        	boolean q2=(c4.getState()||c5.getState()||c6.getState()||c7.getState());
        	boolean q3=(c8.getState()||c9.getState());
        	boolean q4=(b1.getState()||b2.getState()||b3.getState()
        	          ||b4.getState()||b5.getState()||b6.getState());
        	boolean q=(q1&&q2&&q3&&q4);
        	if(q)
        	{
        	    l5.setText("The Student Record is Completely Filled");
        	}	 
        } 
}        