// Project by Eston Yandell and Jacob Moore
// This is the main class for a D&D 5e Character Creator

import javax.print.DocFlavor;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) throws IOException {
        //Initialize Vars
        Scanner writeToFile = new Scanner(System.in);
        writeToFile.useDelimiter("\\n");
        File characterFile = new File("Character.txt");

        // Hard coded opening
        System.out.println("Welcome to the YandellMoore 5e Character Creator!\n");

        Writer write = new BufferedWriter(new FileWriter(characterFile));
        write.append(

        );
        try  {
            // Initializing more Variables
            Scanner readFile = new Scanner(characterFile);
            // While Loop to write and read
            while (
                            readFile.hasNextLine()
            ) {

                String data = readFile.nextLine();
                System.out.println(data);
            } // While

            readFile.close();
        } // Try
        catch (FileNotFoundException e) {
            System.out.println("An Error occurred");
            e.printStackTrace();
        } // Catch

        try (PrintWriter fw = new PrintWriter(new File(characterFile.toURI()))) {
            String line = null;
            while ((line = writeToFile.nextLine()) != null) {
                if ((line.trim().equalsIgnoreCase("done"))) {
                    System.out.println("Exiting");
                    System.exit(0);
                }
            }
            fw.println(line);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);
        }
    } // main
} // Main
