package oop.hw.h2;

public class Stork extends Wild{
    
    public String Info() {
        return String.format(
            "Stork: hiegh - %d, weight - %d, eye colot - %s, habitat - %s, explore fate - %s",
                    super.hiegh, super.weight, super.eyecolor, this.habitat, this.expDate);
    }
    // Я не знаю как описать звуки аиста(посмотрел ролик на ютубе)
    // upd: В рамках данной задачи допустим, что аист немой

}
