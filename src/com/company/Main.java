package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Create a new project in InteliJ named AreaCalculator using the Command Line App template
        //Create a new Java class file (File -> New -> Java Class) named Calculator
        //Your Calculator should have (2) properties: width and height (with assessor methods)
        //Your calculator should have a method named calculateArea() which:
        //Accepts width and height parameters
        //Calculates the area of the rectangle
        //Returns the area
        //In your Main class, create and instance of Calculator and test your calculateArea() method
        //Bonus: modify your program so that your calculator has a shape property, and modify CalaculateArea()
        // to accept shape, width, and height. Your method should then calculate the area of the shape depending on
        // whether the shape parameter is “triangle” or “rectangle”, and should return the area

        Calculator rectangle = new Calculator();

        Scanner myScanner = new Scanner (System.in);

        System.out.println ("Enter width of rectangle in inches.");
        int width = myScanner.nextInt();
        rectangle.setWidth(width);

        System.out.println ("Enter height of rectangle in inches.");
        int height = myScanner.nextInt();
        rectangle.setHeight(height);

        System.out.println (rectangle.calculateArea (width,height) + " inches.");



    }
}
