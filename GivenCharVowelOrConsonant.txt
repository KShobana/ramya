package logical;

import java.util.Scanner;

public class charvowelornot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the character");
	char c=sc.next().charAt(0);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		System.out.println("The given character is vowel");
	}
	else 
	{
		System.out.println("The given character is consonant");
	}
}
}
