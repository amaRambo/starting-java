package oop.hw.h2;

public class Wild extends Animal {
    
    protected String habitat;
    protected String expDate;

    public Wild() {
        this.habitat = "";
        this.expDate = "";
    }

    public Wild(String habitat, String expDate) {
        this.habitat = habitat;
        this.expDate = expDate;
    }

    public String Info() {
        return String.format(
            "hiegh - %d, weight - %d, eye colot - %s, habitat - %s, explore fate - %s",
                    super.hiegh, super.weight, super.eyecolor, this.habitat, this.expDate);
    }

    public void printHabitat() {
        System.out.println(this.habitat);
    }

    public void printExpDate() {
        System.out.println(this.expDate);
    }
}
