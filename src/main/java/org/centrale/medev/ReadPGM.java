package org.centrale.medev;

import java.io.*;

public class ReadPGM {

    /**
     * Read pgm image.
     * @param filePath the path of pgm image
     * @throws IOException
     */
    public static int[][] ReadImage(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        String p2 = bufferedReader.readLine();
        System.out.println(p2);

        String dieze = bufferedReader.readLine();
        System.out.println(dieze);

        String sizeStr = bufferedReader.readLine();
        String[] sizeArray = sizeStr.split("\s+");

        int picWidth = Integer.parseInt(sizeArray[0]);
        int picHeight = Integer.parseInt(sizeArray[1]);

        int[][] data2D = new int[picWidth][picHeight];
        for (int row = 0; row < picHeight; row++) {
            for (int col = 0; col < picWidth; col++) {
                data2D[row][col] = bufferedReader.read();
            }
        }

        fileInputStream.close();
        return data2D;
    }
}
