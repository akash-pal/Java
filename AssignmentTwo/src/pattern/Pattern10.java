package pattern;
import java.util.Scanner;
public class Pattern10
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     
     for(int i=1;i<2*n;i=i+2)
     {
         
          for(int j=i;j<2*n;j=j+2)
         {
             System.out.print(" "+j);
         }
         for(int k=1;k<i;k=k+2)
         {
             System.out.print(" "+k);
         }
         System.out.println();
     }
     in.close();
 }
}
