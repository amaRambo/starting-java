package oop.hw.h1;

import java.text.Format;
import java.util.Random;
public class Product {
    
    protected String name;
    protected int price;
    protected int count;
    protected String unit;
    protected static Random r;

    static {
        Product.r = new Random();
    }

    public Product(String name, int price, int count, String unit) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    public Product() {
        this("",0,0,"");
    }

    public String getInfo() {
        return String.format("name - %s ,price - %d, count - %d, unit - %s", 
                                        this.name, this.price, this.count, this.unit);
    }

    public String getName() {
        return String.format("name - %s", this.name);
    }

    public String getPrice() {
        return String.format("price - %d", this.price);
    }

    public String getCount() {
        return String.format("count - %d", this.count);
    }

    public String getUnit() {
        return String.format("unit - %s", this.unit);
    }
}
