package org.centrale.medev.util;

import org.junit.Test;

import java.io.IOException;

public class ReadWriteTest {


    @Test
    public void read() throws IOException {
        int data[][] = ReadPGM.ReadImage("images/baboon.pgm");
        WritePGM.WriteImage(data,"images/test.txt");
        return;
    }



}
