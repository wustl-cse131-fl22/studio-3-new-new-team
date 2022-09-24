package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What numbers do you want to find prime numbers up to?");
		int n = in.nextInt();
		int[] p= new int[n];
		p[0]=1;
		p[1]=2;
		int position=2;
		
		for(int currentCount=3; currentCount<=n;currentCount++)
			{
			int isNotPrime=0;
			for(int tempCount=1;tempCount<=position-1;tempCount++) 
			{
				if ((currentCount% p[tempCount])==0)
				{
					isNotPrime++;
				}
				else
				{
					//do nothing
				}
			}
			if(isNotPrime==0)
				{
				//placement
				p[position]=(int) currentCount;
				System.out.println(currentCount + " is prime!");
				position++;
				}
			else 
			{
				//do nothing
			}
			}
		
		
		
	}

}
