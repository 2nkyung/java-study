package practice;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {
		int a = (int) (Math.random());
		double b = Math.random()*10 + 1;
		System.out.println(b);

		String message;
		int message2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Name?");
		//문자 스트링의 출력
		message = scan.nextLine();//입력 메소드의 호출
		System.out.println("Birth year?"); //문자 스트링의 출력
		message2 = scan.nextInt(); //입력 메소드의 호출
		message2 = 2019 - message2 + 1;
		System.out.println(message + "나이는" + message2 + "입니다");
	}
}
