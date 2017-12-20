               /* FINDING THE PRRIMETER AND THE AREA OF THE RECTANGLE */

import java.io.*;
class lab_8
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       float x=1,y=1;
       rectangle rect=new rectangle();  
       try
       {                  /* GETTING THE L & B OF THE RECTANGLE */
            System.out.print("Enter the Length of the Rectangle  :");
            x=Float.parseFloat(in.readLine());
            rect.Set(x);
            System.out.print("Enter the Breadth  :");
            y=Float.parseFloat(in.readLine());
            rect.Set(y);
       }
       catch(Exception e)
       {
            System.out.print("INVALID INPUT");
            System.exit(1);
       }
       rect.Get(x,y);       /* CALLING OF THE METHODS */
       rect.Perimeter();
       rect.Area();
   }
}            

class rectangle       /* CLASS RECTANGLE */
{
     float length=1,breadth=1;
     void Get(float x,float y)    /* METHOD FOR GETTING L & B */
     {
           length=x;
           breadth=y;
     }
     void Set(float s)        /* METHOD FOR CHECKING THE RANGE */
     {
         if(0>s || 20<s)
         {
            System.out.println("INVALID INPUT");
            System.exit(1);
         }
      }
      void Perimeter()       /* METHOD FOR PERIMETER OF THE RECT */
      {
            System.out.println("\n\tThe Perimeter is "+2*(length+breadth)+" mts");
      }                      
      void Area()           /* METHOD FOR AREA OF THE RECT */
      { 
            System.out.print("\n\tThe Area is "+length*breadth+" Sq.mts");
      }
}            