package taschenrechner;

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
}
