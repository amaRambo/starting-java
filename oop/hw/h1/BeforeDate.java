package oop.hw.h1;

public class BeforeDate extends Product {

    protected String date;

    public BeforeDate() {

        this.date = "";
    }

    public BeforeDate(String date) {

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
