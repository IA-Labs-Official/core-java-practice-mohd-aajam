//4) Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 

import java.util.*;
public class program04{
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 if(a<0 || a>1000) {System.out.println("Please aukaat me raho"); return;}
	 //223
	 int sum=0;
	 while(a!=0){
	     int b = a%10;
	     a/=10;
	     sum+=b;
	 }
	 System.out.println(sum);
	}
}
