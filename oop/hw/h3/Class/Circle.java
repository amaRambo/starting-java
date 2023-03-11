package oop.hw.h3.Class;

import oop.hw.h3.Interface.Lengthable;
import oop.hw.h3.Interface.Squareable;

public class Circle extends BaseFig implements Lengthable, Squareable {
    
    protected int r;

    public Circle() {
        this.r = 0;
    }

    public Circle(int r) {
        this.r = r;
    }

    public double Length() {
        return 2 * Math.PI * r;
    }

    public double Square() {
        return Math.PI * r * r;
    }

    public String Info() {
        return String.format("Circle: radius - %d, Length - %d, Square - %d",
                             this.r, this.Length(), this.Square());
    }

    public int Radius() {
        return this.r;
    }

}
