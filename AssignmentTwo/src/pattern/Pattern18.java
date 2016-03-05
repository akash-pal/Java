package pattern;
/*

Enter a number
5
1 A A A A A 
2 2 B B B B 
3 3 3 C C C 
4 4 4 4 D D 
5 5 5 5 5 E 

 */

import java.util.*;
public class Pattern18
{
 public static void main(String []args)
 {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter a number");
     int n=in.nextInt();
     int ascii=65;
      for(int i=1;i<=n;i++)
      {
          for(int j=1;j<=i;j++)
          System.out.print(i+" ");
          for(int j=i;j<=n;j++)
          {
          char k=(char)ascii;
          System.out.print(k+" ");
          }
          ascii++;
          System.out.println();
      }
      in.close();
     
  }
}
