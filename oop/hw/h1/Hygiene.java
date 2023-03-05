package oop.hw.h1;

public class Hygiene extends Product {
    
    protected int pieces;

    public Hygiene(int pieces) {
        
        this.pieces = pieces;
    }

    public String getInfo() {
        
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, pieces in package - %s", 
                    super.name, super.price, super.count, super.unit, this.pieces);
    }
}
