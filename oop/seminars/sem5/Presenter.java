package oop.seminars.sem5;


public class Presenter {
    Viewer view;
    // Model model;

    public Presenter(Viewer v) {
        // this.model = m;
        this.view = v;
    }

    public void Button() {
        String primer = view.getValue("введите ваш пример: ");
        String[] values = primer.split(" ");
        Integer value1 = Integer.parseInt(values[0]);
        Integer value2 = Integer.parseInt(values[2]);
        String znak = values[1].toString();
        System.out.println(value1);
        System.out.println(znak);
        System.out.println(value2);
        // model.setA(value1);
        // model.setB(value1);
        
        
        if (znak == "+") {
            Sum sum = new Sum();
            sum.setA(value1);
            sum.setB(value2);
            double result = sum.result();
            view.print(result, "Result: "); 
        }
        else if (znak == "*") {
            Product product = new Product();
            product.setA(value1);
            product.setB(value2);
            System.out.println(value1);
            double result = product.result();
            System.out.println(result);
            view.print(result, "Result: "); 
        }
        else if (znak == "-") {
            Difference diff = new Difference();
            diff.setA(value1);
            diff.setB(value2);
            double result = diff.result();
            view.print(result, "Result: "); 
        }
        // switch (znak) {
        //     case 1:
        //         Sum mod = (Sum) model;
        //         break;
        //     case 2:
        //     Difference mod = (Difference) model;
        //     break;
        //     default:
        //         break;
        // }
        
        // view.print(result, "Result: "); 
    }
    
}
