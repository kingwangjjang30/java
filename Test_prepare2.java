package Test_prepare;

import java.util.Scanner;

public class Test_prepare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] num=new int[5];
		int max=0;
		System.out.println("정수 5개를 입력해주세요.");
		for(int i=0;i<5;i++)
		{
			
			System.out.print((i+1)+"번쨰 정수 : ");
			num[i]=sc.nextInt();
			if(max<num[i])
			{
				max=num[i];
			}
			
		}
		System.out.printf("입력한 값들 중 최대값은 %d입니다.",max);

	}

}
