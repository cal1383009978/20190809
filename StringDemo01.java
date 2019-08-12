package com.neuedu.student;

import java.util.Arrays;

/**
 * @author Freelancer_Carl
 * @data 2019年8月12日16:26:24
 * @Description:String
 * @ClassName:StringDemo01 API
 * */
public class StringDemo01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "heart";
		//String string = new String("heart");
		//System.out.println(str==string);
		char charAt = str.charAt(4);
		//System.out.println(charAt);
		
		//concat
		String str2 = "love";
		String concat = str+str2;
		//System.out.println(concat);
		
		//endsWidth
		String str3 = "zero.jpg";
		boolean endsWith = str3.endsWith(".jpg");
		//boolean endsWith = str3.endsWith(".bpg");
		//System.out.println(endsWith);
		
		//equals 和 == 的区别
		/*
		 * == 在比较基本数据类型的时候比较值
		 * 在比较引用类型的时候比较地址
		 * equals
		 * 如果没有重写object的方法比较的是地址
		 * 如果重写了按照重写规则
		 * */
		String string = new String("HEART");
		//System.out.println(str.equals(string));
		System.out.println(str.equalsIgnoreCase(string));
		
		//getChars()
		String string2 = "我爱你，爱着你，就像老鼠爱大米";
		char[] newArray = new char[6];
		string2.getChars(0,6, newArray, 0);
		String string3 = new String (newArray);
		System.out.println(string3);
		
		//indexOf
		//String string4 = "五星红旗迎风飘扬";
		String string4 = "五星红旗迎风飘扬，星光璀璨";
		int  indexOf = string4.indexOf("星");
		System.out.println(indexOf);
		
		//isEmpty()
		//boolean empty = string4.isEmpty();
		//System.out.println(empty);
		
		//indexOf
		String string5 = "五星红旗迎风飘扬，星光璀璨";
		int  indexOf2 = string5.lastIndexOf("星");
		System.out.println(indexOf2);
		
		//replace
		String string6 = "banana";
		String replace = string6.replace('n','b');
		System.out.println(replace);
		
		//split
		String string7 = "今日狂风大作，阴雨怒号，但我滴心情还是很不错";
		String[] split = string7.split("，");
		//for(int i=0;i<split.length;i++) {
			//for(int i=0;i<=split.length;i++) {  //要是加=会报错
			//System.out.println(split[i]);
		//}
		
		//foreach循环 增强for循环
		//迭代器
		for(String string8:split) {
			System.out.println(string8);
		}
		
		//startWith 以..开始
		String string8 = "monitor";
		boolean startsWith = string8.startsWith("mon");
		//boolean startsWith = string8.startsWith("2mon");
		System.out.println(startsWith);
		
		//substring()
		String string9 = "迷人的笑脸吸引视线";
		//String substring = string9.substring(0,7);
		//String substring = string9.substring(0);
		String substring = string9.substring(5);
		System.out.println(substring);
				
		//toCharArray()
		String string10 = "你可听到山的呼唤";
		char[] charArray = string10.toCharArray();
		for(char c:charArray) {
			System.out.println(c);
		}
		
		//toLowerCase() 转小写
		String string11 = "TRANSFORM";
		String lowerCase = string11.toLowerCase();
		System.out.println(lowerCase);
		
		//toUpperCase() 转大写
		String string12 = "transform";
		String upperCase = string11.toUpperCase();
		System.out.println(upperCase);
				
		//trim() 去首位的空格
		String string13 = "  sa wa di ka  ";
		String trim = string13.trim();
		System.out.println(trim);
		
		//valueOf() 将其他类型转为String类型
		//int num= 100;
		//String valueOf = String.valueOf(num);
		//System.out.println(valueOf+100);
		int sac= 9919;
		String valueOf = String.valueOf(sac);
		System.out.println(valueOf+1191);
	}
}
