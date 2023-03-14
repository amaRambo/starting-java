package oop.hw.h3;

import oop.hw.h3.Class.BaseFig;
import oop.hw.h3.Class.Circle;
import oop.hw.h3.Class.Figures;
import oop.hw.h3.Class.Rectangle;
import oop.hw.h3.Class.Triangle;

public class App {
    public static void main(String[] args) {
        
        Figures pa4ka = new Figures();
        pa4ka.Add(new Triangle(1,2,2));
        pa4ka.Add(new Circle(8));
        pa4ka.Add(new Rectangle(4,7));
        pa4ka.Add(new Rectangle(4,2));
        pa4ka.Info();
        // pa4ka.Del(1);
        // pa4ka.Info();
        
        // if (pa4ka.get(1).compareTo(pa4ka.get(2)) == 1) {
        //     System.out.println("asd");
        // }
        // else System.out.println("dsa");
        // sortMaxToMin(pa4ka);
        
        System.out.println("------------------Убывание------------------");
        sortMaxToMin(pa4ka); 
        pa4ka.Info();
        System.out.println("------------------Возрастание------------------");
        sortMinToMax(pa4ka); 
        pa4ka.Info();
        
    }

    public static void sortMaxToMin(Figures any) {
        for (int i = 0; i < any.Size() - 1; i++) {
            for(int j = 0; j < any.Size() - i - 1; j++) {
                if(any.get(j+1).compareTo(any.get(j)) == 1) {
                    any.Add(j,any.get(j+1));
                    any.Del(j+2);
                }
            }
        }
    }

    public static void sortMinToMax(Figures any) {
        for (int i = 0; i < any.Size() - 1; i++) {
            for(int j = 0; j < any.Size() - i - 1; j++) {
                if(any.get(j).compareTo(any.get(j+1)) == 1) {
                    any.Add(j,any.get(j+1));
                    any.Del(j+2);
                }
            }
        }
    }
    
}
