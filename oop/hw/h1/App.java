package oop.hw.h1;

public class App {
    public static void main(String[] args) {

        Product[] list = {
            new Baby(), new Beverages(), new Bread(), new Diaper(), 
            new Eggs(), new Hygiene(), new Limonade(), new Mask(), 
            new Pacifier(), new Pitanie(), new ToiletPaper()};
        
            for (Product product : list) {
                aboutProduct(product);
            }
    }

    public static void aboutProduct(Product name) {
        System.out.println(name.getInfo());
        if (name instanceof Baby) {
            Baby sc = (Baby)name;
            System.out.println(sc.getHyp());
            System.out.println(sc.getMinAge());
        }
        else if (name instanceof Beverages) {
            Beverages sc = (Beverages) name;
            System.out.println(sc.getVolume());
        }
        else if (name instanceof Bread) {
            Bread sc = (Bread) name;
            System.out.println(sc.getDate());
            System.out.println(sc.getType());
        }
        else if (name instanceof Diaper) {
            Diaper sc = (Diaper) name;
            System.out.println(sc.getHyp());
            System.out.println(sc.getMinAge());
            System.out.println(sc.getSize());
            System.out.println(sc.maxwieght);
            System.out.println((sc.getMinWieght()));
        }
        else if (name instanceof Eggs) {
            Eggs sc = (Eggs) name;
            System.out.println(sc.getDate());
            System.out.println(sc.getCounts());
        }
        else if (name instanceof Hygiene) {
            Hygiene sc = (Hygiene) name;
            System.out.println(sc.getPieces());
        }
        else if (name instanceof Limonade) {
            Limonade sc = (Limonade) name;
            System.out.println(sc.getVolume());
        } 
        else if (name instanceof Mask) {
            Mask sc = (Mask) name;
            System.out.println(sc.getPieces());
        }
        else if (name instanceof Milk) {
            Milk sc = (Milk) name;
            System.out.println(sc.getVolume());
            System.out.println(sc.getFat());
            System.out.println(sc.getdate());
        }
        else if (name instanceof Pacifier) {
            Pacifier sc = (Pacifier) name;
            System.out.println(sc.getHyp());
            System.out.println(sc.getMinAge());
        }
        else if (name instanceof Pitanie) {
            Pitanie sc = (Pitanie) name;
            System.out.println(sc.getDate());
        }
        else if (name instanceof ToiletPaper) {
            ToiletPaper sc = (ToiletPaper) name;
            System.out.println(sc.getPieces());
            System.out.println(sc.getSloi());
        }
    }
}
