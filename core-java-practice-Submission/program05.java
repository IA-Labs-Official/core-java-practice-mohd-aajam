//5) Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).


import java.util.*;
public class program05 {
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum is "+(a+b));
    System.out.println("Difference is "+(b-a));
    System.out.println("Product is "+(a*b));
    System.out.println("Average is "+(a+b)/2);
    System.out.println("Distance is "+Math.abs(a-b));
    String str =(a>b)?"a is greater":(a==b)?"Both are equal":"b is greater";
    System.out.println(str);
  }
}
