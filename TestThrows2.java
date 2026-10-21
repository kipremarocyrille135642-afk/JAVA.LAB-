import java.io.*;

public class TestThrows {
    // Declaring that readFile may cause checked IOException
    static void readFile() throws IOException {
        FileReader file = new FileReader("vivaan_notes.txt");
        BufferedReader br = new BufferedReader(file);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            readFile(); // Caller handles the declared exception
        } catch (IOException e) {
            System.out.println("Caller handled File Error for Vivaan: " + e.getMessage());
        }
    }
}