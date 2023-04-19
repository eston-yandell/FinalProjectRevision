// Project by Eston Yandell and Jacob Moore
// This is the main class for a D&D 5e Character Creator

import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        //Initialize Vars
        Scanner writeToFile = new Scanner(System.in);
        writeToFile.useDelimiter("\\n");
        File characterFile = new File("Character.txt");

        try (PrintWriter fw = new PrintWriter(new File(characterFile.toURI()))) {
            // Initializing more Variables
            String line = null;
            Scanner readFile = new Scanner(characterFile);
            // While Loop to write and read
            while (
                    (line = writeToFile.nextLine()) != null
                            &&
                            readFile.hasNextLine()) {
                if ((line.trim().equalsIgnoreCase("done"))) {
                    System.out.println("Exiting");
                    System.exit(0);
                }

                String data = readFile.nextLine();
                System.out.println(data);
            } // While
            fw.println(line);

            readFile.close();
        } // Try
        catch (FileNotFoundException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        } // Catch
    } // main
} // Main
