package oop.hw.h3.Class;

import java.util.ArrayList;

public class Figures {
    
    protected ArrayList<BaseFig> list;
    
    public Figures() {
        this.list = new ArrayList<>();
    }

    public Figures(ArrayList<BaseFig> list) {
        this.list = list;
    }

    public void Add(BaseFig element) {
        this.list.add(element);
    }

    public void Del(BaseFig element) {
        this.list.remove(element);
    }

}
