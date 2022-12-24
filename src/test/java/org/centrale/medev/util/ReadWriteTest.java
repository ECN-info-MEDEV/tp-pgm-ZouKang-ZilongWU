package org.centrale.medev.util;

import org.centrale.medev.PGMImage;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadWriteTest {
    PGMImage pgmImage = new PGMImage();

    @Test
    public void read() throws IOException {
//        int data[][] = ReadPGM.ReadImage("images/baboon.pgm");
        return;
    }

    @Test
    public void test() throws FileNotFoundException {
        List<String> strings = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("images/baboon.pgm"));
        sc.useDelimiter("\\s");
        while (sc.hasNext()) {   //按分隔符读取字符串
            String str = sc.next();

            System.out.println(str);
        }

        Iterator iterator = strings.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            System.out.println(s + " ");

        }
    }

    @Test
    public void testPGMImage_read() throws IOException {
        File file = new File("images/baboon.pgm");
        System.out.println(file.getName());
        pgmImage.ReadImage(file);
        int dara[][] = pgmImage.getData();
        for (int i = 0; i < pgmImage.getHeight(); i++) {
            for (int j = 0; j < pgmImage.getWidth(); j++) {
                System.out.print(dara[i][j] + " ");
            }
            System.out.println();
        }

    }


}
