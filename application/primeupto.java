import java.io.*;
class primeupto
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int n=0,count=0,i=0,j=0;
       try
       {
          System.out.print("Enter UR number :");
          n=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
           System.out.print("FOOL");
       }
       for(i=2;i<=n;i++)
       {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                   count++;
             }
             if(count>1)
                 System.out.println(i+" :  NOT PRIME");
             else
                 System.out.println(i+" :  PRIME NUMBER");
             count=0;        
       }        
   }
}        
                 

