//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Try Integrating  this into the system itself                                                                             /
// This is an example found on the internet. It demonstrates writing to files. Where its original source is I have no clue./
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for no. of fields
        System.out.println("Enter the number of fields to be written to the file:");
        int numFields = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        String[] fields = new String[numFields];

        for (int i = 0; i < numFields; i++) {
            System.out.printf("Field %d: ", i + 1);
            fields[i] = scanner.nextLine();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            for (String field : fields) {
                writer.write(field);
                writer.newLine();
            }
            writer.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}

