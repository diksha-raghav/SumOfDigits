/* sum of digits of a number */
import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		long digits,summ=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		digits=sc.nextLong();
		add(digits,summ);
		
	}
	public static void add(long num,long sum)
		{
			long n;
			while(num!=0)
			{	
				n=num%10;
				sum=sum+n;
				num=num/10;
			}
			System.out.println("sum" +sum);
		}
		
	
}	