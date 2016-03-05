package pattern;
import java.util.Scanner;
public class pattern13
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     int asci=65;
     for(int i=1;i<=n;i++)
     {
         
          for(int j=1;j<=i;j++)
         {
             char ch=(char)(asci++);
             System.out.print(" "+ch);
            
             
         }
         System.out.println();
     }
     in.close();
 }
}
