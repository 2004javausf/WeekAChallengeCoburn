package com.revature.beans;

public class House {
	private int squareFeet;
	private int rooms = 3;
	private String color;
	
	public int getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void houseConverter() {
		int multiplyRooms;
		multiplyRooms = getRooms() * 2;
		
		while (multiplyRooms < 20) {
			System.out.println("almost 20");
			multiplyRooms++;
		}	
	}
	
	public void theCaseColor(String color) {
		switch (color) {
		case "red" :
			System.out.println("You picked red");
		break;
		case "blue" :
			System.out.println("You picked blue");
		break;
		case "yellow" :
			System.out.println("Why would you pick yellow?");
		break;
		default :
			System.out.println("You didn't pick a color that I got");
		break;
		}
	}
	
	
}
