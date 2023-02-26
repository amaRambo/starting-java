package hw.h5;
import java.util.*;

public class app2 {
     public static void main(String[] args) {

        int[][] map = Mapa();
        Printer(Queue(map));
      
    }

    

    public static int[][] Mapa() {
        
        int[][] map = {
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,00,00,00,00,-1},
            {-1,00,00,-1,-1,-1,-1,00,00,00,00,-1,-1,-1,-1,00,00,00,00,-1},
            {-1,00,00,-1,00,00,-1,00,00,00,00,-1,00,00,00,00,00,00,00,-1},
            {-1,00,00,-1,00,00,-1,00,00,00,-1,-1,00,00,00,00,00,00,00,-1},
            {-1,00,00,-1,-1,-1,-1,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1},
            {-1,00,00,00,00,00,00,-1,-1,-1,-1,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,-1,00,00,-1,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,-1,-1,-1,-1,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,00,00,00,00,00,00,00,00,00,00,00,00,00,00,-1,00,00,00,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        };
        map[7][4] = 1;
        return map;
    }

    public static void Printer(int[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.printf("%3d",map[i][j]);
            }
            System.out.println();
        }  
    }

    public static int[][] Queue(int[][] map) {
        Queue<Integer> qm = new LinkedList<Integer>();
        Queue<Integer> qn = new LinkedList<Integer>();
        int m = 7;
        int n = 4;
        qm.add(m); // start
        qn.add(n);
        int count = 0;
        System.out.println(qm.isEmpty());
        while (!qm.isEmpty()) {
            System.out.println(count++);
            if (map[qm.element()-1][qn.element()] != -1) {
                if (map[qm.element()-1][qn.element()] ==0 || 
                map[qm.element()-1][qn.element()] > map[qm.element()][qn.element()] + 1) { 
                    map[qm.element()-1][qn.element()] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element()-1);
                    qn.add(qn.element());
                }
            }
            if (map[qm.element()][qn.element()+1] != -1) {
                if (map[qm.element()][qn.element()+1] == 0 || 
                map[qm.element()][qn.element()+1] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()][qn.element()+1] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element());
                    qn.add(qn.element()+1);
                }
            }
            if (map[qm.element()+1][qn.element()] != -1) {
                if (map[qm.element()+1][qn.element()] == 0 || 
                map[qm.element()+1][qn.element()] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()+1][qn.element()] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element()+1);
                    qn.add(qn.element());
                }
            }
            if (map[qm.element()][qn.element()-1] != -1) {
                if (map[qm.element()][qn.element()-1] == 0 || 
                map[qm.element()][qn.element()-1] > map[qm.element()][qn.element()] + 1) {
                    map[qm.element()][qn.element()-1] = map[qm.element()][qn.element()] + 1;
                    qm.add(qm.element());
                    qn.add(qn.element()-1);
                }
            }
            qm.remove();
            qn.remove();
        }
        return map;
       
    }
    
}