package oop.hw.h3.Class;

import oop.hw.h3.Interface.Perimetrable;
import oop.hw.h3.Interface.Squareable;

public class Rectangle extends BaseFig implements Perimetrable{
    
    protected int a;
    protected int b;

    public Rectangle() {
        this.a = 0;
        this.b = 0;
    }

    public Rectangle(int a, int b) {
        if (a <= 0 || b <= 0) {
            System.out.println("Невозможно создать такую фигуру");
            System. exit(0);
        }
        this.a = a;
        this.b = b;
    }

    public Rectangle(int a) {
        if (a <= 0) {
            System.out.println("Невозможно создать такую фигуру");
            System. exit(0);
        }
        this.a = a;
        this.b = a;
    }

    public double Perimetr() {
        return (this.a + this.b) * 2;
    }

    public double Square() {
        return this.a * this.b;
    }

    public String Info() {
        return String.format("Rectangle: sides - (%d, %d), Perimetr - %f, Square - %f",
                                        this.a, this.b, this.Perimetr(), this.Square());
    }

    public int Side1() {
        return this.a;
    }

    public int Side2() {
        return this.b;
    }
}
