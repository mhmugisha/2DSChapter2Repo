package chapter2Exercises;

import java.util.*;

public class No14PricesAndMarkUp {

	static Scanner console = new Scanner(System.in);
	static final double MARK_UP_RATE = 0.15;
	static final double TAX_RATE = 0.1;
	
	public static void main(String[] args) {
		
		double originalPrice;
		double markedUpAmount;
		double finalPrice;
		double sellingPrice; 
		
		System.out.println("Original Price: ");
		originalPrice = console.nextDouble();
		
		markedUpAmount =  originalPrice*MARK_UP_RATE;
		
		sellingPrice = originalPrice + markedUpAmount;
		
		finalPrice = (sellingPrice + originalPrice*TAX_RATE);
		
		System.out.println("Mark up Rate:" + MARK_UP_RATE);
		System.out.println("Mark up amount: " + markedUpAmount);
		System.out.println("Store's selling price: " + sellingPrice);
		System.out.println("Tax Rate: " + TAX_RATE);
		System.out.println("Tax Charged: " + (originalPrice*TAX_RATE));
		System.out.println("Final Price: " + finalPrice );
	}

	
	
	
}
