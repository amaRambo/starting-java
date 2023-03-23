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
        
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals("^")) {
                Power pow = new Power();
                pow.a = Double.parseDouble(values.get(i-1));
                pow.b = Double.parseDouble(values.get(i+1));
                str = "" + pow.result();
                values.add(i-1, str);
                values.remove(i);
                values.remove(i);
                values.remove(i);  
                i -= i;
                str = "";
            }
        }
      
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals("*") || values.get(i).equals("/")) {
                
                if (values.get(i).equals("*")) {
                    Product prod = new Product();
                    prod.a = Double.parseDouble(values.get(i-1));
                    prod.b = Double.parseDouble(values.get(i+1));
                    str = "" + prod.result();
                }
                if (values.get(i).equals("/")) {
                    Division div = new Division();
                    div.a = Double.parseDouble(values.get(i-1));
                    div.b = Double.parseDouble(values.get(i+1));
                    str = "" + div.result();
                }
                values.add(i-1, str);
                values.remove(i);
                values.remove(i);
                values.remove(i);  
                i -= i;
                str = "";   
            }
        }
       
        for (int i = 0; i < values.size(); i++) {
            if (values.get(i).equals("+") || values.get(i).equals("-")) {
                
                if (values.get(i).equals("+")) {
                    Sum sum = new Sum();
                    sum.a = Double.parseDouble(values.get(i-1));
                    sum.b = Double.parseDouble(values.get(i+1));
                    str = "" + sum.result();
                }
                if (values.get(i).equals("-")) {
                    Difference dif = new Difference();
                    dif.a = Double.parseDouble(values.get(i-1));
                    dif.b = Double.parseDouble(values.get(i+1));
                    str = "" + dif.result();
                }
                values.add(i-1, str);
                values.remove(i);
                values.remove(i);
                values.remove(i); 
                i -= i;
                str = "";
                  
            }
        }
        
    view.print(Double.parseDouble(values.get(0)), String.format("%s = ", primer));
    }
}
