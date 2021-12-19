package test.java.sample;

import main.java.sample.ShoppingCart;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class ShoppingCartTest {
    @Test
    public void appendFormatted() {
        StringBuilder sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 0, 14);
        assertEquals("   SomeLine    ", sb.toString());

        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 0, 15);
        assertEquals("   SomeLine     ", sb.toString());

        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 0, 5);
        assertEquals(sb.toString(), "SomeL ");

        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", 1, 15);
        assertEquals("       SomeLine ", sb.toString());
        sb = new StringBuilder();
        ShoppingCart.appendFormatted(sb, "SomeLine", -1, 15);
        assertEquals("SomeLine        ", sb.toString());
    }
}
