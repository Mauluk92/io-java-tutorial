package it.mauluk92.io.tutorial.c1.s1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S1WhatIsAStreamTest {

    /**
     * A stream is an ordered sequence of bytes of indeterminate
     * length. Input streams move bytes of data into a Java
     * program from some generally external target.
     * The word stream is derived from an analogy between
     * a sequence of bytes and a stream of water. An input
     * stream is like a siphon that sucks up water; an output
     * stream is like a hose that sprays out water.
     * Siphons can be connected to hoses to move water
     * from one place to another. Sometimes a siphon may run
     * out of water if it's drawing from a finite source like a bucket.
     * On the other hand, if the siphon is drawing water from a river,
     * it may well operate indefinitely.
     * Input to a Java program can come from many sources. Output
     * can go to many different kinds of destinations. The power of the stream
     * metaphor is that the differences between these sources and
     * destinations are abstracted away. All input and output operations
     * are treated as streams using the same classes and the same
     * methods. The same API that reads files can read network sockets,
     * ports, bluetooth, transmissions, and more.
     */
    @Test
    @DisplayName("What is a stream?")
    public void whatIsAStream(){}
}
