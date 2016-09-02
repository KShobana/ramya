package logical;

import java.util.Scanner;

public class hello5times {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String str="Hello";
	String out="";
	for(int i=0;i<5;i++)
	{
		out +=str;
	}
	System.out.println(out);
}
}
