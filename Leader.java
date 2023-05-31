package leader;

public class Leader extends Student{
	boolean lead;
	
	public Leader()
	{
		
	}
	public Leader(String name, String hakbun, boolean lead)
	{
		
		this.name=name;
		this.hakbun=hakbun;
		this.lead=lead;
	}
	public void isLeader()
	{
		if(lead==true)
		{
			System.out.println(name+"은 학급회장이다.");
		}
		else
		{
			System.out.println(name+"은 학급회장이 아니다.");
		}
	}

}
