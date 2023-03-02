package oop.seminars.sem1;
import java.util.Random;

public class Base {
    protected String color;
    protected String model;
    protected int cw;
    protected int weight;
    protected int speed;
    protected static Random r;
    static {
        Base.r = new Random();
    }

    public Base(String color, String model, int cw, int weight, int speed) {
        this.color = color;
        this.model = model;
        this.cw = cw;
        this.weight = weight;
        this.speed = speed;
    }
    
    public Base() {
        this("", "", 0, 0 ,0 );
    }

    public String Drive() {
        return String.format("Транспорт едет со скоростью %d", this.speed );
    }
    
    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }
    public int getCw() {
        return this.cw;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getWeight() {
        return this.weight;
    }
}
