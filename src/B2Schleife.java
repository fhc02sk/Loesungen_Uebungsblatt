public class B2Schleife {
    /*
    Geben Sie alle Zahlen zwischen 100 und 1 mittels einer while-Schleife aus.
    Erstellen Sie hierzu eine neue Klasse und lösen Sie die Aufgabenstellung
    direkt in der Main-Methode.
     */
    public static void main(String[] args) {

        int counter = 100;

        while (counter > 0) {
            System.out.println("Counter: " + counter);
            counter = counter - 1;
        }
    }
}
