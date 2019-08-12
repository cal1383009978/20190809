package com.neuedu.student;
/**
 * @author Freelancer_Carl
 * @data 2019年8月12日18:49:25
 * @Description:单选题类
 * @ClassName:SingleChoice
 * */
public class SingleChoice extends Queston {

	//选项
	String[] optison;
	
	//单选标准答案
	int answer;

	//构造器
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
