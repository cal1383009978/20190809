package com.neuedu.student;
/**
 * @author Freelancer_Carl
 * @data 2019��8��12��18:49:25
 * @Description:��ѡ����
 * @ClassName:SingleChoice
 * */
public class SingleChoice extends Queston {

	//ѡ��
	String[] optison;
	
	//��ѡ��׼��
	int answer;

	//������
	public SingleChoice(String text,String[] optison, int answer) {
		this.text = text;
		this.optison = optison;
		this.answer = answer;
	}
	
	@Override
	public boolean check(int[] answers) {
		
		return this.answer == answers[0];
	}

}
