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

public class TriangleFactory {

// 1. Factory.
        public static Triangle create(double a, double b, double c){

            if (a +b > c) {
                return new Triangle(a, b, c);
            } else{
                return null;
            }

        }
    }

