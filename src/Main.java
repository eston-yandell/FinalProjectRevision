// Project by Eston Yandell and Jacob Moore
// This is the main class for a D&D 5e Character Creator
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Character.txt"));
                writer.write("Welcome to the YandellMoore 5e Character Creator!");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("Character.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Character.txt"));
                System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader playerInput = new BufferedReader(new InputStreamReader(System.in));
            int T = Integer.parseInt(playerInput.readLine()); // Takes player input
            String str = playerInput.readLine(); // Takes string as input

            BufferedReader fileRead = new BufferedReader(new FileReader("Character.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
