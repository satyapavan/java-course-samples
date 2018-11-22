import java.io.*;
class largeofn
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int n=0,a=0,temp=0;
       try
       {
           System.out.print("Enter the No. of values :");
           n = Integer.parseInt(in.readLine());
           for(int i=1;i<=n;i++)
           {
             System.out.print("Enter the value no."+i+"  :");
             a = Integer.parseInt(in.readLine());
             if(a>=temp)
                temp=a;
           }
       }   
       catch(Exception e)
       {
          System.out.println("FOOL");
       }
       System.out.print("Largest value is "+temp);
    }
}                