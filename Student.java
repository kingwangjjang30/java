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
	
	//������ �����ε�
	
	
	public void print() {
		System.out.println("�л��� �̸��� "+name +" �̰�"+grade+"�г��Դϴ�.");
	}

}
