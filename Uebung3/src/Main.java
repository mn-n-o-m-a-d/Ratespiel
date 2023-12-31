import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    //Zufällige Zahl generieren
    static Integer myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    //Zähler auf Null setzen
    static Integer counter = 0;

    public static void main(String[] args) {
        //System.out.println("Die gesuchte Zahl ist " + myNumber);
        //Nächste Runde wird gestartet
        nextRound();
    }

    public static void nextRound() {
        //Benutzer Eingabe einlesen
        Scanner scanner = new Scanner(System.in);
        //Text Ausgabe
        System.out.println("Bitte gib eine Zahl ein:");
        //Benutzer Eingabe in die number schreiben
        Integer number = scanner.nextInt();
        guess(number);
    }

    public static void guess(Integer number) {
        //Vergleichen ob die eingegebene Zahl gleich, kleiner oder größer ist
        if (number == myNumber) {
            System.out.println("Richtig!");
            //Ausgabe wieviele Versuche gebraucht wurden
            System.out.println("Du hast " + counter + " Versuche benötigt");
        } else {
            System.out.println("Leider Falsch!");
            counter = counter +1;
            if (number < myNumber) {
                System.out.println("Deine Zahl ist zu kein");
            } else {
                System.out.println("Deine Zahl ist zu groß");
            }
            nextRound();
        }
    }
}