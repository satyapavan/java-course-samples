import java.io.*;
class random
{
	public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        double n1=0.0,n2=0.0,n0=0.0,temp=0.0;
        int j=0,n=0,count=0;
        int a[];
        try
        {
          	System.out.print("Enter the Lower Limit   :");
        	   n1=(double)Integer.parseInt(in.readLine());
	         System.out.print("Enter the Upper Limit   :");
        	   n2=(double)Integer.parseInt(in.readLine());
        }
        catch(Exception e)
        {
        	  System.out.println("FOOL");  	
        }        
        if(n1>n2)
        {
        	  temp=n2;
           n2=n1;
        	  n1=temp;
        }
        a=new int[(int)(n2-n1)/2];
        a[0]=0;
        n=(int)(n1+n2)/2;
        if(n1<9 && n2<9)
        {
        	do
        	{
           while(n>n1 && n<n2)
           {
              n0=Math.random();
              n0*=10;
              n=(int)n0;
              for(int i=0;i<=j;i++)
              { 
                   if(a[i]==n)
                   {
                   	    count++;
                        break;  
                   }
               }                        
               if(count==j-1)
               { 
                   	   a[j]=n;
                   	   System.out.println("   "+n);
                   	   j++;
                   	   break;
               }
              }
           
           }while(j!=(int)(n2-n1));
         }
     }
}        	  