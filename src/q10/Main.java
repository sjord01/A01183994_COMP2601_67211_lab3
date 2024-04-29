package q10;

public class Main {
	public static void main(String[] args) {
		// implement the necessary abstract class hierarchy

//		Bar::go
//		Bar::away
//		Car::go
//		Car::away
//		Bar::go
//		Bar::away
//		Car::go
//		Car::away
//		Car::go
//		Car::away

		AbstractFoo a = new Bar();
		AbstractFoo b = new Car();
		Bar c = new Bar();
		Bar d = new Car();
		Car e = new Car();
		a.go();
		a.away();
		b.go();
		b.away();
		c.go();
		c.away();
		d.go();
		d.away();
		e.go();
		e.away();
	}
}

interface Foo {
	void go();
}

abstract class AbstractFoo implements Foo {
	abstract void away();
}

class Bar extends AbstractFoo {
	
	@Override
	public void go() {
		System.out.println("Bar::go");
	}

	@Override
	void away() {
		System.out.println("Bar::away");
	}

}

class Car extends Bar {
	
	@Override
	public void go() {
		System.out.println("Car::go");
	}

	@Override
	void away() {
		System.out.println("Car::away");
	}
}
