package com.neuedu.student;

import java.util.Arrays;

/**
 * @author Freelancer_Carl
 * @data 2019年8月12日18:43:35
 * @Description:多选题类
 * @ClassName:MultiChoice
 * */
public class MultiChoice extends Queston {

	//选项
	String[] optison;
	
	//多选标准答案
	int[] answers;

	public MultiChoice(String text,String[] optison, int[] answers) {
		this.text = text;
		this.optison = optison;
		this.answers = answers;
	}
	
	@Override
	public boolean check(int[] as) {
		//判断是否为null
		if(answers != null && as.length == answers.length) {
			Arrays.sort(as);
			for(int i=0;i<as.length;i++){
				if(as[i]!= answers[i] ){
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
}
