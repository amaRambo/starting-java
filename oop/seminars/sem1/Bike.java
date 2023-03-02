package oop.seminars.sem1;

public class Bike extends Base {
    
    private String user;

    public Bike(String user, String model, String color) {
        super.speed = super.r.nextInt(1, 15);
        this.user = user;
        this.model = model;
        this.color = color;
        super.cw = super.r.nextInt(1,3);
        super.weight = super.r.nextInt(10,25);
    }

    public String getUser() {
        return this.user;
    }

    public String Drive() {
        return String.format("%s. водитель: %s", super.Drive(), this.user);
    }
}
