package test_person;

public class SoccerPlayer extends Person{
	String teamName;

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(name+"는(은) "+teamName+"팀 축구선수 입니다.");
	}
	

}
