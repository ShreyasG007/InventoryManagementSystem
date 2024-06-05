package com.tka.service;

import java.util.Scanner;

public class ProductModal {
	Scanner scanner = new Scanner(System.in);
	
	int productId;
	String productName;
	double price;
	
	public void acceptDetails() {
		System.out.println("Enter product id:");
		this.productId = scanner.nextInt();

		System.out.println("Enter product Name : ");
		this.productName = scanner.next();
		
		System.out.println("Enter product Price : ");
		this.price=scanner.nextDouble();
	}

	public void displayDetails() {
		System.out.println("Enter product id : "+productId);
		System.out.println("Enter product Name : "+productName);
		System.out.println("Enter product Price : "+price);

	}
	
	public boolean searchById(int id) {
		return id==productId;
	}
	
	public boolean searchByName(String name) {
		return name.equalsIgnoreCase(this.productName);
	}
	
}	
