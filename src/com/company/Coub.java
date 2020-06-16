package com.company;

import java.util.Objects;

public class Coub implements IGeometry {
    double side;





// constrktr
    public Coub(double side) {
        this.side = side;
    }

//gtr & strs
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



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


    @Override
    public String toString() {
        return "Coub{" +
                "side=" + side +
                '}';
    }

    @Override
    public double GetArea() {
        return (side*side)*6;
    }

    @Override
    public double GetPerimeter() {
        return side*12;
    }
}
