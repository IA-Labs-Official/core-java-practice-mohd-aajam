//10)Write a program in Java to display the n terms of odd natural number and their sum.

import java.util.*;
public class program10{
  public static void main (String[]args)  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    n*=2;
    
    int sum=0;
    for(int i=0;i<n;i++){
        if(i%2!=0) {System.out.println(i);
        sum+=i;}
    }
    System.out.println("Sum is "+ sum);
    


  }
}
