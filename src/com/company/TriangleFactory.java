package com.company;

public class TriangleFactory {


        public static Triangle create(double a, double b, double c){

            if (a +b > c) {
                return new Triangle(a, b, c);
            } else{
                return null;
            }

        }
    }

