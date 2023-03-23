package oop.seminars.sem5.Operations;

import oop.seminars.sem5.Classes.Model;

public class Power extends Model {

    public Power(double a, double b) {
        super(a,b);
    }

    public double result() {
        return Math.pow(super.a, super.b);
    }
}
