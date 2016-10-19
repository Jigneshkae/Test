import java.util.Scanner;

class calculator4
{
public static void main(String[]args)
{
	Scanner input = new Scanner(System.in);
	int x, i, fact=1;

	System.out.println("Enter a number");
	x = input.nextInt();

	for(i=1; i<=x; i++)
	{
		fact=fact*i;
	}
	System.out.println("Factorial of"+x+":"+fact);
}
}