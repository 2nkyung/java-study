package oop;

public class ThisExam2 {
	
	int num1 = 5;
	String str= "a";

	ThisExam2() {}

	ThisExam2(int num1, String str) {
		
		System.out.println(this.num1);
		System.out.println(this.str);
		this.num1 = num1;
		this.str = str;
		System.out.println(this.num1);
		System.out.println(this.str);
	}

	public static void main(String[] args) {
		ThisExam2 te = new ThisExam2(10,"abc");
	}

}
