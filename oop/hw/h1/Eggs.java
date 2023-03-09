package oop.hw.h1;

public class Eggs extends Pitanie {

    protected int counts;

    public Eggs() {
        this.counts = 0;
    }
    
    public Eggs(int conts) {
        this.count = conts;
    }

    public String getInfo() {
        return String.format("name - %s ,price - %d, count - %d, unit - %s, before date - %s, counts - %d", 
        super.name, super.price, super.count, super.unit, super.date, this.counts);
    }

    public int getCounts() {
        return this.counts;
    }
}
