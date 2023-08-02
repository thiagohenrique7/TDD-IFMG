import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestClass {
  @Test
  public void testEquality() {
    assertTrue(Money.dollar(5).equals(Money.dollar(5)));
    assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }

  @Test
  public void testDifferentClassEquality() {
    assertTrue(new Money(10, "CHF").equals(new Money(10, "CHF")));
  }
}
