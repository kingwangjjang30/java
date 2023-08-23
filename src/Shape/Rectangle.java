package Shape;

public abstract class Rectangle extends Shape{
	
	private int width,hegiht;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String name,int width, int hegiht) {
		super(name);
		this.width = width;
		this.hegiht = hegiht;
	}
	public void draw() {
		System.out.println("가로가 "+width+"세로가 "+hegiht+"인 사각형의 넓이는 "+width*hegiht+"입니다." );
	}
	
	public void calculateArea() {
	System.out.println("가로가 " + width + " 세로가 " + hegiht + "인 사각형의 넓이는 "+ width*hegiht + "입니다.");
	}
	
	public void calculateRound() {
	System.out.println("가로가 " + width + " 세로가 " + hegiht + "인 사각형의 둘레는 "+ 2*(width+hegiht) + "입니다.");
	}
	
}
