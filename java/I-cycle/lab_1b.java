                      /* TO PRINT THE PYRAMID */

import java.io.*;
class lab_1b
{
   public static void main(String args[])
   {
         for(int i=1;i<=5;i++)               
         {
	        for(int k=5-i;k>0;k--)         /* FOR LOOP FOR SPACES */
	        {
	             System.out.print("  ");
	        }
	        for(int j=1;j<=i;j++)           /* FOR LOOP FOR PRINT */
	        {
	             System.out.print(" *  ");
	        }
	        System.out.println();
         }
   }
}         
