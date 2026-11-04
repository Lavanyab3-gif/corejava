package com.oops;

class Delivery {
	int deliveryId;
	String partnerName;
	double distance;

	public Delivery(int deliveryId, String partnerName, double distance) {
		super();
		this.deliveryId = deliveryId;
		this.partnerName = partnerName;
		this.distance = distance;

	}

	void calDelCharges() {
		System.out.println(" Delivery Details ");
	}
}

class CycleDelivery extends Delivery {

	public CycleDelivery(int deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	void calDelCharges() {
		double charges = distance * 15;

		System.out.println("Cycle Delivery Charges:");
		System.out.println("Deliver Id is:" + deliveryId);
		System.out.println("Partner Name is:" + partnerName);
		System.out.println("Distance in kilometrs :" + distance);
		System.out.println("Delivery Charges are:" + charges);

		System.out.println();

	}

}

class BikeDelivery extends Delivery {

	public BikeDelivery(int deliveryId, String partnerName, double distance) {
		super(deliveryId, partnerName, distance);
	}

	@Override
	void calDelCharges() {
		double charges = distance * 10;
		System.out.println("Bike Delivery Charges:");
		System.out.println("Deliver Id is:" + deliveryId);
		System.out.println("Partner Name is:" + partnerName);
		System.out.println("Distance in kilometrs :" + distance);
		System.out.println("Delivery Charges are:" + charges);

		System.out.println();

	}

}

public class TestDelivery {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		CycleDelivery cd = new CycleDelivery(1, "Gayatri", 4);
		cd.calDelCharges();

		BikeDelivery bd = new BikeDelivery(2, "Lavanya", 8);
		bd.calDelCharges();

	}

}
