package com.company;

public class Main {

    public static void main(String[] args) {


        Triangle triangle1=new Triangle(3,4,5);
        System.out.println(triangle1.toString());



        IGeometry triangle2 = AbstractFactory.create(3,6, Figure.Triangle);
        System.out.println(triangle2.toString());

        Triangle triangle3 = TriangleFactory.create(3,7, 7);
        System.out.println(triangle3.toString());

    }
}
