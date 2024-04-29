package q04;

import q03.A;
import q03.B;

public class Main {
	public static void main(final String[] argv) {
		//implement the necessary method and class hierarchy
		
//		A::foo
//		B::foo
//		B::foo
		
		A aa = new A();
		A ab = new B();
		B bb = new B();
		go(aa);
		go(ab);
		go(bb);
	}
	
	private static void go(final A a) {
		a.foo();
	}

	private static void go(final B b) {
		b.foo();
	}
}
