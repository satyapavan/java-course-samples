import java.io.*;
class expofunc
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        double d1=0.0,d2=0.0,ans=0.0;
        try
        {
            System.out.print("Enter the value  d1:");
            d1=(double)Float.valueOf(in.readLine()).floatValue();
        }
        catch(Exception e)
        {
            System.out.println("FOOL");
        }
        System.out.println("\nFor d1 = "+(float)d1+"...");
        ans=Math.exp(d1);
        System.out.println("\n\tExponent : "+ans);
        ans=Math.log(d1);
        System.out.println("\n\tNatural Log'e' : "+ans);
        ans=Math.sqrt(d1);
        System.out.println("\n\tSquareRoot : "+ans);
        try
        {
            System.out.print("\nEnter the Power d2  :");
            d2=(double)Float.valueOf(in.readLine()).floatValue();
        }
        catch(Exception e)
        {
            System.out.println("FOOL");
        }

        ans=Math.pow(d1,d2);
        System.out.println("\n  "+(float)d1+" Power "+(float)d2+"  =  "+ans);
   }
}   



        