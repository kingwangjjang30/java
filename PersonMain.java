package test_person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		
		s1.name="염미정";
		s1.age=23;
		s1.online=true;
		
		s1.printInfo();
		
		SoccerPlayer s2=new SoccerPlayer();
		
		s2.name="구자경";
		s2.age=28;
		s2.teamName="서울FC";
		
		s2.printInfo();
		
		

	}

}
