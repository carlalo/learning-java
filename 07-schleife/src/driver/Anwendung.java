package driver;

import static demo.ForLoop.factors;

public class Anwendung
{

  public static void main(String[] args) {
    for (int decimal = 1; decimal <= 20; ++decimal) {
      System.out.println("" + decimal + " => " + factors(decimal));
    }
  }
}
