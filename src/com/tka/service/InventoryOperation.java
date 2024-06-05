package com.tka.service;

import java.util.Scanner;


public class InventoryOperation {
	ProductModal[] productInfo = new ProductModal[10];
	Scanner scanner = new Scanner(System.in);
	public int totalProducts;

	
	public void initialItems() {
		System.out.println("How many Product you want in BookList : ");
		this.totalProducts = scanner.nextInt();

		for (int i = 0; i < totalProducts; i++) {
			productInfo[i] = new ProductModal();
		}

		System.out.println("Enter Product Details");

		for (int i = 0; i < totalProducts; i++) {
			productInfo[i].acceptDetails();
		}

		System.out.println("\nDisplay Product details");

		for (int i = 0; i < totalProducts; i++) {
			productInfo[i].displayDetails();
			System.out.println();
		}
	}

	
	public void addItem() {
		System.out.println("\nEnter a new product's details to be added to the list");

		ProductModal newProduct = new ProductModal();
		newProduct.acceptDetails();

		if (totalProducts >= productInfo.length) {
			System.out.println("Product list is full. Cannot add new Product.");
			return;
		}

		productInfo[totalProducts] = newProduct;
		totalProducts++;

		System.out.println("\nDisplay Product details after adding new Product");

		for (int i = 0; i < totalProducts; i++) {
			productInfo[i].displayDetails();
			System.out.println();
		}
	}


	public void searchItemById() {
		System.out.println("\n\nEnter a product id to be searched");
		int id = scanner.nextInt();

		ProductModal foundProduct = null;

		for (int i = 0; i < totalProducts; i++) {
			if (productInfo[i].searchById(id)) {
				foundProduct = productInfo[i];
				break;
			}
		}

		if (foundProduct != null) {
			System.out.println();
			foundProduct.displayDetails();
		} else {
			System.out.println("Product id not found");
		}

	}
	
	public void serachProductByName() {
		System.out.println("\n\nEnter a product Name to be searched");
		String name = scanner.next();

		ProductModal foundProduct = null;

		for (int i = 0; i < totalProducts; i++) {
			if (productInfo[i].searchByName(name)) {
				foundProduct = productInfo[i];
				break;
			}
		}

		if (foundProduct != null) {
			System.out.println();
			foundProduct.displayDetails();
		} else {
			System.out.println("Product id not found");
		}

	}

	
	public void removeItem() {
		System.out.println("\nWhich book you want to delete please Enter bookId");
		int delBookId = scanner.nextInt();
		
		for (int i = delBookId-1; i < totalProducts - 1; i++) {
			productInfo[i] = productInfo[i + 1];
		}
		
		totalProducts--;
		
		System.out.println("\nDisplay Book details after deleting a book");

		for (int i = 0; i < totalProducts; i++) {
			productInfo[i].displayDetails();
			System.out.println();
		}
				
				
	}
}
