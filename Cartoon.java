package test_book2;

public class Cartoon extends Book{
	boolean webtoon;

	@Override
	void printBook() {
		// TODO Auto-generated method stub
		super.printBook();
		if(webtoon==true)
		{
			System.out.println("이 만화는 웹툰입니다.");
		}
		else
		{
			System.out.println("이 만화는 웸툰이 아닙니다.");
		}
		
	}
	
	

}
