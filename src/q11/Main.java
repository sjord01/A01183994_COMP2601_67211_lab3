package q11;

public class Main {
	public static void main(String[] args) {
		//implement the necessary abstract class hierarchy
		//NOTE: Bar class is unimplemented, meaning its body is empty.
		
//		AbstractFoo::go
//		AbstractFoo::away
//		AbstractFoo::away
//		Car::go
//		Car::away
//		AbstractFoo::go
//		AbstractFoo::away
//		AbstractFoo::away
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

abstract class AbstractFoo implements Foo{
	@Override
	public void go() {
		System.out.println("AbstractFoo::go");
	}
	
	void away() {
		System.out.println("AbstractFoo::away");
		System.out.println("AbstractFoo::away");
	}
}

class Bar extends AbstractFoo {
	
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

