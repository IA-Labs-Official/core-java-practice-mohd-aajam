//6) Write java program to get a number from the user and print whether it is positive or negative


import java.util.*;
public class program06{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
   if(a>0) System.out.println("Number is positive"); else System.out.println("Negative");
   
   
  }
}
