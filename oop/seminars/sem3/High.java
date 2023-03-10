package oop.seminars.sem3;

public class High extends Scooler implements Smoker, InLove {
    
    public void Study() {
        System.out.println("Мне нужно учиться");
    }

    public void Smoke() {
        System.out.println("Я бросаю курить");
    }

    public void inLove() {
        System.out.println("Я ищу себе пару");
    }

    public String getInfo() {
        return String.format("Ученик старших классов: name - %s, class - %d %s, ", 
                                super.name, super.clas, super.letter);
    }
}
