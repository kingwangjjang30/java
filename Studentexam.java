package student0503;

public class Studentexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("김현우");
		kim.setGrade(2);
		
		Student jang = new Student();
		jang.setName("장민재");
		jang.setGrade(3);
		
		
		kim.print();
		jang.print();
		//System.out.println("학생의 이름은 "+kim.getName()+"이고, "+kim.getGrade()+"학년입니다." );
		//System.out.println("학생의 이름은 "+jang.getName()+"이고, "+jang.getGrade()+"학년입니다.");
	}

}
