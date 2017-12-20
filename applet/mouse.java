import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouse extends Applet implements MouseListener,MouseMotionListener
{
	int mx,my; 
	TextField t1=new TextField("",15);
	public void init()
	{
	     add(t1);
	     addMouseListener(this);
         addMouseMotionListener(this);
    }
	public void paint(Graphics g)
	{
	    	g.drawString("("+mx+","+my+")",mx,my);
	}	 
	public void mousePressed(MouseEvent me)
	{    
	    mx=me.getX();
		my=me.getY();
		t1.setText("Mouse Pressed");
		repaint();
    }
    public void mouseReleased(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		t1.setText("Mouse Released");
		repaint();
    }
    public void mouseClicked(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		try{Thread.sleep(1200);}catch(Exception e){}
		t1.setText("Mouse Clicked");
		repaint();
    }
    public void mouseEntered(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		t1.setText("Mouse Entered");
		repaint();
    }
    public void mouseExited(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		t1.setText("Mouse Exited");
		repaint();
    }
    public void mouseDragged(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		t1.setText("Mouse Dragged");
		repaint();
    }
    public void mouseMoved(MouseEvent me)
	{
		mx=me.getX();
		my=me.getY();
		t1.setText("Mouse Moved");
		repaint();
    }
}