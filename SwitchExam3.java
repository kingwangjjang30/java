package SwitchExam;

import java.util.Scanner;

public class SwitchExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� :");
		int a=sc.nextInt();
		int day;
		switch(a) {
		case 1: case 3:case 5:case 7:
		case 8: case 10 :case 12:
			day=31; break;
		case 4: case 6: case 9: case 11:
			day=30;break;
		default:
			day=28;break;
		}
		System.out.println(a+"���� "+day+"���Դϴ�.");

	}

}
