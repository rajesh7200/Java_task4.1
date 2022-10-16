package PrgNote;

import java.util.Scanner;

public class Armstrong {
	
	static void cube(int num)
	{
		int sum=0;
		int copy=num;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(copy==sum)
		{
			System.out.println(sum+" it's a Amsstrong number.");
		}
		else {
		System.out.println(sum+" it not a amstrong number.");
		}
	}


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :123");
		int x=sc.nextInt();
		cube(x);
	}

}
