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

public class Triangle implements IGeometry {



        private double a;
        private double b;
        private double c;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c =  Math.sqrt(a*a +b+b);
    }



//Constructor

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        //Get & Set

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }


        //implements IGeometry


        public double getArea() {
            double semi = this.getPerimetr() /2;
            return  Math.sqrt(semi * (semi - a) * (semi -b) * (semi -c) );
        }


        public double getPerimetr() {
            return a + b + c;
        }



// to String
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c + "\r\n" +
                " Area = "+getArea()+ "\r\n"+
                " Perimetr = "+getPerimetr()+
                '}';
    
}

