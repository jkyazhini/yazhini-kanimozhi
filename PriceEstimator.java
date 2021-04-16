package com.yazhini;

import java.util.Scanner;

public class PriceEstimator {
	public static void paybill() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the TicketTypes :"); // enter the cartype in the above details
		int tickettypes = sc.nextInt();
		System.out.println("Enter the NoOfSeats :"); // enter the killometres in user friendly
		int NoOfSeats = sc.nextInt();
		if (tickettypes == 1) {
			firstclass(NoOfSeats);
		} // if firsttype of car in calculate to the calling function
		else if (tickettypes == 2) {
			secondclass(NoOfSeats);
		} // if second type of car in calculate to the another function
		else if (tickettypes == 3) {
			thirdclass(NoOfSeats);
		} // if the third type of car due to calling function
		else {
			System.out.println("please enter the valid Tickettypes in above details :");
		}
		// only enter valid cartype because program will be execute in in buil car type
		// only
	}

	public static void firstclass(int A) { /// declare to the micro cartype
		int amount = A * 350; // calculate the km in given cartype
		System.out.println("Total amount of firstclass = " + amount); /// print the price amount will be there in the
																		/// screen

		GST.calc1(amount, A); // (command) calculate the gst amount in the next class
	}

	public static void secondclass(int B) { /// declare to the mini cartype
		int amount = B * 250; // calculate the km in given cartype
		System.out.println("Total amount of secondclass = " + amount); // print the price amount will be there in the
																		// screen
		GST.calc1(amount, B); // it can be used in calculate the gst amount in the next class
	}

	public static void thirdclass(int C) { // declare to the prime cartype
		int amount = C * 100; // calculate the km in given cartype
		System.out.println("Total amount of thirdclass = " + amount); // print the price amount wil be there in the
																		// screen

		GST.calc1(amount, C); // it can be used in calculate the gst amount in the next class
	}
}
