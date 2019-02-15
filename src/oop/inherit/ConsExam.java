package oop.inherit;

class Book {
	String name;
	Book(String name) {
		this.name = name;
	}

	Book() {
		//는 this("자바의 정석");
		this.name = "자바의 정석";
	}
}

public class ConsExam extends Book{
	ConsExam() {
		super("자바의 정석");
	}
	public static void main(String[] args) {
		//Book b = new Book();
		//System.out.println(b.name);
		ConsExam ce = new ConsExam();
		System.out.println(ce.name);
	}
}
