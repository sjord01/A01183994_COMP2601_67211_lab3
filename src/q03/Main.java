package q03;

public class Main {
	public static void main(final String[] argv) {
		//implement the necessary methods and class hierarchy
		
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

