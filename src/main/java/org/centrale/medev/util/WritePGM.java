package org.centrale.medev.util;

import javax.imageio.ImageIO;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * create image pgm through data[][].
 */
public class WritePGM {
    public static void WriteImage(int[][] data, String filePath) {
        try {

            FileWriter fstream = new FileWriter(filePath);

            BufferedWriter out = new BufferedWriter(fstream);

            out.write("P2 \n# \n");//head
            out.write(data.length + "  " + data[0].length+"\n");//image size
            out.write("255\n");


            System.out.println("test");
            int count = 0;
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[0].length; j++){
                //we write in the output the value in the position ij of the array
                    out.write(data[i][j] + "  ");
                    count++;
                    if(count%12 == 0){
                        out.write("\n");
                    }
                    System.out.print(data[i][j]+" ");
                }

                System.out.println();
            }
            out.close();
        } catch (Exception e) {
            System.err.println("Error : " + e.getMessage());
        }
    }
}
