package test_person;

public class Student extends Person{
	boolean online;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		
		if(online==true)
		{
			System.out.println(name+"은 학생이며 현재 온라인 수업 중입니다.");
		}
		else
		{
			System.out.println(name+"은 학생이며 현재 등교 중입니다.");
		}
		
	}

}
