package beginer;

import java.util.Scanner;

public class givennumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	if(a<0)
	{
		System.out.println("the given number is negative");
	}
	else if(a>0)
	{
		System.out.println("the given number is posive");
	}
	else
		
		{
			System.out.println("the given number is neither positive nor negative");
		}
}
}