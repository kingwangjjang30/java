package Testprepare;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		int[] arr =new int[5];
		int max=0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 5개를 입력해주세요.");
		int i=0;
		while(i<5)
		{
			System.out.print((i+1)+"번째 정수 입력 : ");
			arr[i]=sc.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
			i+=1;
		}
		System.out.println("입력한 값들 중 최대값은 "+max+"입니다");
		
		

	}

}
