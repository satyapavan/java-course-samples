import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mousediagram extends Applet implements MouseListener,MouseMotionListener
{
	int mx,my,i; 
	Graphics g;
   Point p1=new Point(0,0);
	Point p2=new Point(0,500);
   Point p3=new Point(750,0);
   Point p4=new Point(750,500);
   public void init()
	{
  	     addMouseListener(this);
        addMouseMotionListener(this);
   }
	public void mousePressed(MouseEvent me)
	{ }
   public void mouseReleased(MouseEvent me)
	{ }
   public void mouseClicked(MouseEvent me)
	{
	   setBackground(Color.blue);
	   setBackground(Color.green);
	   setBackground(Color.red);
      setBackground(Color.yellow);
      setBackground(Color.white);
 	}
   public void mouseEntered(MouseEvent me)
	{ }
   public void mouseExited(MouseEvent me)
	{ }
   public void mouseDragged(MouseEvent me)
	{ }
   public void mouseMoved(MouseEvent me)
	{
		g=getGraphics(); 
      g.setColor(Color.blue);
    	g.drawLine(p1.x,p1.y,me.getX(),me.getY());
	   g.setColor(Color.red);
		g.drawLine(p2.x,p2.y,me.getX(),me.getY());
		g.setColor(Color.yellow);
		g.drawLine(p3.x,p3.y,me.getX(),me.getY());
		g.setColor(Color.green);
		g.drawLine(p4.x,p4.y,me.getX(),me.getY());
	}
}