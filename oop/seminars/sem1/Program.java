package oop.seminars.sem1;

public class Program {
    public static void main(String[] args) {
        Base bike1 = new Bike("Ivan", "shkol'nik", "black");
       getInfo(bike1); 
        
    }

    public static void getInfo(Base ts) {
        System.out.println("color = " + ts.getColor());
        System.out.println("model = " + ts.getModel());
        System.out.println("count of wheels = " + ts.getCw());
        System.out.println("weight = " + ts.getWeight());
        System.out.println(ts.Drive());
    }
}
