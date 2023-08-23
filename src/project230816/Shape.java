package project230816;

public abstract class Shape() {
	private String name;
	protected final static double PI=3.14;
	protected static int shapeCnt=0;
	
	public Shape() {
		shapeCnt++;
	}
	public Shape(String name) {
		this();
		this.name=name;
		
	}
	public void draw() {
		System.out.println("["+name+"도형 그리기]");
		
	}
	public abstract void calcurate() {
		
	}
	
	
	
	
}
