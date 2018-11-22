import java.io.*;
class prime
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int no=0,count=0,i=0;
       try
       {
          System.out.print("Enter UR number :");
          no=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
          System.out.println("FOOL");
       }
       for(i=2;i<no;i++)
       {
            if(no%i==0)
               count++;
       }
       if(count>=1)
              System.out.println("NOT PRIME");
       else
               System.out.println("PRIME NUMBER");
   }
}        
                 
