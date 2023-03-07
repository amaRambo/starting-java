package oop.hw.h1;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class App {
    public static void main(String[] args) {

        BeforeDate kvas = new BeforeDate("19.03.2023");
        kvas.name = "o4akovskii";
        kvas.count = 234;
        kvas.price = 100;
        if(kvas instanceof BeforeDate) {
            aboutProduct(kvas);
        }
    }

    public static void aboutProduct(BeforeDate name) {
        System.out.println(name.getName());
        System.out.println(name.getCount());
        System.out.println(name.getUnit());
        System.out.println(name.getCount());
        System.out.println(name.getDate());
    }

}
