package oop.seminars.sem22;

public class Square extends Rectangle{
    public SquareF(int a){
        super(a, a);
        super.name = "Квадрат";
    }
    public SquareF(){
        this(2);
        super.name = "Квадрат";
    }
}
