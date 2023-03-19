package oop.hw.h4;

import java.util.ArrayList;

public class anyMas <T extends Comparable<T>>{
    
    protected ArrayList<T> list;

    public anyMas() {
        this.list = new ArrayList<T>();
    }

    public anyMas(ArrayList<T> list) {
        this.list = list;
    }

    public void Add(T element) {
        this.list.add(element);
        System.out.println(String.format("Фигура добавлена, index = %d", this.list.size()-1));
    }
    
    public void Add(int index, T element) {
        list.add(index, element);
        System.out.println(String.format("Фигура добавлена, index = %d", index));
    }

    public void Del(int index) {
        if (index >= 0 & index < list.size()) {
            this.list.remove(index);
        }
    }

    public void DelElem(T element) {
        for (T elem : list) {
            if (elem == element) {
                this.list.remove(elem);
            }
        }
    }

    public void goToInteger() {

    }

    public T Max() {
        // Integer max = Integer.parseInt(list.get(0));
        T max = list.get(0);
        for (T elem : list) {
            if ((max.compareTo(elem) > 0)) {
                max = elem;
            }
        }
        return max;
    }

    public T Min() {
        T min = list.get(0);
        for (T elem : list) {
            if ((elem.compareTo(min) < 0)) {
                min = elem;
            }
        }
        return min;
    }

    public Integer getSum() {
        Integer result = 0;
        for (T elem : list) {
            result += (Integer) elem;
        }
        return result;
    }

    public Integer getProduct() {
        Integer result = 1;
        for (T elem : list) {
            result *= (Integer) elem;
        }
        return result;
    }

    public Integer getIndex(T element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == element) {
                return i;
            }
        }
        return -1;   
    }

    public void setElem(int index, T elem) {
        Add(index, elem);
        Del(index+1);
    }

    public boolean findElem(T elem) {
        for (T element : list) {
            if (elem == element){
                return true;
            }
        }
        return false;
    }

    public int size() {
        return list.size();
    }

    public void print() {
        for (T elem : list) {
            System.out.printf("%T ", elem);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j = 0; j < list.size() - i - 1; j++) {
                if(list.get(j).compareTo(list.get(j+1)) > 0) {
                    Add(j, list.get(j+1));
                    Del(j+2);
                }
            }
        }
    }

    public void insertSort() {
        T temp;
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j=i; j>0 && (list.get(j-1).compareTo(list.get(j)) > 0);j--) {
                temp = list.get(j-1);
                setElem(j-1, list.get(j));
                setElem(j, temp);
            }
        }
    }

}
