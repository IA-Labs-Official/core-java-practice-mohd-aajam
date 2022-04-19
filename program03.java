//3) Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

import java.util.*;
public class program03{
	public static void main(String[] args) {
	   int arr[] = {1,3,2,4,5,7,6,8,9,5};
	  Arrays.sort(arr);
	  Scanner sc = new Scanner(System.in);
	  int k = sc.nextInt();
int size = arr.length;
	  System.out.println(arr[size-k]);
	   
	}
}