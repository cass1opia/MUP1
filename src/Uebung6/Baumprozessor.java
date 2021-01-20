package Uebung6;

public class Baumprozessor {
    private Knoten wurzelDesBaumes;
    private Operator operator;

    public Baumprozessor(Knoten wurzelDesBaumes, Operator operator){
        this.wurzelDesBaumes = wurzelDesBaumes;
        this.operator = operator;
    }

    private void verarbeiteKnoten(Knoten knoten){
        operator.verarbeiteWert(knoten.getWert());
        for(Knoten kind : knoten.getKinder()){
            verarbeiteKnoten(kind);
        }
    }

    public void berechneErgebnis(){
        verarbeiteKnoten(wurzelDesBaumes);
        System.out.println("Operator: " + operator.getBezeichnung());
        System.out.println("Ergebnis: " + operator.liefereErgebnis());
    }
}
