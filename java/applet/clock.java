import java.awt.*;
import java.util.*;
import java.text.*;
import java.applet.*;
public class clock extends Applet 
{
	int xc,yc;         //xcenter,ycenter
	int clkr;          //clockradius
	static Locale locale=Locale.getDefault();
	static TimeZone tz=TimeZone.getTimeZone("CST");
	static DateFormat myFormat;
	private GregorianCalendar cal=new GregorianCalendar();  
	
	public void init()
	{
		String language=getParameter("language");
		String country=getParameter("country");
		String timezone=getParameter("timezone");
		
		locale=new Locale(language,country);
		tz=TimeZone.getTimeZone(timezone);
		
		myFormat=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.LONG,locale);
		myFormat.setTimeZone(tz);
		
		clkr=(int)((getSize().width)*0.7*0.5);
		xc=(getSize().width)/2;
		yc=(getSize().width)/2;
		setBackground(Color.gray);
		
	}
	public void paint(Graphics g)
	{
		//drawcircle
		g.setColor(Color.black);
		g.drawOval(xc-clkr,yc-clkr,2*clkr,2*clkr);
		g.drawString("12",xc-5,yc-clkr);
		g.drawString("9",xc-clkr-10,yc+3);
		g.drawString("3",xc+clkr,yc+3);
		g.drawString("6",xc-3,yc+clkr+10);  
		
        cal=new GregorianCalendar(tz);
        
        //draw second hand
        int s=(int)cal.get(GregorianCalendar.SECOND);
        int sLength=(int)(clkr*0.9);
        int secondx=(int)(Math.cos((s/60.0)*2*Math.PI-Math.PI/2)*sLength+xc);
        int secondy=(int)(Math.sin((s/60.0)*2*Math.PI-Math.PI/2)*sLength+yc);
        g.setColor(Color.red);
        g.drawLine(xc,yc,secondx,secondy);
        
        //draw minute hand
        int m=(int)cal.get(GregorianCalendar.MINUTE);
        int mLength=(int)(clkr*0.8);
        int minutex=(int)(Math.cos((m/60.0)*2*Math.PI-Math.PI/2)*mLength+xc);
        int minutey=(int)(Math.sin((m/60.0)*2*Math.PI-Math.PI/2)*mLength+yc);
        g.setColor(Color.blue);
        g.drawLine(xc,yc,minutex,minutey);
        
        //draw hour hand
        int h=(int)cal.get(GregorianCalendar.HOUR_OF_DAY);
        int hLength=(int)(clkr*0.65);
        double hourAngle=(h/12.0)*2*Math.PI+(m/60.0)*(2*Math.PI/60.0)-Math.PI/2;
        int hourx=(int)(Math.cos(hourAngle)*hLength+xc);
        int houry=(int)(Math.sin(hourAngle)*hLength+yc);
        g.setColor(Color.green);
        g.drawLine(xc,yc,hourx,houry);
        
        //display current date
        String today=myFormat.format(cal.getTime());
        FontMetrics fm=g.getFontMetrics();
        g.drawString(today,(getSize().width-fm.stringWidth(today))/2,yc+clkr+30);
        try{Thread.sleep(1000);}catch(Exception e){}
        repaint();
    }
}        

	