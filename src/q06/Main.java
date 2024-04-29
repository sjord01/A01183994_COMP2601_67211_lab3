package q06;

public class Main {
	public static void main(final String[] argv) {
		//implement the necessary interface and abstract class hierarchy
		
//		B::foo
//		B::foo
//		B::foo
		
		I ib = new B();
		A ab = new B();
		B bb = new B();
		go(ib);
		go(ab);
		go(bb);
	}
	
	private static void go(final I i) {
		i.foo();
	}

}
