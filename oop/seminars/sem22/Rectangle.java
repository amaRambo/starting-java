package oop.seminars.sem22;

public class Rectangle extends Fig implements TheSum{
    public Rectangle(int a, int b){
        super.a = a;
        super.b = b;
        super.name = "Прямоугольник";
    }
    public Rectangle(){
        this(2, 4);
        super.name = "Прямоугольник";
    }
    @Override
    public double Perimeter() {
        return (super.a+super.b)*2;
    }
    @Override
    double Square() {
        return super.a*super.b;
    }
    @Override
    public String toString() {
        return String.format("%s\nПериметр: %.1f\n", super.toString(),this.Perimeter());
    }
}
