package Testprepare;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int[] arr =new int[5];
		int max=0;
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���� 5���� �Է����ּ���.");
		for(int i=0;i<5;i++)
		{
			System.out.print((i+1)+"��° ���� �Է� : ");
			arr[i]=sc.nextInt();
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("�Է��� ���� �� �ִ밪�� "+max+"�Դϴ�");
	}

}
