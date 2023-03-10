package before.seminars.sem5;

public class task {
    public static void main(String[] args) {
        Printer(Mapa(15));
    }

    public static void Printer(int[][] map) {

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.printf("%3d",map[i][j]);
                // System.out.print("  ");
            }
            System.out.println();
        }  
    }

    public static int[][] Mapa(int n) {

        int[][] map = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0 || j==0 || i == n - 1 || j == n - 1) {
                    map[i][j] = -1;
                }
            } 
        }
        map[7][8] = 948;
        return map;
    }
}
