package oop.seminars.sem5.Classes;

import java.util.ArrayList;

import oop.seminars.sem5.Operations.Product;
import oop.seminars.sem5.Operations.Division;
import oop.seminars.sem5.Operations.Power;
import oop.seminars.sem5.Operations.Sum;
import oop.seminars.sem5.Operations.Difference;

public class Priority {

    protected ArrayList<String> list;

    public Priority() {
        
    }


    public Priority(ArrayList<String> list) {
        this.list = list;
    }

    public void set(ArrayList<String> list) {
        this.list = list;
    }
    
    public ArrayList<String> calcPow() {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("^")) {
                Power any = 
                    new Power(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                str = "" + any.result();
                list.add(i-1, str);
                forAll(i);
                str = "";
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("*") || list.get(i).equals("/")) {
                if (list.get(i).equals("*")) {
                    Product any = 
                        new Product(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + any.result();
                    list.add(i-1, str);
                    str = "";
                }
                if (list.get(i).equals("/")) {
                    Division any = 
                        new Division(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + any.result();
                    list.add(i-1, str);
                    str = "";
                }
                forAll(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+") || list.get(i).equals("-")) {
                if (list.get(i).equals("+")) {
                    Sum any = 
                        new Sum(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + any.result();
                    list.add(i-1, str);
                    str = "";
                }
                if (list.get(i).equals("-")) {
                    Difference any = 
                        new Difference(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + any.result();
                    list.add(i-1, str);
                    str = "";
                }
                forAll(i);
            }
        }  
        return list;
    }


    public String get(int index) {
        return list.get(index);
    }
    

    protected void forAll(int i) {
        list.remove(i);
        list.remove(i);
        list.remove(i);  
        i -= i;
    }
}
