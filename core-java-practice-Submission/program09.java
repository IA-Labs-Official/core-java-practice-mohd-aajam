//9) Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message


import java.util.*;
public class program09{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    char b = sc.next().charAt(0);


int a=b;
  if((a<65 || a>90) && (a<97 || a>122) )
System.out.println("Give a valid input"); 
if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U') System.out.println("Its a vovel");
else System.out.println("Its a consonent");   
  }
}
