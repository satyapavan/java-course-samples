                /* PROGRAM TO IMPLEMENT HIERARCHICAL INHERITANCE */

import java.io.*;
class lab_4
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int m1=0,m2=0,m3=0,m4=0,r=0;
       try
       {                          /* READING OF DATA */
       	     System.out.print("Enter the Student Roll No.  :");
       	     r=Integer.parseInt(in.readLine());
       	     System.out.print("\nEnter the Marks for Subject 1:");
       	     m1=Integer.parseInt(in.readLine());
       	     System.out.print("\t\t    Subject 2:");
       	     m2=Integer.parseInt(in.readLine());
       	     System.out.print("\t\t    Subject 3:");
       	     m3=Integer.parseInt(in.readLine());
       	     System.out.print("\t\t    Subject 4:");
       	     m4=Integer.parseInt(in.readLine());
       	}
       	catch(Exception e)
       	{
       		 System.out.println("INLAVID INPUTS");
       	}	      
       	     
             average avg=new average();     /* CREATION OF OBJECTS */
             stdno s=new stdno();
             marks m=new marks();
             s.Getno(r);
             m.Getmarks(m1,m2,m3,m4);
             s.Putno();
             m.Putmarks(); 
             avg.Average(m1,m2,m3,m4);
   }
}

class student              /* CLASS STUDENT */
{ 
	 int s1,s2,s3,s4,rno;
	 float a;
}	 
	 
class stdno extends student     /* EXTENDED CLASS STDNO */
{
	 void Getno(int r)     /* METHOD FOR GETTING STUDENT NO */
	 {
	 	  rno=r;
	 }
	 void Putno()         /* METHOD FOR PRINTING STUDENT NO */
	 {
	 	System.out.println("\nThe Student Roll No. is :"+rno);
	 }
}

class marks extends student  /* EXTENDED CLASS MARKS */
{
	                         /* METHOD FOR GETTING MARKS */
	 void Getmarks(int m1,int m2,int m3,int m4) 
	 {
	 	   s1=m1;
	 	   s2=m2;
	 	   s3=m3;
	 	   s4=m4;
	 }
	 void Putmarks()        /* METHOD FOR PRINTING MARKS */
	 {
	 	 System.out.println("\tSubject 1: "+s1);
	 	 System.out.println("\tSubject 2: "+s2); 
	 	 System.out.println("\tSubject 3: "+s3);
	 	 System.out.println("\tSubject 4: "+s4);
     }	 	   
}     

class average extends student /* EXTENDED CLASS AVERAGE */
{
	                          /* METHOD FOR PRINTING AVERAGE */ 
	void Average(int m1,int m2,int m3,int m4)
     {
         a=(m1+m2+m3+m4)/4;
      	 System.out.println("\tThe Average is "+a);
     }
}     