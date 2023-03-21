package oop.seminars.sem5.Classes;

import java.util.ArrayList;

import oop.seminars.sem5.Operations.Difference;
import oop.seminars.sem5.Operations.Division;
import oop.seminars.sem5.Operations.Power;
import oop.seminars.sem5.Operations.Product;
import oop.seminars.sem5.Operations.Sum;

public class Presenter {

    Viewer view;
    public static String str;
    public Presenter(Viewer view) {
        this.view = view;
    }
    
    public void Button() {

        String primer = view.getValue("введите ваш пример: ");
        String[] val = primer.split(" ");
        ArrayList<String> values = new ArrayList<>();
        for (String value : val) {
            values.add(value);
        }
        System.out.println(values);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals("^")) {
                Power pow = new Power();
                pow.a = Integer.parseInt(values.get(i-1));
                pow.b = Integer.parseInt(values.get(i+1));
                str = "" + pow.result();
                values.add(i-1, str);
                values.remove(i);
                values.remove(i);
                values.remove(i);  
            }
        }
        System.out.println(values);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals("*") || values.get(i).equals("/")) {
                
                if (values.get(i).equals("*")) {
                    Product prod = new Product();
                    prod.a = Integer.parseInt(values.get(i-1));
                    prod.b = Integer.parseInt(values.get(i+1));
                    str = "" + prod.result();
                }
                if (values.get(i).equals("/")) {
                    Division div = new Division();
                    div.a = Integer.parseInt(values.get(i-1));
                    div.b = Integer.parseInt(values.get(i+1));
                    str = "" + div.result();
                }
                values.add(i-1, str);
                values.remove(i);
                values.remove(i);
                values.remove(i);     
            }
        }
        System.out.println(values);
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals("+") || values.get(i).equals("-")) {
                
                if (values.get(i).equals("+")) {
                    Sum sum = new Sum();
                    sum.a = Integer.parseInt(values.get(i-1));
                    sum.b = Integer.parseInt(values.get(i+1));
                    str = "" + sum.result();
                }
                if (values.get(i).equals("-")) {
                    Difference dif = new Difference();
                    dif.a = Integer.parseInt(values.get(i-1));
                    dif.b = Integer.parseInt(values.get(i+1));
                    str = "" + dif.result();
                }
                values.add(i-1, str);
                values.remove(i);
                values.remove(i);
                values.remove(i); 
                i = 0;    
            }
        }
        System.out.println(values);

        System.out.println(values.get(0));
    //    System.out.println(values);
       
       
        // for (int i = 0; i < values.length; i++) {
        //     if (values[i].equals("*") || values[i].equals("/")) {
        //         queue.add(i);
        //     }
        // }
        // for (int i = 0; i < values.length; i++) {
        //     if (values[i].equals("+") || values[i].equals("-")) {
        //         queue.add(i);
        //     }
        // }
        

        // Integer value1 = Integer.parseInt(values[0]);
        // Integer value2 = Integer.parseInt(values[2]);
        // char znak = values[1].charAt(0);  
        
        
        // if (znak == '+') {
        //     Sum sum = new Sum();
        //     sum.setA(value1);
        //     sum.setB(value2);
        //     result = sum.result();
            
        // }
        // else if (znak == '*') {
        //     Product product = new Product();
        //     product.setA(value1);
        //     product.setB(value2);
        //     result = product.result();
            
        // }
        // else if (znak == '-') {
        //     Difference diff = new Difference();
        //     diff.setA(value1);
        //     diff.setB(value2);
        //     result = diff.result();
            
        // }
        // else if (znak == '/') {
        //     Division div = new Division();
        //     div.setA(value1);
        //     div.setB(value2);
        //     result = div.result();
             
        // }  
        // view.print(result, "Result: ");   
    }
}
