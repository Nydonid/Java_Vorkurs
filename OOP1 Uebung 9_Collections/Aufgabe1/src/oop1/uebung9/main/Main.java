package oop1.uebung9.main;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Sample code to illustrate how the CatalogueReader could be used:
        try (var reader = new CatalogueReader("StudyCatalogue.txt")) {
            String[] names;
            while ((names = reader.readNextLine()) != null) {
                System.out.print("Module: " + names[0] + " Prerequisite: ");
                for (int i = 1; i < names.length; i++) {
                    System.out.print(names[i] + " ");
                }
                System.out.println();
            }
        }
    }
    Object OO = new Object();
    ArrayList <Object> DB1 = new ArrayList<>();
    Object DB2 = new Object();
    Object Math = new Object();
    Object AD1 = new Object();
    Object CP1 = new Object();
    Object Thesis = new Object();
    Object SE1 = new Object();
    Object SE2 = new Object();
    Object UI1 = new Object();
    Object UI2 = new Object();

}