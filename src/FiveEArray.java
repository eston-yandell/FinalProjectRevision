import java.util.Scanner;

public class FiveEArray {
    public static void main(String[] args) {
        String c1ass[] = {"Barbarian", "Bard", "Cleric", "Druid",
                "Fighter", "Monk", "Paladin", "Ranger",
                "Rogue", "Sorcerer", "Warlock", "Wizard"};

        String race[] = {"Dragonborn", "Dwarf", "Elf", "Gnome",
                "Half-Elf", "Halfling", "Half-Orc", "Human",
                "Tiefling"};

        String confirmation[] = {"Yes", "Y", "confirm", "yes", "y", "Confirm"};

        boolean con1 = false;
        boolean con2 = false;

        Scanner myScan = new Scanner(System.in);
        Scanner myScan2 = new Scanner(System.in);
        Scanner myScan3 = new Scanner(System.in);

        while(con1 == false){

            System.out.println("What is your Race?");
            String myRace = myScan.nextLine();

            boolean Race = false;

            for( int i=0; i < race.length; i++ ) {
                if (myRace.equals(race[i])) {
                    Race = true;// creates a boolean used to track if the input is in the aray
                }// if
            }//for

            if (Race == true) {
                System.out.println("Accepted.");
                System.out.println("Are you sure you wish to play this race?");
                String confirm = myScan2.nextLine();

                for( int i=0; i < confirmation.length; i++){
                    if( confirm.equals(confirmation[i])){
                        con1 = true;
                    }//if
                }//for
            } // if: Scans race[] to see if the value is in the array
            else {
                System.out.println("Race not found.");
            }//else

            if(con1 == true){
                System.out.println("Understood.");
            }//if
            else{
                System.out.println("Ok, please reselect your race.");
            }//else
        }//while

        while(con2 == false) {

            System.out.println("What is your Class?");
            String myClass = myScan.nextLine();

            boolean Class = false;

            for (int i = 0; i < c1ass.length; i++) {
                if (myClass.equals(c1ass[i])) {
                    Class = true;// creates a boolean used to track if the input is in the array
                }// if
            }//for

            if (Class == true) {
                System.out.println("Accepted.");
                System.out.println("Are you sure you wish to play this class?");
                String confirm = myScan2.nextLine();

                for( int i=0; i < confirmation.length; i++){
                    if( confirm.equals(confirmation[i])){
                        con2 = true;
                    }//if
                }//for
            } // if: Scans c1ass[] to see if the value is in the array
            else {
                System.out.println("Class not found.");
            }//else

            if(con2 == true){
                System.out.println("Understood.");
            }//if
            else{
                System.out.println("Ok, please reselect your class.");
            }//else
        }//while
    }//Main
}//FiveEArrays
