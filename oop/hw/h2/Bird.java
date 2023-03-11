package oop.hw.h2;

public abstract class Bird extends Animal {

    protected int h;

    protected Bird() {
        this.h = 0;
    }

    protected Bird(int h) {
        this.h = h;
    }
    
    public void Fly() {
        System.out.print(String.format("Я лечу на %d метрах", this.h));
    }

    public String Info() {
        return String.format("hiegh - %d, weight - %d, eye colot - %s, height - %d ",
                                super.hiegh, super.weight, super.eyecolor, this.h);
    }

    public int getH() {
        return this.h;
    }
}
