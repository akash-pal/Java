package pattern;
import java.util.Scanner;
public class Pattern6
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     for(int i=1;i<=n;i++)
     {
          for(int j=n-1;j>=i;j--)
         {
             System.out.print(" ");
         }
         int last=0;
         for(int j=1;j<=i;j++)
         {
             System.out.print(j);
             last=j;
         }
         for(int k=last-1;k>=1;k--)
         {
             System.out.print(k);
         }
         System.out.println();
     }
     in.close();
 }
}
