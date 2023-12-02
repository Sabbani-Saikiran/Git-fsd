package Inheritance;

class A{
	public void methodA() {
		System.out.println("Base class method");
	}
}

class B extends A{
	public void methodB() {
		System.out.println("child class method");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.methodA();// calling super class method
		obj.methodB();// calling local method

	}

}


