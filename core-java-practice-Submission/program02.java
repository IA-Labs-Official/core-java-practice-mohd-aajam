//2) Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

import java.util.*;
public class program02{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	double a = s.nextDouble();
	double b = s.nextDouble();
	if(a>0 && a<1 && b>0 && b<1) System.out.println("True");
	else System.out.println("False");
	}
}