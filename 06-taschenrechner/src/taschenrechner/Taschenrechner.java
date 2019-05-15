package taschenrechner;

import java.util.Set;
import java.util.TreeSet;

public class Taschenrechner
{

  public static int plus(int summand1, int summand2) {
    return summand1 + summand2;

  }

  public static int minus(int minuend, int subtrahend) {
    return minuend - subtrahend;
  }

  public static int mal(int faktor1, int faktor2) {
    return faktor1 * faktor2;
  }

  public static double durch(int dividend, int divisor) {
    return 1.0 * dividend / divisor;
  }

  public static double pi() {
    return Math.PI;
  }

  public static Set<Double> msf(int a, int b, int c) {
    Set<Double> schnittpunkte = new TreeSet<>();
    int x = b * b - 4 * a * c;
    if (x > 0) {
      double y = Math.sqrt(x);
      double z = (-b + y) / 2 * a;
      schnittpunkte.add(z);

      z = (-b - y) / 2 * a;
      schnittpunkte.add(z);
    }
    if (x == 0) {
      double y = Math.sqrt(x);
      double z = (-b + y) / 2 * a;
      schnittpunkte.add(z);

      z = (-b - y) / 2 * a;
    }

    return schnittpunkte;
  }

  public static double satzdespythagoras(int a, int b) {
    double c = Math.sqrt(a * a + b * b);
    return c;

  }
}
