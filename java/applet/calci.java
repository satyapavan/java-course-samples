import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class calci extends Applet implements ActionListener
{
	//Button b[]=new Button[20];
	boolean flag=true;
	boolean clear=false;
	float n1=0,n2=0,tot=0;
	String sow=new String();
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,
	       b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	TextField t=new TextField("",25);
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel();
	Panel p=new Panel();
	public void paint(Graphics g)
	{
    	Color sow=new Color(153,153,255);
      setBackground(sow);
   }
	public void init()
	{
		b1=new Button("0   ");
		b2=new Button(" .   ");
		b3=new Button(" =  ");
		b4=new Button(" +  ");
		b5=new Button("%   ");
		b6=new Button("1   ");
		b7=new Button("2   ");
		b8=new Button("3   ");
		b9=new Button(" -  ");
		b10=new Button("1/x ");
		b11=new Button("4   ");
		b12=new Button("5   ");
		b13=new Button("6   ");
		b14=new Button(" *  ");
		b15=new Button("exp");
		b16=new Button("7   ");
		b17=new Button("8   ");
		b18=new Button("9   ");
		b19=new Button(" /  ");
		b20=new Button("sqrt");
		b21=new Button("A/C ");
		b22=new Button("Sin ");
		b23=new Button("Cos");
		b24=new Button("Tan");
		
		t.setEditable(false);
		p1.setLayout(new FlowLayout(1,5,5));
        p2.setLayout(new FlowLayout(1,5,5));
        p3.setLayout(new FlowLayout(1,5,5));
        p4.setLayout(new FlowLayout(1,5,5));
        p5.setLayout(new FlowLayout(1,5,5));
        p.setLayout(new GridLayout(5,1));
        setLayout(new BorderLayout());
        p.add(p5);p.add(p4);p.add(p3);p.add(p2);p.add(p1);
        add("North",p);p5.add(t);
        p1.add(b1);p1.add(b2);p1.add(b3);p1.add(b4);p1.add(b5);p1.add(b24);
        
        p2.add(b6);p2.add(b7);p2.add(b8);p2.add(b9);p2.add(b10);p2.add(b23);
        
        p3.add(b11);p3.add(b12);p3.add(b13);p3.add(b14);p3.add(b15);p3.add(b22);
        
        p4.add(b16);p4.add(b17);p4.add(b18);p4.add(b19);p4.add(b20);p4.add(b21);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        
	  /*  b[0].setLabel("0");
        b[1].setLabel(".");
        b[2].setLabel("=");
        b[3].setLabel("+");
        b[4].setLabel("exp");
        b[5].setLabel("1");
        b[6].setLabel("2");
        b[7].setLabel("3");
        b[8].setLabel("-");
        b[9].setLabel("1/x");
        b[10].setLabel("4");
        b[11].setLabel("5");
        b[12].setLabel("6");
        b[13].setLabel("*");
        b[14].setLabel("%");
        b[15].setLabel("7");
        b[16].setLabel("8");
        b[17].setLabel("9");
        b[18].setLabel("/");
        b[19].setLabel("sqrt");
        p1.setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        p3.setLayout(new FlowLayout());
        p4.setLayout(new FlowLayout());
        add(p4);add(p3);add(p2);add(p1);
        p1.add(b[0]);p1.add(b[1]);p1.add(b[2]);p1.add(b[3]);
        p1.add(b[4]);p2.add(b[5]);p2.add(b[6]);p2.add(b[7]);
        p2.add(b[8]);p2.add(b[9]);p3.add(b[10]);p3.add(b[11]);
        p3.add(b[12]);p3.add(b[13]);p3.add(b[14]);p4.add(b[15]);
        p4.add(b[16]);p4.add(b[17]);p4.add(b[18]);p4.add(b[19]);
     */
	}	
	
	public void actionPerformed(ActionEvent a)
	{  
	   String s=a.getActionCommand();
	   if("0   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText((t.getText()+s).trim());
	   }
	   if("1   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("2   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("3   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("4   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("5   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("6   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("7   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("8   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if("9   ".equals(s))
	   {
	     	if(clear)
	     	{t.setText("");clear=false;}
	     	t.setText(t.getText()+s.trim());
	   }
	   if(" .   ".equals(s))
	   {
	     	if(clear)
	      {t.setText("");clear=false;}
	     	if(flag)
	     	{
	     	    t.setText(t.getText()+s.trim());
	            flag=false;
	        }
	   }
	   if(" +  ".equals(s))
	   {
	     	    sow=(t.getText()).trim();
	     	    n1=Float.parseFloat(sow);
	     	    tot+=n1;
		        //n2=tot;  
	     	    flag=true;clear=true;
	   }
	   if(" -  ".equals(s))
	   {
	     	    sow=(t.getText()).trim();
	     	    n1=Float.parseFloat(sow);
	     	    //n2=tot;
	     	    tot-=n1;
	     	    flag=true;clear=true;
	   }
	   if(" *  ".equals(s))
	   {
	     	    sow=(t.getText()).trim(); 
	     	    n1=Float.parseFloat(sow);
	     	    //n2=tot;
	     	    tot*=n1;
	     	    flag=true;clear=true;
	   }
	   if(" /  ".equals(s))
	   {
	     	    sow=(t.getText()).trim();
	     	    n1=Float.parseFloat(sow);
	     	    //n1=tot;
	     	    tot/=n1;
	     	    flag=true;clear=true;
	   }
	   if(" =  ".equals(s))
	   {
	     	    sow=Float.toString(tot);
	     	    t.setText(sow);
	     	    flag=true;clear=true;
	   }
	}
}	
	