package it.mauluk92.io.tutorial.c1.s2.s2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S2ConversionsAndCastsTest {

    /**
     * Since bytes have such a small range, they're often converted to ints
     * in calculations and method invocations. Often, they need to be converted
     * back, generally through a cast. Casting from an int to a byte, takes place
     * through truncation of the high order bytes
     */
    @Test
    @DisplayName("Conversion and casts")
    public void conversionsAndCasts(){}
}
