import java.io.*;
class searchofstrinstr
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int count=0,l1=0,l2=0;
       String p=null;
       String c=null;
       try
       {
            System.out.print("Enter the Parent string :");
            p=in.readLine();
            System.out.print("Enter the Child string :");
            c=in.readLine();
       }
       catch(Exception e)
       {
            System.out.println("FOOL");
       }
       if(p.length()>c.length())
       {
            while(l1!=(-1))
            {
            	  l1=p.indexOf(c,l2);
            	  if(l2!=-1)
            	     count++;
            	  l1=l2;   
            } 	  
       }
       System.out.println("The Frequency is "+count);    
    } 
}       
