package oop.hw.h2;

public class Chicken extends Home {
    
    public String Info() {
        return 
        String.format(
        "Chicken: hiegh - %d, weight - %d, eye colot - %s, name- %s, breed - %s, vaccintions - %s, color -%s, birthday -%s",
                super.hiegh, super.weight, super.eyecolor, super.name, super.breed, super.vaccinations, super.color, super.birthday);
    }

    public void getSound() {
        System.out.println("qud qud q daaaa");
    }
}
