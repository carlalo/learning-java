package taschenrechner;

public class Anwendung
{
  public static void main(String[] args) {
    Integer a = 4;
    Integer b = 3;

    // Hier den Taschenrechner aufrufen ... plus();
    Integer c = Taschenrechner.plus(a, b);
    System.out.println("" + a + " + " + b + " = " + c);

    c = Taschenrechner.minus(a, b);
    System.out.println("" + a + " - " + b + " = " + c);

    c = Taschenrechner.mal(a, b);
    System.out.println("" + a + " * " + b + " = " + c);

    Double x = Taschenrechner.durch(a, b);
    System.out.println("" + a + " / " + b + " = " + x);

    System.out.println("π = " + Taschenrechner.pi());
  }
}
