////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// ParseMain.java is a class that parses through the data and displays it in the terminal once the code has completed./
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseMain {
    public static void ParseMain (String FileName) throws FileNotFoundException {
        String data = "";
        try {

            File myObj = new File(FileName); // Creating a new File object, which calls on the String set in the class.
            Scanner myReader = new Scanner(myObj); // Makes a scanner for the File object
            while (myReader.hasNextLine()) {
               data += myReader.nextLine();
               data += "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Filters user input (minus the username) into an array and splits it by new line character (\n)
        String[] dataArray = data.split("\n");
        System.out.printf("Race: %s%n", dataArray[0]);
        System.out.printf("Class: %s%n", dataArray[1]);
        System.out.printf("Subclass: %s%n", dataArray[2]);
        System.out.printf("Level: %s%n", dataArray[3]);
        System.out.printf("Alignment: %s%n", dataArray[4]);
    }
}
