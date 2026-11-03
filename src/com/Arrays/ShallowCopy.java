package com.Arrays;

class Adress {
	String city;

	public Adress(String city) {

		this.city = city;
	}

}

public class ShallowCopy implements Cloneable {
	int Id;
	String name;
	Adress adress;

	public ShallowCopy(int id, String name, Adress adress) {

		Id = id;
		this.name = name;
		this.adress = adress;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Adress add = new Adress("Hyderabad");
		ShallowCopy sc = new ShallowCopy(101, "Lavanya", add);

		ShallowCopy sc1 = (ShallowCopy) sc.clone();
		System.out.println(sc.Id);
		System.out.println(sc.name);
		System.out.println(sc.adress.city);
		System.out.println("-------");

		sc1.Id = 102;
		sc1.name = "Durga";
		System.out.println(sc1.Id);
		System.out.println(sc1.name);
		System.out.println(sc1.adress.city);
		System.out.println("--------");

//		After modifying the adresss
		sc.adress.city = "vizag";
		System.out.println(sc.adress.city);
		System.out.println(sc1.adress.city);

	}
}
