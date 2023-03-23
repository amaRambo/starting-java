package oop.seminars.sem5.Operations;

import oop.seminars.sem5.Classes.Model;

public class Sum extends Model {

    public Sum(double a, double b) {
        super(a,b);
    }
    
    public double result() {
        return (super.a + super.b);
    }
}
