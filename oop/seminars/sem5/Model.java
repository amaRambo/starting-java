package oop.seminars.sem5;

public class Model implements Res {
    
    protected int a, b;

    public Model(int a, int b) {
        this.a = a;
        this.b = b;
    } 

    public Model() {
        this.a = 0;
        this.b = 0;
    } 

    public void setA(int value) {
        this.a = value;
    }

    public void setB(int value) {
        this.b = value;
    }

    public double result() {
        return 0;
    }
}
