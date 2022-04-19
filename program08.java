//8) Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.



import java.util.*;
public class program08{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    String str[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
   System.out.println(str[a-1]);
   
  }
}
