package com.qa.java;

public class Products {

	int id;
	String name;
	double price;
	String category;
	float rating;
	float discountPercentage;
	boolean isAvailable;
	
	static String SELLER_NAME = "Jeffrey";
	static String SELLER_CONTACT_NUMBER = "0198754298";
	static String SELLER_E_MAIL = "jeffrey1234@gmail.com";
	

	

	public Products(int id, String name, double price, String category, float rating, float discountPercentage,
			boolean isAvailable) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.rating = rating;
		this.discountPercentage = discountPercentage;
		this.isAvailable = isAvailable;
	}
	

	
	void productInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating);
		System.out.println("DiscountPercentage: " + discountPercentage);
		System.out.println("IsAvailable: " + isAvailable);
		System.out.println();
	}
	
	double productDiscountedPrice () {
		return (price * discountPercentage / 100);
		//System.out.println();
		
		}
		
	
	
	
	double productFinalPrice () {
		return (price + productDiscountedPrice() );
		
	}
	
	//coding standards for static
	
	//seller's information
	static void sellerContactDetails () {
		System.out.println("Seller Name: " + SELLER_NAME);
		System.out.println("Seller Contact Number: " + SELLER_CONTACT_NUMBER);
		System.out.println("Seller E-mail: " + "SELLER_EMAIL");
	}
	
	
	/*
	 * final static String COMPANY_NAME = "QA";
 	final static double COMPANY_REVENUE = 34534543.34534;



static void companyInformation() {
	System.out.println("Company Name : " + COMPANY_NAME);
	System.out.println("Company Revenue : " + COMPANY_REVENUE);
	
}
	 */
 	


}
