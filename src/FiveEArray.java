//////////////////////////////////////////////////////////////////////////////////////////////////////////////
// FiveEArray.java is a class containing data for the program, as well as writing player input to the file. /
////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.Scanner;

public class FiveEArray {
    public static void inputToFile() throws IOException {

        // String array of possible classes
        String[] characterClass = {"Artificer", "Barbarian", "Bard", "Cleric", "Druid",
                "Fighter", "Monk", "Paladin", "Ranger",
                "Rogue", "Sorcerer", "Warlock", "Wizard"};

        // Good gravy...That's a lot of elements...Oh yeah, those are subclasses +)
        String[] characterSubclass = {
                "Alchemist", "Armorer", "Artillerist", "Battle Smith", "Envoy",
                "The Archivist", "The Chronurgist", "The Graviturgist", "The Mechanist",
                "The Mutliclasser", "The Saboteur", "The Tinkerer",
                "Path of the Ancestral Guardian", "Path of the Battlerager", "Path of the Beast",
                "Path of the Berserker", "Path of the Storm Herald", "Path of the Totem Warrior",
                "Path of Wild Magic",
                "College of Eloquence", "College of Glamour", "College of Lore", "College of Swords",
                "College of Valor", "College of Whispers",
                "Arcana Domain", "Death Domain",
                "Forge Domain", "Grave Domain", "Knowledge Domain", "Life Domain", "Light Domain",
                "Nature Domain", "Order Domain", "Tempest Domain", "Trickery Domain", "War Domain",
                "Circle of Dreams", "Circle of the Land", "Circle of the Moon", "Circle of the Shepherd",
                "Circle of Spores",
                "Arcane Archer", "Banneret", "Battle Master", "Cavalier", "Champion",
                "Eldritch Knight", "Psi Warrior", "Rune Knight", "Samurai",
                "Way of the Astral Self", "Way of the Drunken Master", "Way of the Four Elements",
                "Way of the Kensei", "Way of the Long Death", "Way of Mercy", "Way of the Open Hand",
                "Way of Shadow", "Way of the Sun Soul",
                "Oath of the Ancients", "Oath of Conquest", "Oath of Devotion", "Oath of Glory",
                "Oath of Redemption", "Oath of the Crown", "Oathbreaker",
                "Beast Master", "Gloom Stalker", "Horizon Walker", "Hunter", "Monster Slayer",
                "Arcane Trickster", "Assassin", "Inquisitive", "Mastermind", "Scout",
                "Swashbuckler", "Thief",
                "Divine Soul", "Draconic Bloodline", "Shadow Magic", "Storm Sorcery",
                "Wild Magic",
                "The Archfey", "The Celestial", "The Fiend", "The Great Old One",
                "The Hexblade", "The Undying",
                "Bladesinging", "School of Abjuration", "School of Conjuration", "School of Divination",
                "School of Enchantment", "School of Evocation", "School of Illusion", "School of Necromancy",
                "School of Transmutation"};

        // String array of races
        String[] race = {"Dragonborn", "Dwarf", "Elf", "Gnome",
                "Half-Elf", "Halfling", "Half-Orc", "Human",
                "Tiefling"};

        // int array of Possible character levels
        Integer[] characterLevel = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        String[] characterAlignment = {
                "Lawful Good", "Neutral Good", "Chaotic Good",
                "Lawful Neutral", "True Neutral", "Chaotic Neutral",
                "Lawful Evil", "Neutral Evil", "Chaotic Evil"
        };

        // String of possible confirmations
        String[] confirmation = {"Yes", "Y", "confirm", "yes", "y", "Confirm"};

        // Initializes the confirmation variables
        boolean validRace = false;
        boolean validClass = false;
        boolean validSubclass = false;
        boolean validLevel = false;
        boolean validAlignment = false;

        // User input initialized B)
        Scanner myScan = new Scanner(System.in);

        // Tries all code contained within it
        try {

            // Variable to write user input to a .txt file
            Writer writeToFile = new FileWriter("CharacterFile.txt");

            System.out.println("Welcome to the YandellMoore D&D 5e character creator!\n");

            // Character Name
            System.out.println("What is your Character's name?");
            String myName = myScan.nextLine();

            // Character Race
            do {
                System.out.println("What is your Race?");

                String myRace = myScan.nextLine();

                boolean Race = false;

                // Most of these will look the same
                for (String races : race) {
                    if (races.equalsIgnoreCase(myRace)) {
                        Race = true; // creates a boolean used to track if the input is in the array
                        break;
                    }// if
                }//for

                if (Race) {
                    System.out.println("Accepted.");
                    System.out.println("Are you sure you wish to play this race?");
                    String confirmRace = myScan.nextLine();

                    // This for loop will confirm the player's choice (It will be the same for every other do-loop)
                    for (String confirms : confirmation) {
                        if (confirmRace.equals(confirms)) {
                            validRace = true;
                            break;
                        }//if
                    }//for
                } // if: Scans race[] to see if the value is in the array
                else {
                    System.out.println("Race not found.");
                }//else

                if (validRace) {
                    System.out.println("Understood.");
                    writeToFile.write(myRace);
                    writeToFile.write("\n");
                }//if
                else {
                    System.out.println("Ok, please reselect your race.");
                }//else
            } while (!validRace);

            // Character Class

            do {

                System.out.println("What is your Class?");
                String myClass = myScan.nextLine();

                boolean Class = false;

                for (String classes : characterClass) {
                    if (classes.equalsIgnoreCase(myClass)) {
                        Class = true;// creates a boolean used to track if the input is in the array
                        break;
                    }// if
                }//for

                if (Class) {
                    System.out.println("Accepted.");
                    System.out.println("Are you sure you wish to play this class?");
                    String confirmClass = myScan.nextLine();

                    for (String confirms : confirmation) {
                        if (confirmClass.equals(confirms)) {
                            validClass = true;
                            break;
                        }//if
                    }//for
                } // if: Scans characterClass[] to see if the value is in the array
                else {
                    System.out.println("Class not found.");
                }//else

                if (validClass) {
                    System.out.println("Understood.");
                    writeToFile.write(myClass);
                    writeToFile.write("\n");
                }//if
                else {
                    System.out.println("Ok, please reselect your class.");
                }//else
            } while (!validClass);

            // Character Subclass
            do {
                System.out.println("What is your subclass?");
                String mySubclass = myScan.nextLine();

                boolean subClass = false;

                for (String subClasses : characterSubclass) {
                    if (mySubclass.equalsIgnoreCase(subClasses)) {
                        subClass = true;
                        break;
                    } // IfEnd
                } // ForEnd

                if (subClass) {
                    System.out.println("Accepted.");
                    System.out.println("Are you sure you wish to play this subclass?");
                    String confirmSubclass = (myScan.nextLine());

                    for (String confirms : confirmation) {
                        if (confirmSubclass.equals(confirms)) {
                            validSubclass = true;
                            break;
                        } // IfEnd
                    } // ForEnd
                } // IfEnd
                else {
                    System.out.println("I've literally never heard of that subclass.... +(");
                } // ElseEnd

                if (validSubclass) {
                    System.out.println("Understood.");
                    writeToFile.write(mySubclass);
                    writeToFile.write("\n");
                } // IfEnd
                else {
                    System.out.println("Ok, please reselect your subclass.");
                }
            } while (!validSubclass);

            // Character Level
            do {
                System.out.println("What is your character's level?");

                int myLevel = myScan.nextInt();

                boolean Level = false;

                for (int levels : characterLevel) {
                    if (myLevel == levels) {
                        Level = true;// creates a boolean used to track if the input is in the array
                        break;
                    }// if
                }//for

                if (Level) {
                    System.out.println("Accepted.");
                    System.out.println("Are you certain this is your level?");
                    String confirmLevel = myScan.next();

                    for (String confirms : confirmation) {
                        if (confirmLevel.equals(confirms)) {
                            validLevel = true;
                            break;
                        }//if
                    }//for
                } // if: Scans race[] to see if the value is in the array
                else {
                    System.out.println("This level is unavailable! " +
                            "Just min-max like the rest of us.");
                }//else

                if (validLevel) {
                    System.out.println("Understood.");
                    writeToFile.write(Integer.toString(myLevel));
                    writeToFile.write("\n");
                }//if
                else {
                    System.out.println("Ok, please reselect your level.");
                }//else
            } while (!validLevel);

            // Character Alignment

            do {

                System.out.println("What is your character's alignment?");

                String myAlignment = myScan.nextLine();

                boolean playerAlignment = false;

                for (String alignment : characterAlignment) {
                    if (alignment.equalsIgnoreCase(myAlignment)) {
                        playerAlignment = true;
                        break;
                    } // IfEnd
                } // ForEnd

                if (playerAlignment) {
                    System.out.println("Accepted.");
                    System.out.println("Are you sure you wish to play this alignment?");
                    String confirmAlignment = myScan.nextLine();

                    for (String confirms : confirmation) {
                        if (confirmAlignment.equals(confirms)) {
                            validAlignment = true;
                            break;
                        } // IfEnd
                    } // ForEnd
                } // IfEnd
                else {
                    System.out.println("Not that I'm saying you aren't valid...I'm just saying that alignment isn't real.... +(");
                } // ElseEnd

                if (validAlignment) {
                    System.out.println("Understood.\n");
                    writeToFile.write(myAlignment);
                    writeToFile.write("\n");
                } // IfEnd
                else {
                    System.out.println("Ok, please reselect your alignment.");
                }
            } while (!validAlignment);


            System.out.printf("Name: %s%n", myName);
            writeToFile.write(myName);

            writeToFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }//literallyTheEntireProject
}//FiveEArrays
