import java.io.*;
class factorialrec
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int n=0,k=1,i=0;
       try
       {
           System.out.print("Enter the No. :");
           n=Integer.parseInt(in.readLine());
           for(i=1;i<=n;i++)
           {
              k=fact(i);
           }
          System.out.println("FACTORIAL  :"+k);
       }
       catch(Exception e)
       {
          System.out.print("FOOL");
       }
    }
    static int fact(int f)
    {
        if (f==1)  
           return 1;
        else
           return f*fact(f-1);
    }
}              