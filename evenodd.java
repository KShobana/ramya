package beginer;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
int n=sc.nextInt();
if(n==0)
{
	System.out.println("The given number is neither even nor odd");
}else if(n%2==0)
{
	System.out.println("The given number is even ");
}else
{
	System.out.println("the given number is odd");
}

	}
}