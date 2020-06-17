/*
 * @author  Oleksii Shevchenko KNUTE 1m
 *
 * Programming patterns. Factory, Builder
 *
 *@version 16.06.20
 * Develop for your class
 *
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 */

package com.company;

public class Main {

    public static void main(String[] args) {


        Triangle triangle1=new Triangle(3,4,5); 
        System.out.println(triangle1.toString());


//2. print Abstract Factory
        IGeometry triangle2 = AbstractFactory.create(3,6, Figure.Triangle);
        System.out.println(triangle2.toString());
//1. print Factory
        Triangle triangle3 = TriangleFactory.create(3,7, 7);
        System.out.println(triangle3.toString());

    }
}
