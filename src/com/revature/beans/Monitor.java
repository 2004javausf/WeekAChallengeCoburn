package com.revature.beans;

public class Monitor {
	private Integer pixels = 1080;
	private String brand;
	private String responseTime;
	
	public Monitor() {
	}
	
	public Monitor(Integer pixels, String brand, String responseTime) {
		this.pixels = pixels;
		this.brand = brand;
		this.responseTime = responseTime;
	}

	public Integer getPixels() {
		return pixels;
	}
	public void setPixels(Integer pixels) {
		this.pixels = pixels;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getResponseTime() {
		return responseTime;
	}
	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}
	
	public void pixelMultiplier() {
		System.out.println(pixels);
	}
	
	public void pixelMultiplier(int a) {
		int answer;
		answer = a * pixels;
		System.out.println(answer);
	}
	
	public int pixelMultiplier (int a, int b) {
		int answer;
		answer = a * b * pixels;
		
		if (answer > 1000) {
		System.out.println("Great job");
		}
		return answer;
	}
}
