package before.hw.h6;

import java.util.ArrayList;
import java.util.Queue;

import before.hw.h5.app2;

public class MapPrinter {
    
    public MapPrinter() {
    }
  
    public String rawData(int[][] map) {
      StringBuilder sb = new StringBuilder();
  
      for (int row = 0; row < map.length; row++) {
        for (int col = 0; col < map[row].length; col++) {
          sb.append(String.format("%5d", map[row][col]));
        }
        sb.append("\n");
      }
      for (int i = 0; i < 3; i++) {
        sb.append("\n");
      }
  
      return sb.toString();
    }
    
    public void Printer(int[][] map, int outI, int outJ) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == -1) {
                    System.out.printf("@@@");
                
                }
                else if ( map[i][j] == 1) {
                    System.out.printf("  1");
                } 
                else if (i == outI & j == outJ) {
                    System.out.printf("%3d",map[i][j]);
                }
                else {
                    System.out.printf("   ");
                }
                // if (i == 10 & j == 17) {
                //     System.out.printf("%d",map[i][j]);
                // }
                // System.out.printf("%3d",map[i][j]);
            }
            System.out.println();
        }  
    }

    public void PrinterRoad(int[][] map, Queue <Point2D> road) {
        ArrayList<Point2D> arroad = new ArrayList<>();
        while (!road.isEmpty()) {
            arroad.add(road.element());
        }
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == -1) {
                    System.out.printf("@@@");
                
                }
                else if ( map[i][j] == 1) {
                    System.out.printf("  1");
                } 
                else if (arroad.equals(new Point2D(i, j))) {
                    System.out.printf("%3d",map[i][j]);
                    road.remove();
                }
                else {
                    System.out.printf("   ");
                }
                
            }
            System.out.println();
        }  
    }

}
