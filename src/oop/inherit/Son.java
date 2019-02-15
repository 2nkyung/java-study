package oop.inherit;

class GrandFather{
	void work() {
		System.out.println("할아버지가 농사를 짓습니다.");
	}
}

class Father extends GrandFather {
	void work() {
		//super는 위에꺼
		//this 는 내꺼
		super.work();
		System.out.println("아빠가 일함.");
	}
	
}
public class Son extends Father {	
	//오버라이딩 조건
	//첫번째 조건 상속이 시작되어야함!
	//메소드명이 같아야한다.
	//파라미터, 데이터타입, 갯수까지 동일해야한다.
	//리턴 데이터타입도 메소드의 데이터타입까지 동일해야함.
	void work() {
		super.work();
		System.out.println("아들이 공부함.");
	}
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}
