import java.util.Scanner;

class calculator
{

public static void main(String[]args){

Scanner input = new Scanner(System.in); 

int no1;
int no2;
int no3;
double average;

System.out.println("Enter The First Number");
no1 = input.nextInt();

System.out.println("Enter The Second Number");
no2 = input.nextInt();

System.out.println("Enter The Third Number");
no3 = input.nextInt();

average= (no1 + no2 + no3) / 3;

System.out.println("Average = "+average);

}

}