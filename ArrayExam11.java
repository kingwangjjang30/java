package ArrExam;

import java.util.Scanner;

public class ArrayExam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score[]=new int[5];
		int sum=0;
		double avg = 0;
		for(int i=0;i<score.length;i++)
		{
			System.out.println("성적 입력 : ");
			score[i]=sc.nextInt();
			sum+=score[i];
		}
		System.out.println("합계 : "+sum);
		avg=sum/5.0;//avg=(double)sum/5;
		System.out.printf("평균 : %.1f",avg);
	}
}