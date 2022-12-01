package org.centrale.medev.util;

import java.io.*;

public class ReadPGM {

    /**
     * Read image.
     * @param filePath image path
     * @return data[][]
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
        System.out.print(picWidth+" ");
        int picHeight = Integer.parseInt(sizeArray[1]);
        System.out.println(picHeight);
        int maxValue = Integer.parseInt(bufferedReader.readLine());
        System.out.println(maxValue);

        System.out.println("sfd "+bufferedReader.read());
        int[][] data2D = new int[picWidth][picHeight];

        for (int row = 0; row < picWidth; row++) {
            for (int col = 0; col < picHeight; col++) {
                data2D[row][col] = bufferedReader.read();
                System.out.print(data2D[row][col]+" ");
            }
            System.out.println();
        }

        fileInputStream.close();
        return data2D;
    }


}
