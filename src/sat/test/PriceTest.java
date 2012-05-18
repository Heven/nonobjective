package sat.test;

import org.junit.Test;
import sat.code.Price;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: nex
 * Date: 5/18/12
 * Time: 6:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class PriceTest {
    @Test
    public void testSum() {
        Price price = new Price();
        assertEquals(0, price.sum(""));
        assertEquals(50, price.sum("A"));
        assertEquals(80, price.sum("AB"));
        assertEquals(115, price.sum("CDBA"));

        assertEquals(100, price.sum("AA"));
        assertEquals(130, price.sum("AAA"));
        assertEquals(180, price.sum("AAAA"));
        assertEquals(230, price.sum("AAAAA"));
        assertEquals(260, price.sum("AAAAAA"));

        assertEquals(160, price.sum("AAAB"));
        assertEquals(175, price.sum("AAABB"));
        assertEquals(190, price.sum("AAABBD"));
        assertEquals(190, price.sum("DABABA"));
        //fail("Not yet implemented");
    }


}
