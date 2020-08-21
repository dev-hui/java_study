package july_16th_oop03;

public class StudentTest {
	public static void main(String[] args) {
		StudentDTO s1 = new StudentDTO();
		s1.setName("오즈");
		s1.setKor(100);
		s1.setEng(90);
		s1.setMat(80);
		s1.setPhi(70);
		
		System.out.println("이름\t국어\t영어\t수학\t철학\t총점\t평균");
		System.out.println(s1);
	}
}
