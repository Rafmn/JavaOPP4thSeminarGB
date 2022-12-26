import java.io.*;

public class WriteToCsv {
    public void writeCsv(String mySet) {
        try(FileWriter writer = new FileWriter("notes.csv", true)) {
            writer.write(mySet + "\n");
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
