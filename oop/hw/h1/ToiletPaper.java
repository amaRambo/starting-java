package oop.hw.h1;

import before.seminars.lec1.program;

public class ToiletPaper extends Hygiene{
    
    protected int sloi;

    public ToiletPaper() {
        this.sloi = 0;
    }

    public ToiletPaper(int sloi) {
        this.sloi = sloi;
    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, pieces - %d, col-vo sloev - %d", 
            super.name, super.price, super.count, super.unit, super.pieces, this.sloi); 
    }

    public int getSloi() {
        return this.sloi;
    }
}
