package hello;

import java.util.Scanner;

public class ScanTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해 주세요.");
		int age = sc.nextInt();
		System.out.printf("내 나이는 %d입니다",age);
		
	}

}
