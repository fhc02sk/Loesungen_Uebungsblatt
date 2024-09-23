public class B3Schleife {
    public static void main(String[] args) {
        /* Addieren Sie alle Zahlen zwischen 1 und 100 und geben Sie im
        Anschluss die Gesamtsumme dieser aus. Erstellen Sie hierzu eine neue
         Klasse und lösen Sie die Aufgabenstellung direkt in der Main Methode. */

        int counter = 1;
        int sum = 0;

        while (counter <= 100) {
            sum = sum + counter;
            counter = counter + 1;
        }

        System.out.println("Sum: " + sum);
    }
}
