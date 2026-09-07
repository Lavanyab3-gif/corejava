package com.Constructors;

public class Bus {
	int busNo;
	String busName;
	String busType;
	String source;
	String destination;
	int seatingCapacity;
	int availableSeats;
	double ticketPrice;
	String driverName;
	String conductorName;

	Bus() {
		System.out.println("no-arg Constructor Called");
	}

	Bus(int busNo, String busName) {
		this.busNo = busNo;
		this.busName = busName;
		System.out.println("2-arg Constructor Called");
	}
	Bus(int busNo,String busName, String busType){
		this.busNo = busNo;
		this.busName = busName;
		this.busType = busType;
		System.out.println("3-arg Constructor Called");
	}
	Bus(int busNo,String busName, String busType,String source){
		this.busNo = busNo;
		this.busName = busName;
		this.busType = busType;
		this.source = source;
		System.out.println("4-arg Constructor Called");
		
	}
	Bus(int busNo,String busName, String busType,String source,String destination){
		this.busNo = busNo;
		this.busName = busName;
		this.busType = busType;
		this.source = source;
		this.destination = destination; 
		System.out.println("5-arg Constructor Called");
	}
	Bus(int busNo,String busName, String busType,String source,String destination,int seatingCapacity,int availableSeats,double ticketPrice,String driverName,String conductorName){
		
	
		this. busNo = busNo;
		this. busName = busName;
		this.busType = busType;
		this. source= source;
		this. destination = destination;
		this. seatingCapacity = seatingCapacity;
		this. availableSeats = availableSeats;
		this. ticketPrice = ticketPrice;
		this.driverName =  driverName;
		this.conductorName =  conductorName;
		System.out.println("All args called");
	}
 
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.busInfo();
		Bus b2 = new Bus(1012,"varahi");
		b2.busInfo();
		Bus b3 = new Bus(9122,"ZingBus","Sleeper");
		b3.busInfo();
		Bus b4 = new Bus(589122,"AbiBus","Seater","vizag");
		b4.busInfo();
		Bus b5 = new Bus(12345,"Manikanta Travells","Sleeper","Vishakapatnam,","Hyderabad");
		b5.busInfo();
		Bus b6 = new Bus(13245,"busbus","seater","vizag","vzm",70,35,999,"ABC","XYZ");
		b6 .busInfo();

	}

	void busInfo() {
		System.out.println("Bus Number:" + busNo);
		System.out.println("Bus Name:" + busName);
		System.out.println("Bus Type:" + busType);
		System.out.println("Source:" + source);
		System.out.println("Destinatin:" + destination);
		System.out.println("Sitting Capacity:" + seatingCapacity);
		System.out.println("Available Seats:" + availableSeats);
		System.out.println("Ticket Price:" + ticketPrice);
		System.out.println("Driver Name:" + driverName);
		System.out.println("Conductor Name:" + conductorName);
		System.out.println("********************");
	}

}
