package method;

public class Methods {
	// 오버로딩
	// 리턴하는것 > 같은 데이터 타입일 경우 대입가능, 호출가능
	// 리턴하지 않는것 > 호출만 가능

	int test(int a, String str) {
		return 0;
	}

	void test(String str, int a) {

	}

	static String getStr() {
		return "abc";
	}

	static void setStr(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		setStr("abc");
		String str = getStr();
		System.out.println(str);
	}
}
