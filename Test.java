package com.neuedu.student;
/**
 * @author Freelancer_Carl
 * @data 2019��8��12��19:08:46
 * @Description:���Ե�ѡ�Ͷ�ѡ����
 * @ClassName:Test
 * */
public class Test {

	public static void main(String[] args) {
		//������ѡ��
		MultiChoice mChoice = new MultiChoice("��Щ�������ϵĳ���",new String[] {"1.�ۺ�","2.����","3.����","4.����","5.����"}, new int[] {4,5}) ;
		//int[] answer = new int[] {1,5};
		int[] answer = new int[] {4,5};
		boolean check= mChoice.check(answer);
		//System.out.println(check);
		
		//������Ԫѡ��
		SingleChoice sc =new SingleChoice("��Ҫ����������",new String[] {"1.�ۺ�","2.����","3.����","4.����","5.����"},3);
		boolean check2 = sc.check(new int[] {3,2,1});
		//boolean check2 = sc.check(new int[] {1/2/4/5}); //��3���ⶼ��false
		System.out.println(check2);
	}
}
