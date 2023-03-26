package oop.seminars.sem5.Classes;

public class Presenter {

    Viewer view;
    Priority list;

    public Presenter(Viewer view, Priority list) {
        this.view = view;
        this.list = list;
    }
    
    public void Button() {

        String primer = view.getValue("введите ваш пример: ");
        ToArray array = new ToArray(primer);
        list.set(array.ToArrayList());
        System.out.println(list.calc());
        // view.print(Double.parseDouble(list.calc().get(0)), String.format("%s = ", primer));
    }
}
