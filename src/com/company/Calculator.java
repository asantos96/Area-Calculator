package com.company;

import java.util.Scanner;

public class Calculator {
    private int width;
    private int height;

    //setting Scanner for user inputs and creating method
    public int calculateArea(int width , int height) {

        //multiplying width times height
        return width*height;
    }
    //Setters and getters
    public void setWidth(int inches) {
        width = inches;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int inches) {
        height = inches;
    }
    public int getHeight(){
        return height;
    }
}
