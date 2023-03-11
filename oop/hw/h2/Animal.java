package oop.hw.h2;

public class Animal implements Sound {

    protected int hiegh;
    protected int weight;
    protected String eyecolor;

    public Animal() {
        this.hiegh = 0;
        this.weight = 0;
        this.eyecolor = "";
    }

    public Animal(int hiegh, int weight, String eyecolor) {
        this.hiegh = hiegh;
        this.weight = weight;
        this.eyecolor = eyecolor;
    }

    public String Info() {
        return String.format("hiegh - %d, weight - %d, eye colot - %s",
                                this.hiegh, this.weight, this.eyecolor);
    }

    public void printHiegh() {
        System.out.println(this.hiegh);
    }

    public void printWeight() {
        System.out.println(this.weight);
    }

    public void printEyeColor() {
        System.out.println(this.eyecolor);
    }

    public void getSound(){
        System.out.println("any sound");
    }
}
