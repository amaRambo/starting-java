package oop.seminars.sem5.Classes;

import java.util.ArrayList;

public class ToArray {

    protected String str;

    public ToArray(String str) {
        this.str = str;
    }

    public ArrayList<String> ToArrayList() {
        String[] temp = this.str.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String string : temp) {
            list.add(string);
        }
        return list;
    }
}
