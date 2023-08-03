package factoryCount;

import java.io.*;

public class TxtLog implements Log {
    // logs on txt file
    public void log(int[] data) {
        String file = "log.txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write("TxtLog: \n");
        
            for (int i = 0; i < data.length; i++) {
                writer.write(data[i] + "\n");
            }

            writer.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
