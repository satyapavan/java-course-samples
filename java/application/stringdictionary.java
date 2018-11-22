
import java.io.*;
class stringdictionary
{
   public static void main(String Str[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int n=0,i=0,j=0;
       String str[],temp;
       try
       {
            System.out.print("Enter the No. of Strings  :");
            n=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
            System.out.println("FOOL");
            System.exit(1);
       }
     
            str=new String[n];
       try
       {
            for(i=0;i<n;i++)
            {
            	   System.out.print("Enter the String "+(i+1)+" :");
             	   str[i]=in.readLine();
            }	
       }     
       catch(Exception e)
       {
            System.out.println("FOOL");
            System.exit(1);
       }
       for(i=0;i<n;i++)
       {
          for(j=0;j<n;j++)
          {
              if(str[i].compareTo(str[j])<0)
              {
                   temp=str[i];
                   str[i]=str[j];
                   str[j]=temp;
               }
          }
       }               
       System.out.println("The Sorted order is...");
       for(i=0;i<n;i++)
       {
           System.out.println(str[i]);
       }    
   }
}       