import java.util.Scanner;

class calculator1
{

public static void main(String[]args){

Scanner input = new Scanner(System.in); 

int x;

System.out.println("Enter Number");
x = input.nextInt();

if(x % 2 == 0)
	System.out.println("Number is Even");
else
	System.out.println("Number is odd");

}
}