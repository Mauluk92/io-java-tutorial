package it.mauluk92.io.tutorial.c1.s4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S4ReadersAndWritersTest {

    /**
     * Streams are primarily intended for data that can be read as
     * pure bytes - basically, byte data and numeric data of one sort
     * or another. Streams are specifically not intended for reading
     * and writing text, including both ASCII text, such as "Hello World"
     * and numbers formatted as text, such as "3.1415929". For these
     * purposes you should use readers and writers.
     * <br/>
     * <br/>
     * Input and output streams are fundamentally byte-based. Readers and writers
     * are based on characters, which can have varying widths depending on the
     * character set. For example, ASCII and latin-1 use 1-byte characters UTF-32 uses
     * 4-byte characters. UTF-8 uses characters of varying width. Since characters are ultimately
     * composed of bytes, readers take their input from streams. However,
     * they convert those bytes into chars according to a specified format before passing
     * them along. Similarly, writers convert chars to bytes according
     * to a specified encoding before writing them onto some underlying stream
     * <br/>
     * <br/>
     * The {@link java.io.Reader} and {@link java.io.Writer} classes are abstract
     * superclasses for classes that read and write character based data.
     */
    @Test
    @DisplayName("Readers and Writers")
    public void readersAndWriters(){}
}
