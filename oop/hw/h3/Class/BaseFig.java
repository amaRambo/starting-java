package oop.hw.h3.Class;

import oop.hw.h3.Interface.Squareable;

public abstract class BaseFig implements Comparable<BaseFig>, Squareable{
    
    public String Info() {
        return "";
    }

    @Override
    public int compareTo(BaseFig fig) {
        if (this.Square() > fig.Square()) {
            return 1;
        }
        else if (this.Square() < fig.Square()) {
            return -1;
        }
        else return 1;
    }

    
    // public boolean Compare(BaseFig fig) {
    //     if (this.Square() > fig.Square()) {
    //         return true;
    //     }
    //     else if (this.Square() < fig.Square()) {
    //         return false;
    //     }
    //     else return true;
    // }

    public double Square() {
        return 0;
    }
}
