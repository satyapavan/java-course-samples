import java.io.*;
class constraintsat
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       for(int s=0;s<=9;s++)
       {
         for(int e=0;e<=9;e++)
         {//if(e==s)
            // continue;
             for(int n=0;n<=9;n++)
             {//if((n==s)||(n==e))
                //continue;
                for(int d=0;d<=9;d++)
                {//if((d==n)||(e==d)||(s==d)) 
                   //continue; 
                   for(int m=0;m<=9;m++)
                   {//if((d==m)||(e==m)||(s==m)||(n==m)) 
                      //continue; 
                      for(int o=0;o<=9;o++)
                      {//if((d==o)||(e==o)||(s==o)||(n==o)||(m==o)) 
                         //continue; 
                         for(int r=0;r<=9;r++)
                         { //if((d==r)||(e==r)||(s==r)||(n==r)||(m==r)||(r==o)) 
                           //continue; 
                             for(int y=0;y<=9;y++)
                             { //if((d==y)||(e==y)||(s==y)||(n==y)||(m==y)||(y==o)||(y==r)) 
                               // continue; 
                                long x=(s*1000)+(e+100)+(n*10)+(d);
                                long w=(m*1000)+(o*100)+(r*10)+(e);
                                long z=(m*10000)+(o*1000)+(n*100)+(e*10)+(y);
                                if(z==(x+w))
                                {
             boolean b1=((s!=e)||(s!=n)||(s!=d)||(s!=m)||(s!=o)||(s!=r)||(s!=y));
                                if(b1)
                                {                          	
                                	//System.out.println("z"+z+"  x+w"+(x+w));
               //System.out.println("s="+s+"    e="+e+"   n="+n+"   d="+d+"   m="+m+"   o="+o+"   r="+r+"   y="+y);
                                }}
}}}}}}}}}}                                                                                 