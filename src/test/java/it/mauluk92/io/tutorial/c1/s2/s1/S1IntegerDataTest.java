package it.mauluk92.io.tutorial.c1.s2.s1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S1IntegerDataTest {

    /**
     * THe fundamental integer data type is the Java int,
     * a 4-byte, big endian, integer. Long's are 8-byte,
     * big endian, integers. Two more integer data types
     * are available in Java, the short and byte. Short
     * are 2-byte, big-endian. They are introduced for
     * compatibility with C language.
     * Bytes, however, are very much used in Java.
     * In particular, they're used in I/O. A byte is an
     * 8-bit, that ranges from -128 to 127.
     * Byte is signed. Java has no short or byte literal.
     * When assigning an integer literal to a byte variable,
     * a special assignment conversion is performed by the compiler:
     * effectively casting the int literal to the narrower types.
     * Because the int literals are constants, Java knows at compile time
     * and this is permitted.
     * However, assignment from int variables to short and bytes are not,
     * without an explicit cast at least.
     */
    @Test
    @DisplayName("Integer data")
    public void integerData(){}
}
