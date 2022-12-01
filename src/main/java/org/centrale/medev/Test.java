package org.centrale.medev;

import org.centrale.medev.util.ReadPGM;
import org.centrale.medev.util.Seuillage;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        //read image
        int data2D[][] = ReadPGM.ReadImage("./images/baboon.pgm");
        //add test for Seuilage
        int Seuillage[][] = org.centrale.medev.util.Seuillage.AfterThreshold("./images/baboon.pgm",20,40);

        for (int row = 0; row < data2D.length; row++) {
            for (int col = 0; col < data2D[0].length; col++) {
                System.out.print(data2D[row][col] + " ");
            }
            System.out.println();
        }
    }

}
