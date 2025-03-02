package it.mauluk92.io.tutorial.c1.s3.s2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S2UnicodeTest {

    /**
     * Latin-1 suffices for most western european languages
     * but, it does not have anywhere near the number of
     * characters required to represent Cyrillic, Greek,
     * Arabic. Unicode has space for over one million different
     * possible characters. Unicode is only a character set though.
     * It is not a character encoding. The most common encoding is
     * UTF-8, UTF-16, UTF-32. Java uses UTF-16 internally.
     * A Java char is not really a Unicode character. Rather,
     * it is a UTF-16 code point, sometimes two Java chars are required
     * to make up one Unicode character.
     */
    @Test
    @DisplayName("The Unicode character set")
    public void unicodeCharacterSet(){}
}
