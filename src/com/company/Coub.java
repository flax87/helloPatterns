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

import java.util.Objects;

public class Coub implements IGeometry {     
    double side;                                                //one side for the cube


// constructor
    public Coub(double side) {
        this.side = side;
    }

//get & set
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


//equals & hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coub coub = (Coub) o;
        return Double.compare(coub.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

//toString
    @Override
    public String toString() {
        return "Coub{" +
                "side=" + side +
                '}';
    }
//IGeometry
    @Override
    public double GetArea() {                               //determine the area
        return (side*side)*6;
    }

    @Override
    public double GetPerimeter() {                          //determine the perimeter
        return side*12;
    }
}
