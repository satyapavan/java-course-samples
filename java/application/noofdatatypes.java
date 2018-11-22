import java.util.*;
import java.io.*;
class noofdatatypes
{
	public static void main(String args[])
	{
	  	 DataInputStream in=DataOutputStream(System.in);
		 int count=0;  
	  	 String st=new String();
		 DataType dt=new DataType();
		 try
		 {
		     st=in.readLine();
		 }
		 catch(Exception e)
		 {
		    System.out.println("FOOL");
		 }
		 StringTokenizer str=new StringTokenizer(st);
		 count=str.countTokens();
		 while(str.hasMoreTokens())
		 {
		     dt.find(str.nextToken());
		 }
		 dt.display(count);
	}
}		 

class DataType
{
    int i=0,f=0;
    public void find(int findi)
    {
        i++;
    }
    public void find(float findf)
    {
        f++;
    }
    public void display(int count)
    {
        System.out.println("TOTAL No. OF INTEGERS  :"+i);
        System.out.println("TOTAL No. OF FLOATS    :"+f);
        System.out.println("TOTAL No. OF STRINGS   :"+(count-i-f));
    }  
}     
                    