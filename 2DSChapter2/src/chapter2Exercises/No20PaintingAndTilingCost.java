package chapter2Exercises;

import java.util.Scanner;

public class No20PaintingAndTilingCost {

	static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args) {
		int length;
		int width;
		int height;
		int widthOfWindow1;
		int heightOfWindow1;
		int areaOfWindow1;
		int widthOfWindow2;
		int heightOfWindow2;
		int areaOfWindow2;
		int widthOfDoor;
		int heightOfDoor;
		int areaOfDoor;
		int heightBookshelf;
		int widthBookshelf;
		int areaOfBookshelf;
		int areaOfWalls;
		int totalAreaItems;
		int costperSquareFootWalls;
		int costperSquareFootCarpet;
		int costOfPaintingWalls;
		int costOfInstallingCarpet;
		int areaOfCarpet;
		int Total;
		
		
		//Dimensions
		System.out.println("Enter Length of the room:");
		length = console.nextInt();
		System.out.println("Enter Width of the room:");
		width = console.nextInt();
		System.out.println("Enter Height of the room:");
		height = console.nextInt();
		
		System.out.println("Enter width of the door:");
		widthOfDoor = console.nextInt();
		System.out.println("Enter height of the door:");
		heightOfDoor = console.nextInt();
		
		System.out.println("Enter width of window1:");
		widthOfWindow1 = console.nextInt();
		System.out.println("Enter height of window1:");
		heightOfWindow1 = console.nextInt();
		
		System.out.println("Enter width of window2:");
		widthOfWindow2 = console.nextInt();
		System.out.println("Enter height of window2:");
		heightOfWindow2 = console.nextInt();
		
		System.out.println("Enter width of Bookshelf:");
		widthBookshelf = console.nextInt();
		System.out.println("Enter height of Bookshelf:");
		heightBookshelf = console.nextInt();	
		
		//Calculation of Areas	
		areaOfWindow1 = heightOfWindow1 * widthOfWindow1;
		areaOfWindow2 = heightOfWindow2 * widthOfWindow2;
		areaOfDoor = heightOfDoor * widthOfDoor;
		areaOfBookshelf = heightBookshelf * widthBookshelf;
		totalAreaItems = areaOfWindow1 + areaOfWindow2 + areaOfDoor +areaOfBookshelf;
		areaOfWalls = (2*length*height + 2*width*height) - totalAreaItems; 
		areaOfCarpet = length * width;
		
		
		//Output 
		System.out.println("Enter Cost per square foot-Walls: " );
		costperSquareFootWalls = console.nextInt();
		
		System.out.println("Enter Cost per square foot-Carpet: " );
		costperSquareFootCarpet = console.nextInt();
		
		//Costs per square foot of painting the walls and installing the carpet;
		costOfPaintingWalls = areaOfWalls*costperSquareFootWalls;
		costOfInstallingCarpet = areaOfCarpet * costperSquareFootCarpet; 
		Total = costOfPaintingWalls + costOfInstallingCarpet; 
		
		System.out.println("TOTAL COST  = " + Total);
		
		
	}
	
	
}
