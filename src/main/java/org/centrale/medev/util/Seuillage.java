package org.centrale.medev.util;

import java.io.IOException;

public class Seuillage {
    // Set minimum and maximum brightness
    public static int[][] AfterThreshold(String filePath, int minimum, int maximum) throws IOException {
        int[][] Original = ReadPGM.ReadImage(filePath);
        int[][] imgThreshold = new int[Original.length][Original[0].length];
        for (int rowCount = 0; rowCount < (Original.length); rowCount++) {       // chose one row
            int[] Row = new int[Original[0].length];
            //int[] Row = Original[rowCount];
            for (int place = 0; place < Original[rowCount].length; place++) {             // value can only be in [minimum, maximum]
                if (Original[rowCount][place] < minimum) {
                    Row[place] = minimum;
                } else if (Original[rowCount][place] > maximum) {
                    Row[place] = maximum;
                } else {
                    Row[place] = Original[rowCount][place];
                }
            }
            imgThreshold[rowCount] = Row;
        }
        return imgThreshold;
    }
}
