package com.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Handler {

    public ArrayList<Henger> readFile() {
        try {
            return tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
            return null;
        }
    }
    private ArrayList<Henger> tryReadFile() throws FileNotFoundException {
        ArrayList<Henger> hengerList = new ArrayList<>();
        File file = new File("henger.txt");
        Scanner sc = new Scanner(file, "utf8");
        sc.nextLine();
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(";");
            Henger henger = new Henger(null, null, null);
            henger.setId(Integer.valueOf(lineArray[0]));
            henger.setRadius(Double.valueOf(lineArray[1]));
            henger.setLength(Double.valueOf(lineArray[2]));
            henger.setSurface(Double.valueOf(lineArray[3]));
            hengerList.add(henger);       
        }
        sc.close();
        return hengerList;
    }
}
