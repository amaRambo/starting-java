package oop.hw.h1;

public class Baby extends Product {
    
    protected boolean hypoallergenicity;
    protected int minAge;

    public Baby(Boolean hypoallergenicity, int minAge) {

        this.hypoallergenicity = hypoallergenicity;
        this.minAge = minAge;

    }

    public String getInfo() {

        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, hypoallergenicity - %b, min age - %d", 
                    super.name, super.price, super.count, super.unit, this.hypoallergenicity, this.minAge);
    }
}
