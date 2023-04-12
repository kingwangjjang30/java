package Testprepare;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr =new int[5];
		int max=0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력해주세요.");
		for(int i=0;i<5;i++)
		{
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i]=sc.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("입력한 값들 중 최대값은 "+max+"입니다");
	}

}
