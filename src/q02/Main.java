package q02;

public class Main {
	public static void main(final String[] argv) {
		// implement the necessary methods and classes

//		A::foo
//		B::foo

		A a = new A();
		B b = new B();
		go(a);
		go(b);
	}

	private static void go(final A a) {
		a.foo();
	}

	private static void go(final B b) {
		b.foo();
	}
}
