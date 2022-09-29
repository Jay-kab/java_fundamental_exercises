package com.qa.java;

public class ProductsMain {

	public static void main(String[] args) {

		Products product1 = new Products(1234567, "Chair", 2325.59, "Furniture", 7.9f, 15.0f, true);

		product1.productInfo();

		Products product2 = new Products(2345613, "Bag", 450, "Accessory", 3.4f, 15.0f, true);

		product2.productInfo();

		Products product3 = new Products(2222222, "Lego", 58.99, "Toys", 4.0f, 5.0f, true);

		product3.productInfo();
		
		product1.productDiscountedPrice();
		System.out.println(product1.name + "'s discount price is: " + product1.productDiscountedPrice());
		
		product2.productDiscountedPrice();
		System.out.println(product2.name + "'s discount price is: " + product2.productDiscountedPrice());
		
		product3.productDiscountedPrice();
		System.out.println(product3.name + "'s discount price is: " + product3.productDiscountedPrice());
		
		
		product1.productFinalPrice();
		System.out.println(product1.name + "'s final price after discount is: " + product1.productFinalPrice());
		
		product2.productFinalPrice();
		System.out.println(product2.name + "'s final price after discount is: " + product2.productFinalPrice());
		
		product3.productFinalPrice();
		System.out.println(product3.name + "'s final price after discount is: " + product3.productFinalPrice());
		

	}

}
