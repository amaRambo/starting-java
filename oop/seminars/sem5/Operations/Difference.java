package oop.seminars.sem5.Operations;

import oop.seminars.sem5.Classes.Model;

public class Difference extends Model {

    public Difference(double a, double b) {
        super(a,b);
    }
    
    public double result() {
        return (super.a - super.b);
    }
}
