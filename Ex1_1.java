package Testprepare;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		int[] arr =new int[5];
		int max=0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է����ּ���.");
		int i=0;
		while(i<5)
		{
			System.out.print((i+1)+"��° ���� �Է� : ");
			arr[i]=sc.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
			i+=1;
		}
		System.out.println("�Է��� ���� �� �ִ밪�� "+max+"�Դϴ�");
		
		

	}

}
