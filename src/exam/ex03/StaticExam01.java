package exam.ex03;

public class StaticExam01 {
	//접근제어자 고정 데이터타입 변수명 = 초기화 된것
	public static String name = "하하";

	public static void main(String[] args) {
		StaticExam01.name = "히히";
		StaticExam01 se01 = new StaticExam01();
		System.out.println(se01.name);
		System.out.println(StaticExam01.name);
	}
}
