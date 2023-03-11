package oop.hw.h2;

public class Tiger extends Wild {
    
    public String Info() {
        return String.format(
            "Tiger: hiegh - %d, weight - %d, eye colot - %s, habitat - %s, explore fate - %s",
                    super.hiegh, super.weight, super.eyecolor, super.habitat, super.expDate);
    }

    public void getSound() {
        System.out.println("Arrrrrrrrrrrrrrr");
    }
}
