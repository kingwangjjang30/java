  package ArrExam;

import java.util.Scanner;

public class ArrExam6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("���� �Է� : ");
			a[i]=sc.nextInt();

		}
		for(int j=0; j < a.length ; j++)
		{
			System.out.println(a[j]);
		}
	}

}
