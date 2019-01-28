import java.io.*;
import java.util.Scanner;

/**
 * Liest zwei Ganzzahlen ein und summiert sie.
 * Beispiel für einen mehrzeiligen Kommentar, der auch in der Dokumentation erscheint.
 * 
 * @author Timo Göckeler
 */
public class InputNumbers
{
  /*
   * Mehrzeiliger Kommentar, der nicht in der Dokumentation erscheint, sondern nur hier im Code.
   * Wir sehen einen typischen Ablauf:
   * 1) Eingabe
   * 2) Verarbeitung
   * 3) Ausgabe
   * Auf Englisch heißt das meist:
   * 1) Input
   * 2) Processing (aka Computing)
   * 3) Output
   * Führt zu netten Methodennamen bei Beispielen:
   * 1) read*
   * 2) execute / process / compute / convert / doIt
   * 3) write*
   */
  public static void main(String[] args)
    throws IOException
  {
    useReader();
    useScanner();
  }

  public static void useReader()
    throws IOException
  {
    // Einzeiliger Kommentar, der den Code erklären soll.
    int a, b, c; // Einzeilige Kommentare gehen auch am Ende einer Zeile

    // Eingabe
    BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Bitte a eingeben: ");
    a = Integer.parseInt(din.readLine());
    System.out.println("Bitte b eingeben: ");
    b = Integer.parseInt(din.readLine());

    // Verarbeitung
    c = a + b;

    // Ausgabe
    System.out.println("a+b=" + c);
  }

  public static void useScanner()
    throws IOException
  {
    int a, b, c;

    // Eingabe
    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte a eingeben: ");
    a = scanner.nextInt();
    System.out.println("Bitte b eingeben: ");
    b = scanner.nextInt();

    // Verarbeitung
    c = a + b;

    // Ausgabe
    System.out.println("a+b=" + c);
  }
}
