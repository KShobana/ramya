package logical;

import java.util.Scanner;

public class GivenCharacterAlphabetOrNot {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the character ");
	char c=sc.next().charAt(0);
	if(Character.isAlphabetic(c))
	{
		System.out.println("The given character is a Alphabet");
	}
	else 
	{
		System.out.println("The given character is not a Alphabet");
	}
}
}
