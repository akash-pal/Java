package pattern;
import java.util.Scanner;
public class Pattern11
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     
     for(int i=1;i<2*n;i=i+2)
     {
         
          for(int j=i;j>=1;j=j-2)
         {
             System.out.print(" "+j);
         }
         System.out.println();
     }
     in.close();
 }
}
