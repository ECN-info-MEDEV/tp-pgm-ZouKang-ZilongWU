package org.centrale.medev.util;

import java.io.IOException;

public class Difference {
    public static int[][] checkDiff(int[][] img1, int[][] img2) throws IOException {
        int[][] imgDifference = new int[img1.length][img1[0].length];
        // using for loop, for every value, calculate the minus
        for (int rowCount = 0; rowCount < img1.length; rowCount++) {
            for (int columnCount = 0; columnCount < img1[0].length; columnCount++) {
                imgDifference[rowCount][columnCount] = img1[rowCount][columnCount] - img2[rowCount][columnCount];
            }
        }

        return imgDifference;
    }
}
