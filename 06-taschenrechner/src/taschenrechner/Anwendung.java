package taschenrechner;

import java.util.Set;

public class Anwendung
{
  public static void main(String[] args) {
    // aufrufen der Methoden mit unterschiedlichen Werten
    grundrechenarten(6, 3);
    // genau eine Nullstelle
    anzahlnullstellen(1, 0, 0);
    // keine Nullstelle
    anzahlnullstellen(1, 0, 1);
    // genau zwei Nullstellen
    anzahlnullstellen(1, -6, 8);
    // Satz des Pythagoras
    satzdespythagoras(3, 4);

    System.out.println("π = " + Taschenrechner.pi());
  }

  public static void anzahlnullstellen(int a, int b, int c) {
    Set<Double> s = Taschenrechner.msf(a, b, c);
    System.out.println("Für " + a + "x² +" + b + "x + " + c + " gibt es " + s.size() + " Nullstellen.");
    for (Double nullstelle : s) {
      System.out.println("Nullstelle bei " + nullstelle);
    }
  }

  private static void grundrechenarten(Integer a, Integer b) {
    Integer f = Taschenrechner.plus(a, b);
    System.out.println("" + a + " + " + b + " = " + f);

    f = Taschenrechner.minus(a, b);
    System.out.println("" + a + " - " + b + " = " + f);

    f = Taschenrechner.mal(a, b);
    System.out.println("" + a + " * " + b + " = " + f);

    Double x = Taschenrechner.durch(a, b);
    System.out.println("" + a + " / " + b + " = " + x);
  }

  public static void satzdespythagoras(int a, int b) {
    double c = Taschenrechner.satzdespythagoras(a, b);
    System.out.println("Die Länge der Hypotenuse beträgt " + c);
  }
}
