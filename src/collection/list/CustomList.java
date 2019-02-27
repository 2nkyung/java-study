package collection.list;

public class CustomList {
	private String[] values;

	// 생성자 호출해야 values 값을 넣을 수 있음.
	public CustomList() {
		values = new String[0];
	}

	// ArrayList add()와 같은 내용
	public void add(String value) {
		String[] tmp = this.values;
		this.values = new String[this.values.length + 1];
		for (int i = 0; i < tmp.length; i++) {
			this.values[i] = tmp[i];
		}
		this.values[this.values.length - 1] = value;
	}

	public int size() {
		return this.values.length;
	}

	public String toString() {
		String r = "[";
		for (String str : this.values) {
			r += str + ",";
		}
		r = r.substring(0, r.length() - 1);
		r += "J";
		return r;
	}

	public int indexOf(String str) {
		for (int i = 0; i < this.values.length; i++) {
			if (str.equals(this.values[i])) {
				return i;
			}
		}
		return -1;

	}

	public int lastIndexOf(String str) {
		return -1;
	}

	public static void main(String[] args) {
		CustomList cl = new CustomList();
		System.out.println(cl.size());
		cl.add("str");
		System.out.println(cl.size());
		System.out.println(cl);

		System.out.println(cl.indexOf(new String("str")));

	}

}
