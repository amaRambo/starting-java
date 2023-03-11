package oop.hw.h2;

public class Dog extends Home{

    protected String training;

    public Dog() {
        this.training = "";
    }

    public Dog(String trainig) {
        this.training = trainig;
    }

    public void Train() {
        this.training = "Отдрессирован";
    }

    public String Info() {
        return 
        String.format(
        "Dog: hiegh - %d, weight - %d, eye colot - %s, name- %s, breed - %s, vaccintions - %s, color -%s, birthday -%s, training - %s",
                super.hiegh, super.weight, super.eyecolor, super.name, super.breed, super.vaccinations, super.color, super.birthday, this.training);
    }
    
    public void getSound() {
        System.out.println("gav gav gav");
    }
}
