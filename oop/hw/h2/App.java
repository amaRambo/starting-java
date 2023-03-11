package oop.hw.h2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(123);
        // list.add(1223);
        // list.add(12233);
        // System.out.println(list);
        // list.add(1, 126);
        // System.out.println(list.get(1));
        // System.out.println(list.size());

        Zoopark zoo1 = new Zoopark();

        zoo1.Add(new Cat());
        zoo1.Add(new Tiger());
        zoo1.Add(new Wolf());
        zoo1.Add(new Chicken());
        zoo1.Add(new Stork());
        zoo1.Add(0,new Dog());
        zoo1.Add(new Cat());
        System.out.println(zoo1.Size());
        zoo1.Del(6);
        System.out.println(zoo1.Size());

        System.out.println("-----------------Дававление и удаление---------------");

        zoo1.getInfo(0);
        zoo1.getInfo(1);
        zoo1.getInfo(2);
        zoo1.getInfo(3);
        zoo1.getInfo(4);
        zoo1.getInfo(5);

        System.out.println("-----------------Информация по индексу---------------");

        for (int i = 0; i < zoo1.Size(); i++) {
            zoo1.tryToSound(i);
        }

        System.out.println("-----------------Звук по индексу---------------");

        zoo1.getInfo();

        System.out.println("-----------------Информация о всех в зоопарке---------------");
        
        zoo1.tryToSound();

        System.out.println("-----------------Звук всех возможных в зоопарке---------------");
        


    }
    
}
