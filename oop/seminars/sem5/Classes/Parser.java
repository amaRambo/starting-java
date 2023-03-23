package oop.seminars.sem5.Classes;

public class Parser {

    protected String str;

    public Parser(String str) {
        this.str = str;
    }

    public double toDouble() {
        return Double.parseDouble(this.str);
    }  
}
