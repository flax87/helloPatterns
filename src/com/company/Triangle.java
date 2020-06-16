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

    @Override
    public double GetArea() {
        double perimeter = GetPerimeter();
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }

    @Override
    public double GetPerimeter() {
        return a+b+c;
    }
}

