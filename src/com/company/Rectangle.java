package com.company;

public class Rectangle {
    private int height;
    private int width;

    //region Getter and Setter

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }

    public int getWidth() { return width; }

    public void setWidth(int width) { this.width = width; }

    //endregion


    public void calculatePerimeter() {
        int perimeter = (this.height + this.width) * 2;
        System.out.println("Perimeter = " + perimeter);
    }
    public void calculateArea(){
        double area = this.height * this.width;
        System.out.println("Area = " + area);
    }

    //region Constructor
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public Rectangle() {
    }
    //endregion

}


