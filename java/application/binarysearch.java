import java.io.*;
class binarysearch 
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int i=0,j=0,size=0,begin=0,end=0,mid=0,temp=0,fetch=0;
       int a[];
       try
       {
            System.out.print("Enter UR size :");
            size=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
          System.out.println("ERROR");
          System.exit(1);

       }
            a=new int[size];     
            
       try
       {     
            System.out.println("\nEnter the Elements....\n");
            for(i=0;i<size;i++)
            {
               System.out.print("Element "+(i+1)+" :");
               a[i]=Integer.parseInt(in.readLine());
            }
       }
       catch(Exception e)
       {
          System.out.println("ERROR");
          System.exit(1);

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
            System.out.println("The Elements are....\n");
            for(i=0;i<size;i++)
            {
                  System.out.print("  "+a[i]);
            } 
       try
       {
            System.out.print("\nU want to search :");
            fetch=Integer.parseInt(in.readLine());
       }
       catch(Exception e)
       {
          System.out.println("ERROR");
          System.exit(1);

       }
       begin=0;
       end=size-1;
       mid=(begin+end)/2;
      while(begin<=end)
      {
	   
	      if(a[mid]==fetch)   
	      {
		       System.out.println("THE ELEMENT "+fetch+" IS FOUND IS AT "+(mid+1)+" POSITION");
		       System.exit(1);
		   }
         else if(fetch<a[mid])   
         {
	         end=mid-1;
	         mid=(begin+end)/2;
	      }   
	      else if(fetch>a[mid])   
	      {
	         begin=mid+1;
	         mid=(begin+end)/2;
	      }   
	    }   
	    System.out.println("THE ELEMENT "+fetch+" IS NOT FOUND ");
       System.exit(1);
	   
 	}
}	   