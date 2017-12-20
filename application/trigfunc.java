import java.io.*;
class trigfunc
{
    public static void main(String args[])
    {
        DataInputStream in=new DataInputStream(System.in);
        double d=0.0,ans=0.0;
        try
        {
            System.out.print("Enter the value  :");
            d=(double)Float.valueOf(in.readLine()).floatValue();
        }
        catch(Exception e)
        {
            System.out.println("FOOL");
        }
        ans=Math.sin(d);
        System.out.println("\n\t Sin( "+(float)d+" )= "+ans);
        ans=Math.cos(d);
        System.out.println("\n\t Cos( "+(float)d+" )= "+ans);
        ans=Math.tan(d);
        System.out.println("\n\t Tan( "+(float)d+" )= "+ans);
        ans=Math.asin(d);
        System.out.println("\n\tASin( "+(float)d+" )= "+ans);
        ans=Math.acos(d);
        System.out.println("\n\tACos( "+(float)d+" )= "+ans);
        ans=Math.atan(d);
        System.out.println("\n\tATan( "+(float)d+" )= "+ans);
    }
}        





      
