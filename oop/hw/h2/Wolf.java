package oop.hw.h2;

public class Wolf extends Wild{
    
    protected String position;

    public Wolf() {
        this.position = "обычный бедолага";
    }

    public Wolf(String position) {
        this.position = position;
    }

    public void beMain() {
        this.position = "like a boss";
    }
    
    public String Info() {
        return String.format(
            "Wolf: hiegh - %d, weight - %d, eye colot - %s, habitat - %s, explore fate - %s, position - %s",
                    super.hiegh, super.weight, super.eyecolor, super.habitat, super.expDate, this.position);
    }

    public void getSound() {
        System.out.println("uuuuuuuuuuuuuuuuuuuuuuuu");
    }
}
