
class calculator2
{
public static void main(String[]args)
{

	int even = 0;
	int i;

	for(i=1;i<=1000;i++)
	{
		if(i % 2 == 0)
		{
			even++;
		}
	}
	System.out.println("number of even numbers between 1-1000 :" +even);
}
}