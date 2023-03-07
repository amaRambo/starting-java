package oop.seminars.sem22;

public class Sem {
    public static void main(String[] args) {
        Fig[] fig = {new Triangle(), new Rectangle(), new Сircle(), new SquareF()};
        Print(fig);
    }
    public static void Print(Fig[] array){
        for(Fig i : array){
            System.out.println(i.toString());
        }
    }
}
