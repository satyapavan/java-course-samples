import java.io.*;
import java.lang.*;
class octadecimal
{
   public static void main(String args[])
   {
      DataInputStream in=new DataInputStream(System.in);
      int a=9,b=0,nd=0,no=0,i=0,length=0;
      int rema[]=new int[100];
      try
      {
      	    nd=Integer.parseInt(in.readLine());
      }
      catch(Exception e)
      {
      }		    
      while(a<=8)
      {
      	    a=nd/8;
      	    rema[i]=nd%8;
      	    i++;
      }
      length=i-1;
      for(i=length;i<=0;i--)
      {
      	   //no+=rema[length]*(Math.pow(10,length));
      	  System.out.println(rema[i]);
      }
      System.out.println(no);
   }
}         
      
      
      