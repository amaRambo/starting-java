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
    
    public double calc() {
        
        String str = "";

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("^")) {
                Power pow = 
                    new Power(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                str = "" + pow.result();
                list.add(i-1, str);
                forAll(i);
                i--;
                str = "";
                System.out.println(list);

            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("*") || list.get(i).equals("/")) {
                if (list.get(i).equals("*")) {
                    Product prod = 
                        new Product(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + prod.result();
                    list.add(i-1, str);
                    str = "";
                    System.out.println(list);
                }
                if (list.get(i).equals("/")) {
                    Division div = 
                        new Division(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + div.result();
                    list.add(i-1, str);
                    str = "";
                    System.out.println(list);
                }
                forAll(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("+") || list.get(i).equals("-")) {
                if (list.get(i).equals("+")) {
                    Sum sum = 
                        new Sum(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + sum.result();
                    list.add(i-1, str);
                    str = "";
                    System.out.println(list);
                }
                if (list.get(i).equals("-")) {
                    Difference dif = 
                        new Difference(Double.parseDouble(list.get(i-1)),Double.parseDouble(list.get(i+1)));
                    str = "" + dif.result();
                    list.add(i-1, str);
                    str = "";
                    System.out.println(list);
                }
                forAll(i);
                i--;
            }
        }  
        
        return Double.parseDouble(list.get(0));
    }


    public String get(int index) {
        return list.get(index);
    }
    

    protected void forAll(int i) {
        list.remove(i);
        list.remove(i);
        list.remove(i);  
    }
}
