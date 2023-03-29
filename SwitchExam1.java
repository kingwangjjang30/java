package SwitchExam;

public class SwitchExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=10;
		char op='*';
		switch(op) {
		case '+' : System.out.println(a+" + "+b+" = "+(a+b));break;
		case '-' : System.out.println(a+" - "+b+" = "+(a-b));break;
		case '*' : System.out.println(a+" * "+b+" = "+(a*b));break;
		case '/' : System.out.println(a+" / "+b+" = "+(a/b));break;
		default : System.out.println("사칙연산자가 아닙니다.");break;
		}
	}

}
