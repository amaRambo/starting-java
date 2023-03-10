package oop.seminars.sem3;

public class Middle extends Scooler implements PlayGame, Smoker {

    public void Study() {
        System.out.println("Я ненавижу учиться");
    }

    public void Smoke() {
        System.out.println("Я начинаю курить");
    }

    public void Game() {
        System.out.println("Я игаю в бравл старс");
    }

    public String getInfo() {
        return String.format("Ученик средних классов: name - %s, class - %d %s, ", 
                                super.name, super.clas, super.letter);
    }
}