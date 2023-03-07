package oop.hw.h1;

public class Milk extends Beverages {
    
    protected String date;
    protected int fatPercentage;

    public Milk() {
        this.date = "";
        this.fatPercentage = 0;
    }

    public Milk(int fatPercentage, String date) {

        this.fatPercentage = fatPercentage;
        this.date = date;

    }

    public String getInfo() {

        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, volume - %s, date - %s, fat% - %d", 
                    super.name, super.price, super.count, super.unit, super.volume, this.date, this.fatPercentage);

    }

    public String getdate() {
        return String.format("date - %s", this.date);
    }

    public String getFat() {
        return String.format("fat percentage - %s", this.fatPercentage);
    }
}
