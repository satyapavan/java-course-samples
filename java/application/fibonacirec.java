import java.io.*;
class fibonacirec
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int n=0,k=0,i=0;
       try
       {
           System.out.print("Enter the No. :");
           n=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
           System.out.print("FOOL");
       }
       for(i=1;i<=n;i++)
       {
          k=fibo(i);      
          System.out.print(k+"  ");
       }
    }
    static int fibo(int f)
    {
        if (f==1||f==2)   
           return(1);
        else
           return fibo(f-1)+fibo(f-2);
    }
}              