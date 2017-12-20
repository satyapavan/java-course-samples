import java.io.*;
class linearsearch 
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int i=0,j=0,size=0,key=0,count=0;
       int a[]=new int[100];
       try
       {
            System.out.print("Enter UR size :");
            size=Integer.parseInt(in.readLine());
            
            for(i=0;i<size;i++)
            {
               System.out.print("A["+i+"]:");
               a[i]=Integer.parseInt(in.readLine());
            }
            System.out.print("U wanna search ");
            key=Integer.parseInt(in.readLine());
            for(i=0;i<size;i++)
            {
                 if(a[i]==key)
                 {
                      System.out.print("RECORD FOUND AT "+(i+1)+" POSITION\n\n");
                      break;
                 }    
                 count++;
            }
            if(count==size)
                 System.out.print("RECORD NOT FOUND\n\n");
        }
        catch(Exception e)
        {
            System.out.print("FOOL");
        }
   }
}        
                    