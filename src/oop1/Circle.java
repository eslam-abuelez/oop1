package oop1;

public class Circle {
    private double radius;
    static int numberOfObjects;
    private double area;
    private double circumference;

    public void setRadius(double radius) {
        if (radius <0) {
            radius = 1;
        }else{
        }


        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getCircumference() {
        return Math.PI *2* radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}