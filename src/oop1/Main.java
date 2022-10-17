package oop1;

import java.util.Scanner;

public class Main   { public static void main(String[] args){



    int i= 10;
    Player p1 = new Player();


    Circle circle1 = new Circle();

    Scanner scanner= new Scanner(System.in);





    System.out.println("please enter the radius to get Circumference");
    // get radius from user

    circle1.setRadius(scanner.nextDouble());

    System.out.println(" Circumference is: " +circle1.getCircumference());




    Rectangle rectangle1 = new Rectangle();
    System.out.println("Please Enter length");
     rectangle1.setLength(scanner.nextDouble());
    System.out.println("please Enter Width");
     rectangle1.setWidth(scanner.nextDouble());

     System.out.println("the perimeter is: " + rectangle1.getPerimeter());
     System.out.println("the Area is: " + rectangle1.getArea());
    }
}