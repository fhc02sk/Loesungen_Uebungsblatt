public class B4SchleifeIf {
    /*
    Geben Sie alle Zahlen zwischen 1 und 100 aus, welche durch 3 teilbar sind.
    Verwenden Sie hierfür den Modulo-Operator und eine if-Abfrage.
    Erstellen Sie hierzu eine neue Klasse und lösen Sie die
Aufgabenstellung direkt in der Main-Methode.
     */

    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 100) {
            if (counter % 3 == 0) {
                System.out.println("Zahl durch 3 dividierbar: " + counter);
            }
            counter = counter + 1;
        }
    }
}
