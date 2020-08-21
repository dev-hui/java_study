package api;

import java.io.Serializable;

public class MemberDTO implements Serializable {
	private String name;
	private String position;
	private double height;
	private int age;
	
	public MemberDTO(String name, String position, double height, int age) {
		this.name = name;
		this.position = position;
		this.height = height;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", position=" + position + ", height=" + height + ", age=" + age + "]";
	}
	
	
}
