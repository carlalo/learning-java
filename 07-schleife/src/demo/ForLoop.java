package demo;

import java.util.LinkedList;
import java.util.List;

public class ForLoop
{
  public static List<Integer> factors(Integer decimal) {
    Integer maximum = Long.valueOf(Math.round(1 + Math.sqrt(decimal))).intValue();
    List<Integer> factors = new LinkedList<>();
    Integer factor = 2;
    
    do {
      if (decimal % factor == 0) {
        decimal /= factor;
        factors.add(factor);
      } else {
        ++factor;
      }
    } while (factor <= maximum);

    return factors;
  }
}
