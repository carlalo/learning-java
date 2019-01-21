package numbers;

/**
 * Gibt die Zahlen aus, die beim Programmstart als Arguments übergeben werden.
 * 
 * @author Timo Göckeler
 */
public class Number
{
  public static void main(final String[] arguments) {
    if (arguments.length == 0) {
      System.out.println(number(null));
      return;
    }
    forEach(arguments);
  }

  private static void forEach(String[] arguments) {
    for (String name : arguments) {
      System.out.println(number(name));
    }
  }

  public static String number(String name) {
    StringBuilder greeting = new StringBuilder("Die Zahl ");

    if (name == null || name.isEmpty()) {
      greeting.append("ist nicht angegeben");
    } else {
      greeting.append(name);
    }

    return greeting.append("!").toString();
  }
}
