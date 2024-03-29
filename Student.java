package com.neuedu.student;

public class Student {
	
	public String id;
	public String name;
	public char sex;
	public int age;
	public String grade;
    public String address;
    public String phone;
    public String email;
    public Student() {
    	
    }
	public Student(String id, String name, char sex, int age, String grade, String address, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", grade=" + grade
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}
    
}
