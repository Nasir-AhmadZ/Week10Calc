package ie.atu.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    Calc newcalc;

    @Test
    void testAdd()
    {
        newcalc.add(4,6);
        assertEquals(10,newcalc.add(4,6));
    }

}
