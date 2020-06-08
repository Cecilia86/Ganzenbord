
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Cecilia
 */
public class Ganzenbord {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        int plek = 0;
        int dice = 0;
        System.out.println("");
        System.out.println("Je staat nu bij start");

        while (plek <= 67) {
            dice = dobbelSteen(dice);
            System.out.println("Je rolt " + dice);
            plek = plek + dice;
            printBordPlek(plek);
            if (plek % 10 == 0 && plek >= 10) {
                plek += dice;
                printBordPlek(plek);
            }
            if (plek == 25 || plek == 45) {
                plek = 1;
            }
            if (plek >= 63) {
                break;
            }
            if (plek == 23) {
                break;
            }
            System.out.println("Je staat nu op plek " + plek);
            System.out.println("");
        }

        System.out.println("Het spel is over.");

    }

    /**
     *
     * @param dice
     * @return
     */
    public static int dobbelSteen(int dice) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Gooi dobbelsteen (g):");
        String input = String.valueOf(scanner.nextLine());

        while (input.equals("g")) {
            dice = 1 + random.nextInt(6);
            break;

        }
        if (!"g".equals(input)) {
            dice = 0;
        }
        return dice;

    }

    public static int printBordPlek(int plek) {

        if (plek % 10 == 0 && plek >= 10) {
            System.out.println("Je staat op plek " + plek + ". Dubbel bonus stapjes!");
        }
        if (plek == 23) {
            System.out.println("Oh nee, plek 23! Je staat in de gevangenis.");
        }
        if (plek >= 63) {
            System.out.println("Plek 63! Je hebt gewonnen!");
        }
        if (plek == 25 || plek == 45) {
            System.out.println("Oh nee! Plek " + plek + "! Ga terug naar start.");
        }
        return plek;

    }

}
