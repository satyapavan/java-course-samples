import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mousepoly extends Applet implements MouseListener,MouseMotionListener
{
	int mx,my,i; 
	Graphics g;
   Point p1=new Point(0,0);
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
	   p1.x=me.getX();
	   p1.y=me.getY();
	   int a1[]={0,p1.x,750};
	   int b1[]={0,p1.y,0};
	   int a2[]={0,p1.x,0};
	   int b2[]={0,p1.y,500};
	   int a3[]={0,p1.x,750};
	   int b3[]={500,p1.y,500};
	   int a4[]={750,p1.x,750};
	   int b4[]={0,p1.y,500};
		g=getGraphics(); 
      g.setColor(Color.pink);
    	g.fillPolygon(a1,b1,3);
	   g.setColor(Color.cyan);
		g.fillPolygon(a2,b2,3);
		g.setColor(Color.yellow);
		g.fillPolygon(a3,b3,3);
		g.setColor(Color.green);
		g.fillPolygon(a4,b4,3);
	}
}
