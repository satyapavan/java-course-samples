                     /* MULTIPLICATION OF TWO MATRICES */

import java.io.*;
class lab_2
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
        int a[][];      /* VARIABLE DECLERATION */
        int b[][];
        int m[][];
        int i=0,j=0,k=0,r1=0,r2=0,c1=0,c2=0;
        try
        {
        	                          /* READING THE ORDER OF MATRICES */
             System.out.println("Enter the order of MATRIX 1:\n");
             System.out.print("\tROWS    :");
                  r1=Integer.parseInt(in.readLine());
             System.out.print("\tCOLOUMS :");
                  c1=Integer.parseInt(in.readLine());
             System.out.println("Enter the order of MATRIX 2:\n");
             System.out.print("\tROWS    :");
                  r2=Integer.parseInt(in.readLine());
             System.out.print("\tCOLOUMS :");
                  c2=Integer.parseInt(in.readLine());
         }
         catch(Exception e)
         {
             System.out.println("\n\tINVALID INPUTS");
         }
         a=new int[r1][c1];
         b=new int[r2][c2];
         m=new int[r1][c2];
         if(c1==r2)    
         {
           try
           {
           	                          /* READING FIRST MATRIX */
             System.out.println("Enter Matrix A"); 
             for(i=0;i<r1;i++)
             {
                for(j=0;j<c1;j++)
                {
                     System.out.print("A["+(i+1)+"]["+(j+1)+"] = "); 
                     a[i][j]=Integer.parseInt(in.readLine());
                }
                System.out.println();
             }
                                      /* READING SECOND MATRIX */ 
             System.out.println("Enter Matrix B");
             for(i=0;i<r2;i++)
             {
                for(j=0;j<c2;j++)
                {
                     System.out.print("B["+(i+1)+"]["+(j+1)+"] = "); 
                     b[i][j]=Integer.parseInt(in.readLine());
                }
                System.out.println();
             }
                                      /* LOOP FOR MATRIX MULTIPLICATION */
             System.out.print("The Multiplied Martix is...");
             for(i=0;i<r1;i++)
             {
                System.out.print("\n  ");
                for(j=0;j<c2;j++)
                {
	                 m[i][j]=0;
	                 for(k=0;k<c1;k++)
	                 { 
	                    m[i][j]+=a[i][k]*b[k][j];
             	     }
                    System.out.print(m[i][j]+"   ");
                }
	           }
           }
           catch(Exception e)
           {
               System.out.println("\n\tINVALID INPUTS");
           }
         }
         else
         {
              System.out.println("\n\tINVALID MATRIX ORDERS");  
         }
     }     
}     
