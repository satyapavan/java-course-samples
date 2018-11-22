import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mousedrag extends Applet implements MouseListener,MouseMotionListener
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
	   if(me.isMetaDown())
	   {  setBackground(Color.blue);
	      setBackground(Color.green);
	      setBackground(Color.red);
         setBackground(Color.yellow);
         setBackground(Color.white);
      }  
 	}
   public void mouseEntered(MouseEvent me)
	{ }
   public void mouseExited(MouseEvent me)
	{ }
   public void mouseDragged(MouseEvent me)
	{   
	    g=getGraphics();
       p1.x=me.getX();
       p1.y=me.getY();   	    
       if(me.isMetaDown())
           g.setColor(Color.red);
       else
           g.setColor(Color.blue);    
	    g.drawLine(p1.x,p1.y,me.getX(),me.getY());
	    g.drawLine(p1.x,p1.y,me.getX()+1,me.getY()-1);
	    g.drawLine(p1.x,p1.y,me.getX()+1,me.getY()+1);
	    g.drawLine(p1.x,p1.y,me.getX()-1,me.getY()-1);
	    g.drawLine(p1.x,p1.y,me.getX()-1,me.getY()+1);
	    g.drawLine(p1.x,p1.y,me.getX()+1,me.getY());
	    g.drawLine(p1.x,p1.y,me.getX()-1,me.getY());
	    g.drawLine(p1.x,p1.y,me.getX(),me.getY()+1);
	    g.drawLine(p1.x,p1.y,me.getX(),me.getY()-1);
   }
   public void mouseMoved(MouseEvent me)
	{ }
}
