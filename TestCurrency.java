import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestCurrency {
  @Test
  public void testCurrency() {
   assertEquals("USD", Money.dollar(1).currency());
   assertEquals("CHF", Money.franc(1).currency());
}

}
