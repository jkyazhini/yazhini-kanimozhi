package com.yazhini;

public class GST {
	public static void calc1(int amount, int NoOfSeats) {
		float GST = 7 * (amount / 100); /// math of the gst in the travel amount
		float Total = GST + amount; // (amount and gst) it must be added
		System.out.println("~~~~~~~~~~~~~~TOTAL AMOUNT~~~~~~~~~~~~~~");
		System.out.println("PRICE AMOUNT =" + amount); // display the price amount only
		System.out.println("GST AMOUNT   =" + GST); // gst amount only printed in the screen
		System.out.println("TOTAL AMOUNT=" + Total); // overall amount of the travelling time or total bill amount of

		Booking.movietime(Total, NoOfSeats);

	}
}