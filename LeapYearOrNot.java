package logical;

import java.util.Scanner;

public class LeapYearOrNot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year you want to cheak");
	int a=sc.nextInt();
	if(a%4==0)
	{
		System.out.println("The Given year is A LEAP YEAR");
	}
	else
	{
		System.out.println("The Given year is NOT A LEAP YEAR");
	}
}
}
