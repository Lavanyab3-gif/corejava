package com.lavanya;
//
//public class Count {
//	static int count;
//	 
//	Count(){
//		count++;
//	}
//
//	public static void main(String[] args) {
//		Count c1 = new Count();
//		Count c2 = new Count();
//		Count c3 = new Count();
//		Count c4 = new Count();
//		
//		
//		System.out.println("Total count is :"+ Count.count);
//		
//	}
//
//}

import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 10000;

        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance = ₹" + balance);
        }
        else if (choice == 2) {
            System.out.print("Enter deposit amount: ");
            int amount = sc.nextInt();

            balance = balance + amount;

            System.out.println("Balance = ₹" + balance);
        }
        else if (choice == 3) {
            System.out.print("Enter withdrawal amount: ");
            int amount = sc.nextInt();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Remaining Balance = ₹" + balance);
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
}
