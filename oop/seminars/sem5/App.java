package oop.seminars.sem5;

public class App {
    public static void main(String[] args) {
        Presenter pres = new Presenter(new Model(), new Viewer());
        pres.Button();
        
    }
}
