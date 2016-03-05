package pattern;
import java.util.Scanner;
public class Pattern4
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();

     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=i;j++)
         {
             System.out.print(" "+i);
         }
         for(int k=i+1;k<=n;k++)
         {
             System.out.print(" "+k);
         }
         System.out.println();
     }
     in.close();
 }
}
