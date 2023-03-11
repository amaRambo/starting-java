package oop.hw.h3.Class;

import oop.hw.h3.Interface.Perimetrable;
import oop.hw.h3.Interface.Squareable;

public class Triangle extends BaseFig implements Squareable, Perimetrable {
    
    protected int a;
    protected int b;
    protected int c;

    public Triangle() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int b) { // равнобедренный
        this.a = a;
        this.b = b;
        this.c = b;
    }

    public Triangle(int a) { // равносторонний
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public double Perimetr() {
        return this.a + this.b + this.c;
    }

    public double Square() {
        double p = Perimetr()/2;
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    public String Info() {
        return String.format("Triangle: sides - %d %d %d, Perimetr - %d, Square - %d",
        this.a, this.b, this.c, this.Perimetr(), this.Square());
    }

    public int Side1() {
        return this.a;
    }

    public int Side2() {
        return this.b;
    }

    public int Side3() {
        return this.c;
    }

}
