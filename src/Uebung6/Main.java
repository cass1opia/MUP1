package Uebung6;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){
        Knoten leftTree = new Knoten(4.4, Arrays.asList(new Knoten(1.0), new Knoten(5.3)));
        Knoten rightTree = new Knoten(3.1 , Arrays.asList(new Knoten(9.2)));
        Knoten wurzel = new Knoten(7.0, Arrays.asList(leftTree, rightTree));

        Baumprozessor durchschnittProzessor = new Baumprozessor(wurzel, new Durchschnitt());
        Baumprozessor summeProzessor = new Baumprozessor(wurzel, new Summe());

        durchschnittProzessor.berechneErgebnis();
        summeProzessor.berechneErgebnis();
    }
}
