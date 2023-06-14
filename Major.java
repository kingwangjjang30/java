package test_book2;

public class Major extends Book{
	String subject;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		System.out.println("전공분야는 "+subject+"입니다.");
	}
	

}
