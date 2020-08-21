package oop9;

import org.junit.jupiter.api.Test;

public class Circle extends Shape {
	int r = 10;
	void size() {
		res = r*r*3.14;
	}
	
	@Test
	public void mytest() {
		Circle c = new Circle();
		c.size();
		System.out.println(c.res);
	}

	@Override
	void area() {
		size();
	}
}
