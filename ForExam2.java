package ForExam;

public class ForExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even_sum=0,odd_sum=0;
		for(int i =1;i<=10;i++)
		{
			if(i%2==0)
			{
				even_sum+=i;
			}
			else odd_sum+=i;
		}
		System.out.println("1���� 10������ ¦�� ���� "+even_sum+"�̰�, "+"Ȧ�� ���� "+odd_sum+"�Դϴ�.");

	}

}
