package student0503;

public class Student {
	
	private String name;
	private int grade;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setGrade(int grade)
	{
		this.grade=grade;
	}
	public int getGrade()
	{
		return grade;
	}
	public void print()
	{
		System.out.println("�л��� �̸��� "+this.name+"�̰�, "+this.grade+"�г��Դϴ�.");
	}

}
