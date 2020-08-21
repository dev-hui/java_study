package july_16th_oop09;

public abstract class Shape {  // 추상 메서드 하나라도 있으면 추상 클래스여야 함
	double res;
	abstract void area();  // 추상 메서드 : 불완전 -> 무조건 오버라이딩 할수 있게 해줌
}
