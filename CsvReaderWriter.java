import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileWriter;

// Main class
public class CsvReaderWriter {

    public static void main(String[] args) throws IOException  {

        String csvFile = "C:\\Users\\Innowatts\\Desktop\\p2p-geoid.csv";
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\Innowatts\\Desktop\\p2p-geoid2.csv"));
        String line = "";
        String newline = "";
        String delimiter = ",";
        String com =  " ";
        int rank =1;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            line = br.readLine();
             pw.write(line+"\n");
            while ((line = br.readLine()) != null) 
            {
                String[] fields = line.split(delimiter);
               // Do your operations Here
                newline = String.join(", ", fields);
                //System.out.println(newline);
                pw.write(newline+"\n");
               
            }
            pw.close(); // Make sure to close to save file.

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}