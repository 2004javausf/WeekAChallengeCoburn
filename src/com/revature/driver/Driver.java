package com.revature.driver;

import java.util.Scanner;

import com.revature.beans.*;


public class Driver {

	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		int[] arya = {2, 34, 53, 123, 23};
		System.out.println("Favorite Number?");
		
		int favNumber = scanny.nextInt();
		
		//Wrapper class
		Integer inty = new Integer(favNumber);
		System.out.println(inty);
		
		//For loop
		for(int i = 0; i <= inty; i++) {
			System.out.println(i);
		}
		
		//enhanced for loop / if & elseif Statement
		for(int j : arya) {
			if(j > 10 && j < 100) {
				System.out.println(j + " is a fantastic choice");
			}
			else {
				System.out.println("That number isn't between 10 and 100");
			}
			j++;
		}
		
		//Do while loop
		int hello = 19;
		do {
			System.out.println("hello there");
			hello--;
		} while(hello > 0);
		
		//Instantiation of Monitor and House
		Monitor m = new Monitor();
		House h = new House();
		
		//Utilizing the Scannerrrr
		System.out.println("How many rooms are in your house?");
		int numberOfRooms = scanny.nextInt();
		h.setRooms(numberOfRooms);
		System.out.println(h.getRooms());
		
		m.setBrand("Samsung");
		System.out.println(m.getBrand());
		
		//Check out the switch case in the House class!
		h.theCaseColor("red");
		
		//Method overloading
		m.pixelMultiplier();
	}
}
