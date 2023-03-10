package oop.hw.h2;

public class Home extends Animal implements Kindness {
    
    protected String name;
    protected String breed;
    protected String vaccinations;
    protected String color;
    protected String birthday;

    public Home() {
        this.name = "";
        this.breed = ""; 
        this.vaccinations = "";
        this.color = "";
        this.birthday = "";
    }

    public Home(String name, String breed, String vaccinations, String color, String birthday) {
        this.name = name;
        this.breed = breed; 
        this.vaccinations = vaccinations;
        this.color = color;
        this.birthday = birthday;
    }

    public String Info() {
        return 
        String.format(
        "hiegh - %d, weight - %d, eye colot - %s, name- %s, breed - %s, vaccintions - %s, color -%s, birthday -%s",
                super.hiegh, super.weight, super.eyecolor, this.name, this.breed, this.vaccinations, this.color, this.birthday);
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printBreed() {
        System.out.println(this.breed);
    }

    public void printVaccitions() {
        System.out.println(this.vaccinations);
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printBirthday() {
        System.out.println(this.birthday);
    }

    public void Kind() {
        System.out.println("Ластится, проявляет ласку, заигрывает, шалун");
    }
}
