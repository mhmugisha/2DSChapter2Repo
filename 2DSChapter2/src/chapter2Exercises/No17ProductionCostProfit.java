package chapter2Exercises;

import java.util.*;

public class No17ProductionCostProfit {

	static Scanner console = new Scanner(System.in);
	
	static final double PROCTN_COST_PER_LITRE = 0.38;
	static final double PROFIT_PER_CARTON = 0.27;

	public static void main(String[] args) {
		
		double litresProduced;
		double numberOfCartons;
		double profit;
		
		System.out.println("No. of Litres produced: ");
		litresProduced = console.nextDouble();
		
		numberOfCartons = Math.round(litresProduced/3.78);
		
		System.out.println("No. of Cartons needed: " + numberOfCartons);
		
		System.out.println("Cost of Producing all the milk:" +"$" + (litresProduced*PROCTN_COST_PER_LITRE));
		
		profit = Math.round(numberOfCartons*PROFIT_PER_CARTON); 
		
		System.out.println("Profit = "+ "$" + profit);
		
		
		
	}
}
