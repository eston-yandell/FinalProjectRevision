// Project by Eston Yandell and Jacob Moore
// This is the main class for a D&D 5e Character Creator
import java.io.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {


        try {
            // Initializing Variables
            File characterFile = new File("Character.txt");
            Scanner writeToFile = new Scanner(System.in);
            Scanner readFile = new Scanner(characterFile);

            while ( readFile.hasNextLine()) {
                String data = readFile.nextLine();
                System.out.println(data);
            }

            readFile.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
}
