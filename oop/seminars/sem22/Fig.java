package oop.seminars.sem22;

public abstract class Fig {
    protected int a;
    protected int b;
    protected int c;
    protected String name;
    abstract double Square();
    public Fig(){};
    @Override
    public String toString() {
        return String.format("%s\nПлощадь: %.1f",this.name, this.Square());
    }
}
interface TheSum {
        double Perimeter();
}
