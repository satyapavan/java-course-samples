import java.io.*;
class roundingfunc
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        double d1=0.0,d2=0.0,ans=0.0;
        try
        {
            System.out.print("Enter the value of d1  :");
            d1=(double)Float.valueOf(in.readLine()).floatValue();
        }
        catch(Exception e)
        {
            System.out.println("FOOL");
        }
        ans=Math.abs(d1);
        System.out.println("\n\tAbsolute value of "+(float)d1+"  = "+(float)ans);
//CEIL returns smallest integer value >= given number         
        ans=Math.ceil(d1);
        System.out.println("\n\tCeil value of +"+(float)d1+"  = "+ans);
        ans=Math.ceil(-d1);
        System.out.println("\n\tCeil value of -"+(float)d1+"  = "+ans);
//FLOOR returns largest integer value <= given number         
        ans=Math.floor(d1);
        System.out.println("\n\tFloor value of +"+(float)d1+"  = "+ans);
        ans=Math.floor(-d1);
        System.out.println("\n\tFloor value of -"+(float)d1+"  = "+ans);
//RINT returns nearest integer value        
        ans=Math.rint(d1);
        System.out.println("\n\tRint of +"+(float)d1+"  = "+ans);
        ans=Math.rint(-d1);
        System.out.println("\n\tRint of -"+(float)d1+"  = "+ans);
//ROUND returns next integer value       
        ans=Math.round(d1);
        System.out.println("\n\tRound of +"+(float)d1+"  = "+ans);
        ans=Math.round(-d1);
        System.out.println("\n\tRound of -"+(float)d1+"  = "+ans);

        try
        {
            System.out.print("\nEnter the value of d2  :");
            d2=(double)Float.valueOf(in.readLine()).floatValue();
        }
        catch(Exception e)
        {
            System.out.println("FOOL");
        }
        System.out.println("\nGiven d1="+(float)d1+"\n      d2="+(float)d2);
        ans=Math.max(d1,d2);
        System.out.println("\n\tMaximum Value :"+(float)ans);
        ans=Math.min(d1,d2);
        System.out.println("\n\tMinimun Value :"+(float)ans);

    }
}        

        



