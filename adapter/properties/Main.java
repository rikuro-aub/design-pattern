package adapter.properties;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2020");
            f.setValue("month", "02");
            f.setValue("day", "09");
            f.writeToFile("newfile.txt");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}