package simpletxtprocessor.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TxtFileWriter {

    public void write(ArrayList<String> lines, String fileFullName) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileFullName));
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
        finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
