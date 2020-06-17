/*
 * @author  Oleksii Shevchenko KNUTE 1m
 *
 * Programming patterns. Factory, Builder
 *
 *
 * Develop for your class
 *
 * 1. Factory.
 * 2. Abstract factory.
 * 3. Create a class Student  - 25 fields.
 * 4. Create a builder for the class Student
 */
package com.company;

//Create Abstract Factory

public class AbstractFactory {

        public static IGeometry create(double a, double b, Figure figure)
        {

        switch (figure) {

            case Triangle: return new Triangle(a,b);
            case Coub: return new Coub(a);
            default: return null;
        }
    }


}

