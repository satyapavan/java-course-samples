import java.io.*;
class factorialite
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int f=1,n=0;
       try
       {
            System.out.print("Enter the No. :");
            n=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
           System.out.print("FOOL");
       }
       for(int i=1;i<=n;i++)
       {
            f=f*i;
       }
        System.out.println("The Factorial of "+n+" is :"+f);   
    }
}               