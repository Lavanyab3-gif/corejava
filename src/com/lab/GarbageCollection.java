package com.lab;


public class GarbageCollection {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize class called");
			}
	 static void display() {
		GarbageCollection G4 = new GarbageCollection();
	}

	public static void main(String[] args) {
		GarbageCollection G1 = new GarbageCollection();
		GarbageCollection G2 = new GarbageCollection();
		GarbageCollection G3 = new GarbageCollection();
		
		System.out.println(G1);
		System.out.println(G2);
		System.out.println(G3);
		//Nullifying
		G1 = null;
		G2 = null;
		
		//re-assigning
		G3 = new GarbageCollection();
		
		//Anonymous
		new GarbageCollection();
		
		//method inside the object
		display();
		
		
		
		
		System.gc();

	}

}
