import java.util.Scanner;

public class B5Schaltjahr {
    /*
    Erstellen Sie hierzu eine neue Klasse mit einer Main-Methode.
Diese Programm soll überprüfen, ob der eingegebene Wert ein Schaltjahr ist. Ist der Wert durch 4
teilbar, dann ist es ein Schaltjahr, außer die der Wert ist auch noch durch 100 teilbar. Jahreswerte,
die durch 400 teilbar sind, sind jedoch wieder Schaltjahre. Handelt es sich um ein Schaltjahr so soll
folgendes ausgegeben werden: „1992 ist ein Schaltjahr“
1996 => Schaltjahr (da durch 4 teilbar)
1900 => kein Schaltjahr (ist zwar durch 4 teilbar, gleichzeitig aber auch durch 100, nicht jedoch durch 400)
2000 => Schaltjahr (da durch 4 und 400 teilbar)
     */

    public static void main(String[] args) {
        int inputYear = 0;
        System.out.println("Bitte geben Sie eine Jahreszahl ein: ");

        Scanner sc = new Scanner(System.in);
        inputYear = sc.nextInt();

        if (inputYear % 4 == 0) {
            /* mögliches Schaltjahr */

            if (inputYear % 100 == 0) {
                if (inputYear % 400 == 0) {
                    System.out.println(inputYear + " ist ein Schaltjahr");
                }
                else { /*sonst*/
                    System.out.println(inputYear + " ist KEIN ein Schaltjahr");
                }
            }else {
                System.out.println(inputYear + " ist ein Schaltjahr");
            }
        }
        else {
            System.out.println(inputYear + " ist KEIN ein Schaltjahr");
        }
    }
}
