package pattern;
import java.util.Scanner;
public class Pattern14
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     for(int i=1;i<=n;i++)
     {
         int k=i;
         System.out.print(" "+k);
          for(int j=1;j<i;j++)
         {
             k=k+(n-j);
             System.out.print(" "+k);      
         }
         System.out.println();
     }
     in.close();
 }
}