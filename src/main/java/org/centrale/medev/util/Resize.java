package org.centrale.medev.util;

import java.io.IOException;
import java.lang.Math;

public class Resize {
    public static int[][] ChangeSize(String filePath, double scale) throws IOException {
        int[][] imgOriginal = ReadPGM.ReadImage(filePath);
        int rowNbOrigin = imgOriginal.length;
        int rowNbNew = (int)Math.floor(rowNbOrigin * scale);
        int columnNbOrigin = imgOriginal[0].length;
        int columnNbNew = (int) Math.floor(columnNbOrigin * scale);
        int[][] imgResize = new int[rowNbNew][columnNbNew];
        if (scale == 1) {
            return imgOriginal;
        } else  {
                for(int i=0; i<rowNbNew;i++ ){         // i, j means index of new img
                    for(int j=0;j<columnNbNew;j++){
                        int iOriginLeft = (int) Math.floor(i/scale);
                        int iOriginRight =  Math.min(iOriginLeft+1, rowNbOrigin-1);
                        int jOriginLeft = (int) Math.floor(j/scale);
                        int jOriginRight = Math.min(jOriginLeft+1, columnNbOrigin-1);
                        double reminder = i/scale - iOriginLeft;          //it decides the distance between two origin point
                        imgResize[i][j] = (int) (reminder*imgOriginal[iOriginLeft][jOriginLeft] + (1-reminder)*imgOriginal[iOriginRight][jOriginRight] );
                    }
                }
                return  imgResize;
        }
    }
}
