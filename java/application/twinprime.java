import java.io.*;
class twinprime
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int n=0,count=0,i=0,k=0,j=0;
       int a[];
       try
       {
          System.out.print("Enter UR number :");
          n=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
       	   System.out.print("FOOL");
       }
       a=new int[n];
       for(i=2;i<=n;i++)
       {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                   count++;
             }
             if(!(count>1))
             {
                 a[k]=i;
                 k++;
             }    
             count=0;        
       }        
       System.out.println("TWIN PRIMES ARE...\n\n");
       for(i=0;i<k;i++)
       {
       	   int diff=a[i+1]-a[i];
       	   if(diff==2)
       	        System.out.println(a[i]+"  AND  "+a[i+1]);
       }	        
   }
}   