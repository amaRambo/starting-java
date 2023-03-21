package oop.seminars.sem5.Operations;

import oop.seminars.sem5.Classes.Model;

public class Power extends Model {
    public double result() {
        return Math.pow(super.a, super.b);
    }
}
