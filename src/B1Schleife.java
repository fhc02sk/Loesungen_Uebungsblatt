public class B1Schleife {
    public static void main(String[] args) {
        /*
        Geben Sie alle Zahlen zwischen 1 und 100 mittels einer while-Schleife aus.
        Erstellen Sie hierzu eine neue Klasse und lösen Sie die Aufgabenstellung
        direkt in der Main-Methode.
         */

        int counter = 1;
        while (counter <= 100) {
            System.out.println("Counter: " + counter);
            counter = counter + 1;
        }
    }
}
