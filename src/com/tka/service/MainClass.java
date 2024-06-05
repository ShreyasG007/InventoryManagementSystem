package com.tka.service;

public class MainClass {
	public static void main(String[] args) {
		InventoryOperation inventoryOperation = new InventoryOperation();
		
		inventoryOperation.initialItems();
		inventoryOperation.addItem();
		inventoryOperation.searchItemById();
		inventoryOperation.serachProductByName();
		inventoryOperation.removeItem();
	}
}
