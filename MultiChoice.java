package com.neuedu.student;

import java.util.Arrays;

/**
 * @author Freelancer_Carl
 * @data 2019��8��12��18:43:35
 * @Description:��ѡ����
 * @ClassName:MultiChoice
 * */
public class MultiChoice extends Queston {

	//ѡ��
	String[] optison;
	
	//��ѡ��׼��
	int[] answers;

	public MultiChoice(String text,String[] optison, int[] answers) {
		this.text = text;
		this.optison = optison;
		this.answers = answers;
	}
	
	@Override
	public boolean check(int[] as) {
		//�ж��Ƿ�Ϊnull
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
