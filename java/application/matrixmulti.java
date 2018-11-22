import java.io.*;
class matrixmulti
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int m[][]=new int[3][3];
        int i=0,j=0,k=0;
        try
        {
             System.out.println("Enter Matrix A");
             for(i=0;i<3;i++)
             {
                for(j=0;j<3;j++)
                {
                     System.out.print("A["+(i+1)+"]["+(j+1)+"] = "); 
                     a[i][j]=Integer.parseInt(in.readLine());
                }
             }
             System.out.println("Enter Matrix B");
             for(i=0;i<3;i++)
             {
                for(j=0;j<3;j++)
                {
                     System.out.print("B["+(i+1)+"]["+(j+1)+"] = "); 
                     b[i][j]=Integer.parseInt(in.readLine());
                }
             }
         }  
         catch(Exception e)
         {
             System.out.println("FOOL");
         }
         System.out.print("The Multiplied Martix is...");
         for(i=0;i<3;i++)
         {
            System.out.print("\n  ");
            for(j=0;j<3;j++)
            {
	              m[i][j]=0;
	              for(k=0;k<3;k++)
	              { 
	                 m[i][j]+=a[i][k]*b[k][j];
             	  }
                 System.out.print(m[i][j]+"   ");
            }
	          
        }        
     }
}         