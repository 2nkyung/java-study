package syntax;

public class Condition {

	public static void main(String[] args) { 
		int num1 = 1;
		int num2 = 2;
		// ==같냐는 질문, !=다르냐는 질문
		boolean isEqual = num1==num2;
		// ! 부정연산자로써 변수명앞에 ! 붙이면 변수가 참일때 거짓으로, 거짓일땐 참으로 변환
		if(!isEqual) {
			System.out.println("num1과 num2는 같습니다");
		}else {
			System.out.println("num1과 num2는 다릅니다");
		}
	}
}
