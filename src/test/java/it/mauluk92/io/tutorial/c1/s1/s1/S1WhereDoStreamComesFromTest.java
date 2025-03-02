package it.mauluk92.io.tutorial.c1.s1.s1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class S1WhereDoStreamComesFromTest {


    /**
     * The first source of input most programmers encounters is System.in.
     * This is the same thing as stdin in C - generally some sort of console
     * window, probably the one in which the java program was launched.
     * The console is also available for output through the static field
     * out. This is equivalent to stdout in C parlance and may be redirected
     * in a similar fashion. Finally, stderr.
     * <br/>
     * <br/>
     * Files another common source of input and destination for output.
     * File input streams provide a stream of data with the first byte
     * in that file. File output streams write data into a file, either by
     * erasing the file's content and starting from the beginning or by appending
     * data to the file.
     * <br/>
     * <br/>
     * Network connection provide streams too. When you connect to a web
     * server, FTP server, or some other kind of server, you read the data it sends
     * from an input stream connected from that server and write data onto an output
     * connected to that server.
     * <br/>
     * <br/>
     * Java programs themselves produce streams. Byte array input streams, and piped
     * output streams all move data from one part of a Java program to another.
     */
    @Test
    @DisplayName("Where do Stream comes from")
    public void whereDoStreamComesFrom(){}
}
