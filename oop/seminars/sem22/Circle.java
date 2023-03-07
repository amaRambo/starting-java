package oop.seminars.sem22;

public class Сircle extends Fig{
    public Сircle(int r){
        super.a = r;
        super.name = "Круг";
    }
    public Сircle(){
        this(5);
        super.name = "Круг";
    }
    public double length(int r){
        double l = (int)2*Math.PI*r;
        return l;
    }
    @Override
    double Square() {
        return Math.PI*super.a*super.a;
    }
    @Override
    public String toString() {
        return String.format("%s\nДлина окружности: %.1f\n", super.toString(),this.length(super.a));
    }
}
