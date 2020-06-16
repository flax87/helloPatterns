package com.company;

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

