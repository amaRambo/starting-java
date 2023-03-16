package oop.seminars.sem5;


public class Presenter {
    Viewer view;
    Model model;

    public Presenter(Model m, Viewer v) {
        this.model = m;
        this.view = v;
    }

    public void Button() {
        int a = view.getValue("a: ");
        int b = view.getValue("b: ");
        model.setA(a);
        model.setB(b);
        double result = 0;
        int menu = view.getValue("Выберите: 1 - '+' | 2 - '*' | 3 - '-' \n");
        if (menu == 1) {
            Sum mod = (Sum) model;
            result = mod.result();
        }
        else if (menu == 2) {
            Product mod = (Product) model;
            result = mod.result();
        }
        else if (menu == 3) {
            Difference mod = (Difference) model;
            result = mod.result();
        }
        // switch (menu) {
        //     case 1:
        //         Sum mod = (Sum) model;
        //         break;
        //     case 2:
        //     Difference mod = (Difference) model;
        //     break;
        //     default:
        //         break;
        // }
        
        view.print(result, "Result: "); 
    }
    
}
