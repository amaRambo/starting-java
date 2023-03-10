package oop.seminars.sem3;


public class App {
    public static void main(String[] args) {
        
        Scooler[] scoolers = {new Junior(), new Middle(), new High()};
        for (Scooler scooler : scoolers) {
            // System.out.print(scooler.getInfo());
            printScoolerInfo(scooler);
        }

        }

    private static void printScoolerInfo(Scooler scooler) {

        
        System.out.println(scooler.getInfo());
        if (scooler instanceof Junior) {
            Junior sc = (Junior)scooler;
            sc.Study();
            sc.Game();
            sc.Prodl();
        }
        else if (scooler instanceof Middle) {
            Middle sc = (Middle) scooler;
            sc.Study();
            sc.Game();
            sc.Smoke();
        }
        else {
            High sc = (High) scooler;
            sc.Study();
            sc.Smoke();
            sc.inLove();
        }

    }

}
