//1) Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise.

  
import java.util.*;
public class program01{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int b = s.nextInt();
        int c = s.nextInt();
        int d  =s.nextInt(); 
        if(a==b && b==c && c==d && d==a){
            System.out.println("All are equal");
        }
        else System.out.println("Not equal !");
	}
}