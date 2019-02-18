package exam.ex01;

public class StringEqual {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = s1;
		String s3 = s1;
		System.out.println(s1==s2);
		System.out.println();
		
		String c1 = new String("a");
		String c2 = new String("a");
		String c3 = new String("a");
		System.out.println(c1==c2);
		System.out.println(s1==c1);
	}
}
