package taschenrechner;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.Test;

class TaschenrechnerMitternachtsformelTest
{

  @Test
  void sollteEineNullstelleHaben() {
    Set<Double> nullstellen = Taschenrechner.msf(1, 0, 0);

    assertEquals(1, nullstellen.size());
    assertEquals(Double.valueOf(0.0), nullstellen.iterator().next());
  }

  @Test
  void sollteKeineNullstelleHaben() {
    fail("Not yet implemented");
  }

  @Test
  void sollteZweiNullstellenHaben() {
    fail("Not yet implemented");
  }

}
