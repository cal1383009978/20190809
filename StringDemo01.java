package com.neuedu.student;

import java.util.Arrays;

/**
 * @author Freelancer_Carl
 * @data 2019��8��12��16:26:24
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
		
		//equals �� == ������
		/*
		 * == �ڱȽϻ����������͵�ʱ��Ƚ�ֵ
		 * �ڱȽ��������͵�ʱ��Ƚϵ�ַ
		 * equals
		 * ���û����дobject�ķ����Ƚϵ��ǵ�ַ
		 * �����д�˰�����д����
		 * */
		String string = new String("HEART");
		//System.out.println(str.equals(string));
		System.out.println(str.equalsIgnoreCase(string));
		
		//getChars()
		String string2 = "�Ұ��㣬�����㣬�������󰮴���";
		char[] newArray = new char[6];
		string2.getChars(0,6, newArray, 0);
		String string3 = new String (newArray);
		System.out.println(string3);
		
		//indexOf
		//String string4 = "���Ǻ���ӭ��Ʈ��";
		String string4 = "���Ǻ���ӭ��Ʈ��ǹ���";
		int  indexOf = string4.indexOf("��");
		System.out.println(indexOf);
		
		//isEmpty()
		//boolean empty = string4.isEmpty();
		//System.out.println(empty);
		
		//indexOf
		String string5 = "���Ǻ���ӭ��Ʈ��ǹ���";
		int  indexOf2 = string5.lastIndexOf("��");
		System.out.println(indexOf2);
		
		//replace
		String string6 = "banana";
		String replace = string6.replace('n','b');
		System.out.println(replace);
		
		//split
		String string7 = "���տ�����������ŭ�ţ����ҵ����黹�Ǻܲ���";
		String[] split = string7.split("��");
		//for(int i=0;i<split.length;i++) {
			//for(int i=0;i<=split.length;i++) {  //Ҫ�Ǽ�=�ᱨ��
			//System.out.println(split[i]);
		//}
		
		//foreachѭ�� ��ǿforѭ��
		//������
		for(String string8:split) {
			System.out.println(string8);
		}
		
		//startWith ��..��ʼ
		String string8 = "monitor";
		boolean startsWith = string8.startsWith("mon");
		//boolean startsWith = string8.startsWith("2mon");
		System.out.println(startsWith);
		
		//substring()
		String string9 = "���˵�Ц����������";
		//String substring = string9.substring(0,7);
		//String substring = string9.substring(0);
		String substring = string9.substring(5);
		System.out.println(substring);
				
		//toCharArray()
		String string10 = "�������ɽ�ĺ���";
		char[] charArray = string10.toCharArray();
		for(char c:charArray) {
			System.out.println(c);
		}
		
		//toLowerCase() תСд
		String string11 = "TRANSFORM";
		String lowerCase = string11.toLowerCase();
		System.out.println(lowerCase);
		
		//toUpperCase() ת��д
		String string12 = "transform";
		String upperCase = string11.toUpperCase();
		System.out.println(upperCase);
				
		//trim() ȥ��λ�Ŀո�
		String string13 = "  sa wa di ka  ";
		String trim = string13.trim();
		System.out.println(trim);
		
		//valueOf() ����������תΪString����
		//int num= 100;
		//String valueOf = String.valueOf(num);
		//System.out.println(valueOf+100);
		int sac= 9919;
		String valueOf = String.valueOf(sac);
		System.out.println(valueOf+1191);
	}
}
