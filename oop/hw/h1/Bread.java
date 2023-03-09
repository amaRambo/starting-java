package oop.hw.h1;

public class Bread extends Pitanie {
    
    protected String typeofmuka;

    public Bread() {
        this.typeofmuka = "";
    }

    public Bread(String typeofmeka) {
        this.typeofmuka = typeofmeka;
    }

    public String getInfo() {
        return String.format("name - %s ,price - %d, count - %d, unit - %s, before date - %s, typeofmuka - %s", 
        super.name, super.price, super.count, super.unit, super.date, this.typeofmuka);
    }

}
