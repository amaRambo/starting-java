package oop.seminars.sem5;

import oop.seminars.sem5.Classes.Presenter;
import oop.seminars.sem5.Classes.Viewer;

public class App {
    public static void main(String[] args) {

        boolean flag = true;
        Viewer menu = new Viewer();
        while (flag) {
            if (Integer.parseInt(menu.getValue("1-считать | 0 - выход:\n")) == 1) {
                Presenter pres = new Presenter(new Viewer());
                pres.Button();
            }
            else {
                flag = false;
            }
        }  
    }
}
