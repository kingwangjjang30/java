package student0405;

public class Student {
	String name;
	int grade;
	int ban;
	int number;
	private int weight;
	private String telephone;
	
	
	String getTelephone() {
		return telephone;
	}
	void setTelephone(String telephone)
	{
		this.telephone=telephone;
	}
	
	public void eat()
	{
		weight += 10;
	}
	public void run()
	{
		weight -= 10;
	}
	

}
