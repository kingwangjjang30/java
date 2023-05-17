package student0517;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(){
		
	}
	public Student(String n)
	{
		name=n;
	}
	public Student(String n, int g)
	{
		name = n;
		grade= g;
	}
	
	//생성자 오버로딩
	
	
	public void print() {
		System.out.println("학생의 이름은 "+name +" 이고"+grade+"학년입니다.");
	}

}
