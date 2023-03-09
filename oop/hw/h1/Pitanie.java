package oop.hw.h1;

public class Pitanie extends Product {

    protected String date;

    public Pitanie() {

        this.date = "";
    }

    public Pitanie(String date) {

        this.date = date;

    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, before date - %s", 
                    super.name, super.price, super.count, super.unit, this.date);
    }

    public String getDate() {
        return String.format("date - %s", this.date);
    }
}
