package oop.seminars.sem3;
// import oop.seminars.sem3.Prodlenka;
// import oop.seminars.sem3.PlayGame;

public class Junior extends Scooler implements PlayGame, Prodlenka {
    
    public void Study() {
        System.out.println("Я люблю учиться");
    }

    public void Game() {
        System.out.println("Я играю в игрушки");
    }

    public void Prodl() {
        System.out.println("Я хожу в продлёнку");
    }

    public String getInfo() {
        return String.format("Ученик младших классов: name - %s, class - %d %s, ", 
                                super.name, super.clas, super.letter);
    }
}
