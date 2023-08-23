public class ShapeMain {
	
	public static void main(String[] args) {
		
		System.out.println("만들어진 도형의 개수 : " + Shape.shapeCnt);
		System.out.println("================================================");
		Circle c1 = new Circle("동그라미1", 9);
		Rectangle r1 = new Rectangle("네모1", 15, 15);
		c1.draw();
		r1.draw();
		System.out.println("================================================");
		System.out.println("만들어진 도형의 개수 : " + Shape.shapeCnt);
		System.out.println("================================================");
		c1.calculateArea();
		c1.calculateRound();
		System.out.println("================================================");
		r1.calculateArea();
		r1.calculateRound();
		System.out.println("================================================");
	}
}