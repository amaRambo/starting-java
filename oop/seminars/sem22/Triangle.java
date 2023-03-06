package oop.seminars.sem22;

public class Triangle extends Fig implements TheSum{
    public Triangle(int a, int b, int c){
        super.a=a;
        super.b=b;
        super.c=c;
        super.name = "Треугольник";
    }
    public Triangle(){
        this(3, 3, 2);
        super.name = "Треугольник";
    }
    @Override
    public double Perimeter() {
        return super.a+super.b+super.c;
    }

    @Override
    double Square() {
        return Math.sqrt(Perimeter()/2*(Perimeter()/2-super.a)*(Perimeter()/2-super.b)*(Perimeter()/2-super.c));
    }
    @Override
    public String toString() {
        return String.format("%s\nПериметр: %.1f\n", super.toString(),this.Perimeter());
    }
}
