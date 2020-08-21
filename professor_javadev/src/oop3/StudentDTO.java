package oop3;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int phi;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getPhi() {
		return phi;
	}
	public void setPhi(int phi) {
		this.phi = phi;
	}
	@Override
	public String toString() {
		return  name + "\t" + kor + "\t" + eng + "\t" + 
				mat + "\t" + phi + "\t" +
				getTotal() + "\t" + getAvg();
	}
	private int getAvg() {
		return getTotal() / 4;
	}
	private int getTotal() {
		return getKor() + getEng() + getMat() + getPhi();
	}
	
	
}
