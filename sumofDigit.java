package PrgNote;

import java.util.Scanner;

public class sumofDigit {
	static void sum_digit(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int x=sc.nextInt();
		sum_digit(x);
	}

}
