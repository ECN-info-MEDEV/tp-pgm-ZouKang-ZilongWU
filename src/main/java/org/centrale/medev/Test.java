package org.centrale.medev;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        //read image
        int data2D[][] = ReadPGM.ReadImage("./images/baboon.pgm");



        for (int row = 0; row < data2D.length; row++) {
            for (int col = 0; col < data2D[0].length; col++) {
                System.out.print(data2D[row][col] + " ");
            }
            System.out.println();
        }
    }

}
