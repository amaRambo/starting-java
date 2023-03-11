package oop.hw.h2;

public class Cat extends Home {
    
    protected String wool;

    public Cat() {
        this.wool = "";
    }

    public Cat(String wool) {
        this.wool = "";
    }

    public String Info() {
        return 
        String.format(
        "Cat: hiegh - %d, weight - %d, eye colot - %s, name- %s, breed - %s, vaccintions - %s, color -%s, birthday -%s, wool - %s",
                super.hiegh, super.weight, super.eyecolor, super.name, super.breed, super.vaccinations, super.color, super.birthday, this.wool);
    }

    public void getSound() {
        System.out.println("maow maow motherfucker");
    }

    public String getWool() {
        return this.wool;
    }
}
