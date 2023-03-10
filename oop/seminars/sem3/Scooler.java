package oop.seminars.sem3;

public abstract class Scooler {
    
    protected String name;
    protected int clas;
    protected String letter;

    public Scooler() {
        this.name = "";
        this.clas = 0;
        this.letter = "";
    }

    public Scooler(String name, int clas, String letter) {
        this.name = name;
        this.clas = clas;
        this.letter = letter;
    }

    public void Study() {
        System.out.println(" ");
    }

    public String getInfo() {
        return String.format("name - %s, class - %d %s, ", 
                                this.name, this.clas, this.letter);
    }

    public String getName() {
        return this.name;
    }

    public int getClas() {
        return this.clas;
    }

    public String getLetter() {
        return this.letter;
    }
}
