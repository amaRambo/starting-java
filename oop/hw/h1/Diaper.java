package oop.hw.h1;

public class Diaper extends Baby {

    protected int size;
    protected int maxwieght;
    protected int minwieght;
    protected String type;

    public Diaper() {
        this.size = 0;
        this.maxwieght = 0;
        this.minwieght = 0;
        this.type = "";
    }

    public Diaper(int size, int maxwieght, int minwieght, String type) {
        this.size = size;
        this.maxwieght = maxwieght;
        this.minwieght = minwieght;
        this.type = type;
    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, hypoallergenicity - %b, min age - %d, size - %d, max wieght - %d, min wiegth - %d, type - %s", 
            super.name, super.price, super.count, super.unit, super.hypoallergenicity, super.minAge, this.size, this.maxwieght, this.minwieght, this.type);
    }

    public int getSize() {
        return this.size;
    }

    public int getMaxWieght() {
        return this.maxwieght;
    }

    public int getMinWieght() {
        return this.minwieght;
    }
    
    public String getType() {
        return this.type;
    }
}
