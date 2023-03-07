package oop.hw.h1;

public class Beverages extends Product {

    protected int volume;

    public Beverages(int volume) {

        this.volume = volume;

    }

    public String getInfo() {

        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, volume - %s", 
                    super.name, super.price, super.count, super.unit, this.volume);

    }
    
}
