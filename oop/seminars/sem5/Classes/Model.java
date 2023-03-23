package oop.seminars.sem5.Classes;

public class Model implements Res {
    
    protected double a, b;

    public Model(double a, double b) {
        this.a = a;
        this.b = b;
    } 

    public Model() {
        this.a = 0;
        this.b = 0;
    } 

    public void setA(double value) {
        this.a = value;
    }

    public void setB(double value) {
        this.b = value;
    }

    public double result() {
        return 0;
    }
}
