package com.syntax.class12;

public class Phone {

	//Create a Class “Phone”. Create 3 Objects of it: iPhone, Google Pixel, 
	//Nokia with specific  attributes and behaviors.
	
	String make;
	String model;
	int RAM;
	int ROM;
	double screen;
	int camera;
	
	void makePhoneCallls() {
		System.out.println(make+" "+model+" is calling someone");
	}
	
	void takePictures() {
		System.out.println(make+" "+ model+" is taking pictures");
	}
	
}
