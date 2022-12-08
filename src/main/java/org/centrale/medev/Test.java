package org.centrale.medev;

import org.centrale.medev.util.Difference;
import org.centrale.medev.util.ReadPGM;
import org.centrale.medev.util.Resize;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        //read image
        int data2D[][] = ReadPGM.ReadImage("./images/baboon.pgm");
//        System.out.println(data2D);


        //add test for Seuilage
        int seuillage[][] = org.centrale.medev.util.Seuillage.AfterThreshold("./images/baboon.pgm",20,40);


        // test for difference
        int diff[][] = Difference.checkDiff(data2D, seuillage);
//        for (int row = 0; row < data2D.length; row++) {
//            for (int col = 0; col < data2D[0].length; col++) {
//                System.out.print(data2D[row][col] + " ");
//            }
////            System.out.println();
//        }



        //add test for Resize
        int imgResize[][] = Resize.ChangeSize("./images/baboon.pgm",0.87);
        System.out.println("Hello World!");

    }

}
