import java.io.*;
class calci
{
   public static void main(String args[])
   {
       DataInputStream in=new DataInputStream(System.in);
       int a=0,b=0;
       char op='\0';
       try
       {
           System.out.println("Enter the values for A & B :");
           a = Integer.parseInt(in.readLine());
           b = Integer.parseInt(in.readLine());
           System.out.println("Operation U want to perform is ");
           op=(char)System.in.read();
       }   
       catch(Exception e)
       {
            System.out.println("FOOL");
       }  
       switch (op)
       {
          case '+' :
                System.out.println("Addition  A + B = "+(a+b));
                break;   
          case '-' :
                System.out.println("substraction  A + B = "+(a-b));
                break;   
          case '*' :
                System.out.println("Multiplication  A + B = "+(a*b));
                break;   
          case '/' :
                System.out.println("Division  A + B = "+(a/b));
                break;
          case '%' :
                System.out.println("Modulo  A % B = "+(a%b));
                break;   
          default :
                System.out.println("SALA");
                break;   
        }         
   }
}   
        