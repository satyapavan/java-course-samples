import java.io.*;
class fibonaciite
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int f1=1,f2=1,f3=0,n=0;
       try
       {
            System.out.print("Enter the No. :");
            n=Integer.parseInt(in.readLine());
            System.out.print(f1+"  ");
            System.out.print(f2+"  ");
       }
       catch(Exception e)
       {
          System.out.println("FOOL");
       }
       for(int i=1;i<=n-2;i++)
       {
            f3=f1+f2;
            System.out.print(f3+"  ");
            f1=f2;
            f2=f3;
       }
    }
}                