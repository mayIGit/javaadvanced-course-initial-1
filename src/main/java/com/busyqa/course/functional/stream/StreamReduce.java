package com.busyqa.course.functional.stream;

import java.util.*;

class Product4 {
	int id;
	String name;
	float price;

	public Product4(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamReduce {
	public static void main(String[] args) {
		List<Product4> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product4(1, "HP Laptop", 25000f));
		productsList.add(new Product4(2, "Dell Laptop", 30000f));
		productsList.add(new Product4(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product4(4, "Sony Laptop", 28000f));
		productsList.add(new Product4(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data
		Float totalPrice = productsList.stream().map(product -> product.price).reduce(0.0f,
				(sum, price) -> sum + price); // accumulating price
		System.out.println(totalPrice);
		// More precise code
		float totalPrice2 = productsList.stream().map(product -> product.price).reduce(0.0f, Float::sum); // accumulating
																											// price, by																											// class
		System.out.println(totalPrice2);

	}
}
