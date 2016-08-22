package logical;

import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number1");
	int a=sc.nextInt();
	System.out.println("enter the number2");
	int b=sc.nextInt();
	System.out.println("enter the number3");
	int c=sc.nextInt();
	if(a>b&&a>c)
	{System.out.println("The largest number is:"+a);
		
	}else if(b>a&&b>c)
	{
		System.out.println("The largest number is:"+b);
	}
	else
	{
		System.out.println("The largest number is:"+c);
	}
}
}
