package Testprepare;

import java.util.Scanner;

public class Ex5_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자입력:");
		int num=sc.nextInt();
		while(i<=num) {
			if(i%2==0)
			{
				sum=sum-i;
				System.out.print(-i);
			}
			else
			{
				sum=sum+i;
				System.out.print("+"+i);
			}
			//System.out.print(i);
			i+=1;
		}
		System.out.print("="+sum);
		
		

	}
}