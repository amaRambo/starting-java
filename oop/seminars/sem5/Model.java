package oop.seminars.sem5;

public class Model implements Res {
    
    protected Integer a, b;

    public Model(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    } 

    public Model() {
        this.a = 0;
        this.b = 0;
    } 

    public void setA(Integer value) {
        this.a = value;
    }

    public void setB(Integer value) {
        this.b = value;
    }

    public double result() {
        return 0;
    }
}
