package com.oops;

class Animal {
	void sound() {
		System.out.println("Animal Makes Sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
}

public class TestDemo {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
		Cat c = new Cat();
		c.sound();

	}

}
