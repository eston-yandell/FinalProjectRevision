import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ParseMain {
    public static void ParseMain (String FileName) throws FileNotFoundException {
        String data = "";
        try {
            File myObj = new File(FileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
               data += myReader.nextLine();
               data += "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String dataArray[] = data.split("\n");
        System.out.printf("Race: %s%n", dataArray[0]);
        System.out.printf("Class: %s%n", dataArray[1]);
        System.out.printf("Level: %s%n", dataArray[2]);
    }
}
