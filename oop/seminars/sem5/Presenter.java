package oop.seminars.sem5;


public class Presenter {

    Viewer view;

    public Presenter(Viewer v) {
        this.view = v;
    }

    public void Button() {

        String primer = view.getValue("введите ваш пример: ");
        String[] values = primer.split(" ");
        Integer value1 = Integer.parseInt(values[0]);
        Integer value2 = Integer.parseInt(values[2]);
        char znak = values[1].charAt(0);  
        
        if (znak == '+') {
            System.out.println((znak));
            Sum sum = new Sum();
            sum.setA(value1);
            sum.setB(value2);
            double result = sum.result();
            view.print(result, "Result: "); 
        }
        else if (znak == '*') {
            Product product = new Product();
            product.setA(value1);
            product.setB(value2);
            double result = product.result();
            view.print(result, "Result: "); 
        }
        else if (znak == '-') {
            Difference diff = new Difference();
            diff.setA(value1);
            diff.setB(value2);
            double result = diff.result();
            view.print(result, "Result: "); 
        }
        else if (znak == '/') {
            Division div = new Division();
            div.setA(value1);
            div.setB(value2);
            double result = div.result();
            view.print(result, "Result: "); 
        }    
    }
}
