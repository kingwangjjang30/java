import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

public class MyInfo extends JFrame{
	//멤버변수 선언
	String[] year = {"2005","2006","2007","2008","2009"};//연도
	Integer[] month = new Integer[12];//달
	String[] day = new String[31];
	JPanel p0;
	
	Font defaultFont = new Font("굴림",Font.BOLD,20);//기본 폰트 세팅
	
	
	
	//리스트 생성
	JList<String> listYear = new JList<>(year);
	JList<Integer> listMonth = new JList<>(month);
	JList<String> listDay = new JList<>(day);//!!!! 부호 잘 보기 !!!!
	
	//라디오 버튼
	JRadioButton radio_male = new JRadioButton("남자");
	JRadioButton radio_female = new JRadioButton("여자");
	
	//sample 레이블 셋팅
	JLabel sample = new JLabel("20510 선승표");
	
	//CheckBox 생성
	JCheckBox check_agree = new JCheckBox("개인정보 제고에 동의합니다.");
	
	//버튼 생성
	JButton btnOk = new JButton("확인");
	JButton btnNo = new JButton("취소");
	
	private void 선생님_제공_기초화면() {
		setTitle("수행평가 연습");
		setBounds(0, 0, 450, 500);
		setTitle("수행평가 연습");

		p0 = new JPanel(null);
		add(p0);
		
		//월, 일 표현에는 스크롤이 필요합니다.
		JScrollPane scrollPane1 = new JScrollPane(listMonth);
		JScrollPane scrollPane2 = new JScrollPane(listDay);

		// 리스트
		listYear.setBounds(10, 30, 90, 160);
		scrollPane1.setBounds(120, 30, 90, 160);
		scrollPane2.setBounds(220, 30, 90, 160);

		//라디오 버튼 생성
        radio_male.setBounds(320, 30, 80, 50);
        radio_female.setBounds(320, 80, 80, 50);
	    radio_male.setFont(defaultFont);
	    radio_female.setFont(defaultFont);
	    radio_male.setSelected(true);
	    
		//라벨
		sample.setBounds(10, 180, 500, 50);
		sample.setFont(defaultFont);

		//CheckBox
		check_agree.setBounds(10, 300, 500, 50);
		check_agree.setFont(defaultFont);
		
		//버튼 2개
		btnOk.setBounds(100, 360, 80, 20);
		btnNo.setBounds(200, 360, 80, 20);
		//모든 항목 패널에 더하기
		
		p0.add(listYear);
		p0.add(scrollPane1);
		p0.add(scrollPane2);
        p0.add(radio_male);
        p0.add(radio_female);
		p0.add(sample);
		p0.add(check_agree);
		p0.add(btnOk);
		p0.add(btnNo);
		

		//화면이 열리면 첫 항목 강제 선택 
		listYear.setSelectedIndex(0);
		listMonth.setSelectedIndex(0);
		listDay.setSelectedIndex(0);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyInfo();
		
	}
	MyInfo(){
		//1. JList에 항목을 추가하는 코드 작성
		
		for (int i=0; i<12 ; i++)
		{
			Integer[] month = {i};
		}
		for (int i=0; i<3 ;i++)
		{
			day[i-1] = String.valueOf(i);
		}
        listMonth.setListData(month);
		//2. 라디오 버튼을 그룹에 추가하여 하나ㅕㄴ 선택되로록 코드 작성
		ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(radio_male);
        genderGroup.add(radio_female);
		//화면 디자인
		선생님_제공_기초화면();
		
		//3. 이벤트 (2개)
		
		//화면 보이기
		setVisible(true);
	}
}
