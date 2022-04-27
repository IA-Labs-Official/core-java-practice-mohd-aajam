//7) Take three numbers from the user and print the greatest number


import java.util.*;
public class program07{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
     int b = sc.nextInt();
      int c = sc.nextInt();
   if(a>b && a>c) System.out.println("A is greatest");
   else if (b>c) System.out.println("B is greatest");
   else System.out.println("C is greatest");
  }
}
