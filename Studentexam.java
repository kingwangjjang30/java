package student0503;

public class Studentexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("������");
		kim.setGrade(2);
		
		Student jang = new Student();
		jang.setName("�����");
		jang.setGrade(3);
		
		
		kim.print();
		jang.print();
		//System.out.println("�л��� �̸��� "+kim.getName()+"�̰�, "+kim.getGrade()+"�г��Դϴ�." );
		//System.out.println("�л��� �̸��� "+jang.getName()+"�̰�, "+jang.getGrade()+"�г��Դϴ�.");
	}

}
