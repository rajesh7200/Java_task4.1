package PrgNote;

import java.util.Scanner;

public class SumofSqure {

	static void squre(int num)
	{
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int x=sc.nextInt();
		squre(x);
	}


}
