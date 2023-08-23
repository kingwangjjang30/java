package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("유재석");
		list.add("지석진");
		list.add("김종국");
		list.add("송지효");
		list.add("하하");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list);
		
		System.out.println("+++++++++++++++++++");
		
		System.out.println("신청학생수(삭제전) : "+list.size());
		list.remove("김종국");
		System.out.println("신청학생수(삭제후) : "+list.size());
		
		System.out.println("+++++++++++++++++++");
		
		for(String s: list) {
			System.out.println(s);
		}
		System.out.println("+++++++++++++++++++");
		
		System.out.println("이름변경전: "+list.get(0));
		list.set(0, "이수근");
		System.out.println("이름변경후: "+list.get(0));
		
		System.out.println(list.indexOf("송지효"));
		if(list.contains("송지효")) {
			System.out.println("송지효가 포함되어 있네요. ");
		}
		else {
			System.out.println("송지효가 포함되어 있지 않네요.");
		}
		System.out.println("+++++++++++++++++++");
		
		list.isEmpty();
		
		if(list.isEmpty()) {
			System.out.println("학생수: "+list.size());
		}
		list.add("모모");
		list.add("지효");
		list.add("다현");
		list.add("사나");
		list.add("미나");
		
		Collections.sort(list);
		
		for(String string:list) {
			System.out.println(string);
		}
		
	}

}
