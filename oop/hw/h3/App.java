package oop.hw.h3;

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
        pa4ka.Add(new Rectangle(5));
        pa4ka.Info();
        pa4ka.Del(1);
        pa4ka.Info();
        
    }
    
}
