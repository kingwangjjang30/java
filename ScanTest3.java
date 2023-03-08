package hello;

import java.util.Scanner;

public class ScanTest3 {

	public static void main(String[] args) {
		int num1,num2,num3;
		int sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		num1=sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		num2=sc.nextInt();
		System.out.print("세번째 수 입력 : ");
		num3=sc.nextInt();
		sum=num1+num2+num3;
		avg=sum/3.0;
		System.out.printf("합계 : %d 평균 : %.1f", sum,avg);
		
	}

}
