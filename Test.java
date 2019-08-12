package com.neuedu.student;
/**
 * @author Freelancer_Carl
 * @data 2019年8月12日19:08:46
 * @Description:测试单选和多选题类
 * @ClassName:Test
 * */
public class Test {

	public static void main(String[] args) {
		//构建多选题
		MultiChoice mChoice = new MultiChoice("哪些是您看上的车？",new String[] {"1.帝豪","2.红旗","3.哈佛","4.奔腾","5.长城"}, new int[] {4,5}) ;
		//int[] answer = new int[] {1,5};
		int[] answer = new int[] {4,5};
		boolean check= mChoice.check(answer);
		//System.out.println(check);
		
		//构建单元选项
		SingleChoice sc =new SingleChoice("您要买哪辆车？",new String[] {"1.帝豪","2.红旗","3.哈佛","4.奔腾","5.长城"},3);
		boolean check2 = sc.check(new int[] {3,2,1});
		//boolean check2 = sc.check(new int[] {1/2/4/5}); //除3以外都是false
		System.out.println(check2);
	}
}
