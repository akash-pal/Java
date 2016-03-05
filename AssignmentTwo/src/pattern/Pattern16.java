package pattern;

import java.util.Scanner;
public class Pattern16
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
  
     for(int i=1;i<=n;i++)
     {
          for(int j=i;j<=n-1;j++)
         { 
             System.out.print(" ");
         }
          for(int j=1;j<=i;j++)
         { 
             System.out.print(j);
         }
           for(int j=i-1;j>=1;j--)
         { 
             System.out.print(j);
         }
         System.out.println();
     }
     in.close();
 }
}
