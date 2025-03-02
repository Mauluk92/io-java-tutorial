package it.mauluk92.io.tutorial.c1.s3.s3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S3CharDataTypeTest {

    /**
     * Text in Java is primarily composed of the char primitive
     * data type, char arrays and strings, which are stored arrays of chars
     * internally. Just as you need to understand bytes to really grasp
     * how input and output streams work.
     * In Java, a char is a 2-byte, unsigned integer - the only unsigned
     * integer type in Java. Each char represents a particular character in the
     * Unicode character set. Also, you can use Unicode escapes
     * to represents a Unicode character
     */
    @Test
    @DisplayName("Character data type")
    public void characterDataType(){
        char copyright = '\u00A9';
        Assertions.assertEquals('©', copyright);
    }
}
