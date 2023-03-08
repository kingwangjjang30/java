package hello;

import java.util.Scanner;

public class ScanTest2 {

	public static void main(String[] args) {
		String major,num,name;
		Scanner sc = new Scanner(System.in);
		System.out.printf("학과 : ");
		major = sc.next();
		System.out.printf("학번 : ");
		num = sc.next();
		System.out.printf("이름 : ");
		name = sc.next();
		System.out.println("저는 "+major+num+name+"입니다");
		
		

	}

}
