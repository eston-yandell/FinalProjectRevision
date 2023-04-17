import java.io.*;

public class Main {
    static String[] names = {"John", "Frederick", "Flint-baby"};

    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Character.txt"));
            for (String name : names) {
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Character.txt"));
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
