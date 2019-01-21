import java.io.*;

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
   */
  public static void main(String[] args) throws IOException {
    // Einzeiliger Kommentar, der den Code erklären soll.
    int a, b, c; // Einzeilige Kommentare gehen auch am Ende einer Zeile
    
    BufferedReader din = new BufferedReader(
                         new InputStreamReader(System.in));
    
      System.out.println("Bitte a eingeben: ");
      a = Integer.parseInt(din.readLine());
      System.out.println("Bitte b eingeben: ");
      b = Integer.parseInt(din.readLine());
      c = a + b;
      System.out.println("a+b="+c);
  }

}
