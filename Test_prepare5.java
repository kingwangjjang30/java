package Test_prepare;

import java.util.Scanner;

public class Test_prepare5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력 : ");
		int month=sc.nextInt();
		int day;
		switch(month)
		{
		case 2:
			day=28; break;
		case 4: case 6: case 9: case 11:
			day=30;break;
		default:
			day=31;break;
		}
		System.out.printf("%d월은 %d일입니다.",month,day);

	}

}
