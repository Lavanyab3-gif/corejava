package com.Constructors;

public class Constructor1 {
	int id;
	String name;
	int Age;
	char gender;

	Constructor1() {
		System.out.println("no-args constructor called");
	}

	Constructor1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Constructor1(int id, String name, int Age) {
		this.id = id;
		this.name = name;
		this.Age = Age;

	}

	Constructor1(int id, String name, int Age, char gender) {
		this.id = id;
		this.name = name;
		this.Age = Age;
		this.gender = gender;
	}

	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
		c.info();
		Constructor1 c1 = new Constructor1(1, "Lava");
		c1.info();
		Constructor1 c2 = new Constructor1(2, "Sai", 23);
		c2.info();
		Constructor1 c3 = new Constructor1(3, "Durga", 22, 'F');
		c3.info();

	}

	void info() {

		System.out.println("Id is:" + id);
		System.out.println("Name is:" + name);
		System.out.println("Age is:" + Age);
		System.out.println("Gender is:" + gender);
		System.out.println("*********");
	}

}
