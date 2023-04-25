import java.io.*;
import java.util.Scanner;

public class FiveEArray {
    public static void inputToFile () throws IOException {
        String[] characterClass = {"Barbarian", "Bard", "Cleric", "Druid",
                "Fighter", "Monk", "Paladin", "Ranger",
                "Rogue", "Sorcerer", "Warlock", "Wizard"};

        String[] race = {"Dragonborn", "Dwarf", "Elf", "Gnome",
                "Half-Elf", "Halfling", "Half-Orc", "Human",
                "Tiefling"};

        String[] confirmation = {"Yes", "Y", "confirm", "yes", "y", "Confirm"};

        boolean con1 = false;

        Scanner myScan = new Scanner(System.in);

        try {

            Writer writeToFile = new FileWriter("CharacterFile.txt");

            do {
                System.out.println("What is your Race?");

                String myRace = myScan.nextLine();

                boolean Race = false;

                for (String races : race) {
                    if (myRace.equals(races)) {
                        Race = true;// creates a boolean used to track if the input is in the array
                        break;
                    }// if

                }//for

                if (Race) {
                    System.out.println("Accepted.");
                    System.out.println("Are you sure you wish to play this race?");
                    String confirm = myScan.nextLine();

                    for (int i = 0; i < confirmation.length; i++) {
                        if (confirm.equals(confirmation[i])) {
                            con1 = true;
                        }//if
                    }//for
                } // if: Scans race[] to see if the value is in the array
                else {
                    System.out.println("Not in the race list\n" +
                            "Please check to make sure that your spelling is correct.");
                    System.out.println("Race not found.");
                }//else

                if (con1) {
                    System.out.println("Understood.");
                    writeToFile.write(myRace);
                    writeToFile.write("\n");
                }//if
                else {
                    System.out.println("Ok, please reselect your race.");
                }//else
            } while (!con1);

            do {

                System.out.println("What is your Class?");
                String myClass = myScan.nextLine();

                boolean Class = false;

                for (int i = 0; i < characterClass.length; i++) {
                    if (myClass.equals(characterClass[i])) {
                        Class = true;// creates a boolean used to track if the input is in the array
                    }// if
                }//for

                if (Class) {
                    System.out.println("Accepted.");
                    System.out.println("Are you sure you wish to play this class?");
                    String confirmation1 = (myScan.nextLine());

                    for (int i = 0; i < confirmation.length; i++) {
                        if (confirmation1.equals(confirmation[i])) {
                            con1 = true;
                        }//if
                    }//for
                } // if: Scans c1ass[] to see if the value is in the array
                else {
                    System.out.println("Class not found.");
                }//else

                if (con1) {
                    System.out.println("Understood.");
                    writeToFile.write(myClass);
                    writeToFile.write("\n");
                }//if
                else {
                    System.out.println("Ok, please reselect your class.");
                }//else
            } while (!con1);

            writeToFile.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }//literallyTheEntireProject
}//FiveEArrays
