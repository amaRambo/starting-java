package oop.hw.h3.Class;

import java.util.ArrayList;
import java.util.Scanner;

import oop.hw.h3.Interface.Lengthable;
import oop.hw.h3.Interface.Perimetrable;

public class Figures {
    
    protected ArrayList<BaseFig> list;
    
    public Figures() {
        this.list = new ArrayList<>();
    }

    public Figures(ArrayList<BaseFig> list) {
        this.list = list;
    }

    public void Add(BaseFig element) {
        this.list.add(element);
    }

    public void Del(int index) {
        if (index >= 0 & index < list.size()) {
            this.list.remove(list.get(index));
        }
    }

    public void Info() {
        for (BaseFig element : list) {
            if (element instanceof Perimetrable) {
                if (element instanceof Rectangle) {
                    Rectangle temp = (Rectangle) element;
                    System.out.println(temp.Info());
                }
                else if (element instanceof Triangle) {
                    Triangle temp = (Triangle) element;
                    System.out.println(temp.Info());
                }

            }
            else if (element instanceof Lengthable) {
                Circle temp = (Circle) element;
                System.out.println(temp.Info());
            }
        }
    }

    public void Change(int index) {

        if (index >= 0 & index < list.size()) {

            if (list.get(index) instanceof Rectangle) {
                Rectangle sc = (Rectangle) list.get(index);
                System.out.println(sc.Info());
                if (sc.Side1() != sc.Side2()) {
                    sc.a = Scan("Введите первую сторону: ");
                    sc.b = Scan("Введите воторую сторону: ");    
                }
                else {
                    sc.a = Scan("Введите сторону: ");
                    sc.b = sc.Side1(); 
                }
                
            }

            if (list.get(index) instanceof Triangle) {
                Triangle sc = (Triangle) list.get(index);
                System.out.println(sc.Info());
                sc.a = Scan("Введите первую сторону: ");
                sc.b = Scan("Введите воторую сторону: ");
                sc.c = Scan("Введите третью сторону: ");
            }

            if (list.get(index) instanceof Circle) {
                Circle sc = (Circle) list.get(index);
                System.out.println(sc.Info());
                sc.r = Scan("Введите радиус: ");
            }
            
        }
    }

    public static int Scan(String args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(args);
        int value = scanner.nextInt();
        return value;
    }

    public BaseFig get(int index) {
        return list.get(index);
    }

}
