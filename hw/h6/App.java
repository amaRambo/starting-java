package hw.h6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class App {
  public static void main(String[] args) {
    int m = 3;
    int n = 3;

    var mg = new MapGenerator();

    System.out.println(
        new MapPrinter().rawData(
            mg.getMap())
    );

    var lee = new WaveAlgorithm(mg.getMap());
    lee.Colorize(new Point2D(m, n));
    
    new MapPrinter().Printer(mg.getMap(),5,10);

    new MapPrinter().PrinterRoad(mg.getMap(),lee.getRoad(new Point2D(5, 10)));
    
    System.out.println(lee.getRoad(new Point2D(5, 10)));
    
  }
}


