package leader;

public class LeaderMain {
	public static void main(String args[])
	{
		Leader hong=new Leader("홍길동","30130",true);
		Leader kim=new Leader("김로봇","20100",false);
		hong.isLeader();
		kim.isLeader();
	}

}
