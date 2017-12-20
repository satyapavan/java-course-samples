import java.io.*;
class bubblesort
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int i=0,j=0,temp=0,size=0;
       int a[]=new int[100];
       try
       {
            System.out.print("Enter UR number :");
            size=Integer.parseInt(in.readLine());
            
            for(i=0;i<size;i++)
            {
               System.out.print("A["+(i+1)+"]:");
               a[i]=Integer.parseInt(in.readLine());
            }
       }
       catch(Exception e)
       {
          System.out.println("ERROR");
       }
       for(i=0;i<size;i++)
       {
           for(j=i+1;j<size;j++)
           {
                if(a[i]>a[j]) 
                {
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                }
            }
        } 
        System.out.println("Ascending Order is....");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+"   ");
        }   
        System.out.println();          
        System.out.println("Descending Order is....");
        for(i=size-1;i>=0;i--)
        {
           System.out.print(a[i]+"   ");
        }             
    }
}