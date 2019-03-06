package oop.inter;

public class Execute {

	static void doWork(Work d) {
		d.goOffice();
		d.working();
		d.eat();
		d.goHome();
	}

	public static void main(String[] args) {
		Developer d = new Developer();
		Manager m = new Manager();
		doWork(d);
		doWork(m);
	}
//		
//		Work w = new Developer();
//		w.goOffice();
//		w.working();
//		w.goHome();
//		w.eat();
//
//		w = new Manager();
//		w.goOffice();
//		w.working();
//		w.goHome();
//		w.eat();
//
//	}
//
}
