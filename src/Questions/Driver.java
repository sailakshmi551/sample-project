package Questions;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		System.out.println("Factorial of " + n + " is: " + fact(n));
		input.close();
	}
	static int fact(int n)
	{
		if(n == 0 || n == 1)
		{
			System.out.println(n);
			return 1;		
		}
		else
		//	System.out.println(n);
			//return n * fact(n - 1);
			n = n*fact(n-1);
		return n;
	}
}
