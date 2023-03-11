package oop.hw.h2;

import java.util.ArrayList;

public class Zoopark {

    protected ArrayList<Animal> list;

    public Zoopark() {
        this.list = new ArrayList<Animal>();
    }

    public Zoopark(ArrayList<Animal> list) {
        this.list = list;
    }

    public void Add(int index, Animal element) {
        list.add(index + 1, element);
    }

    public void Add(Animal element) {
        list.add(element);
    }
    
    public void getInfo() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).Info());
        }
    }

    public void getInfo(int index) {
        System.out.println(list.get(index).Info());
    }

    public void Del(int index) {
        list.remove(index);
    }

    public Animal elem(int index) {
        return list.get(index);
    }

    public int Size () {
        return list.size();
    }

    public void tryToSound(int index) {
        if (list.get(index) instanceof Sound) {
            Sound sc = (Sound) list.get(index);
            sc.getSound();
        }  
    }

    public void tryToSound() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sound) {
            Sound sc = (Sound) list.get(i);
            sc.getSound();
        } 
        }         
    }
}
