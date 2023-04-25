// Project by Eston Yandell and Jacob Moore
// This is the main class for a D&D 5e Character Creator

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FiveEArray.inputToFile();
        ParseMain.ParseMain("CharacterFile.txt");
    } // main
} // Main
