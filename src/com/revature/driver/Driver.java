package com.revature.driver;

import java.util.Scanner;

import com.revature.beans.*;


public class Driver {

	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		int[] arya = {2, 34, 53, 123, 23};
		System.out.println("Favorite Number?");
		
		int favNumber = scanny.nextInt();
		
		Integer inty = new Integer(favNumber);
		System.out.println(inty);
		
		for(int i = 0; i <= inty; i++) {
			System.out.println(i);
		}
		
		for(int j : arya) {
			if(j > 10 && j < 100) {
				System.out.println(j + " is a fantastic choice");
			}
			else {
				System.out.println("That number isn't between 10 and 100");
			}
			j++;
		}
		
		int hello = 19;
		do {
			System.out.println("Hello there");
			hello--;
		} while(hello > 0);
		

		
		
		House h = new House();
		Monitor m = new Monitor();
		System.out.println("How many rooms are in your house?");
		int numberOfRooms = scanny.nextInt();
		h.setRooms(numberOfRooms);
		System.out.println(h.getRooms());
		
		m.setBrand("Samsung");
		System.out.println(m.getBrand());
		
		h.theCaseColor("red");
		m.pixelMultiplier();
	}
}
