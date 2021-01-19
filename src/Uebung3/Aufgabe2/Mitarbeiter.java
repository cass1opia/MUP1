package Uebung3.Aufgabe2;

public class Mitarbeiter {
    private String name;

    Mitarbeiter(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public double berechneVerdienst(){
       return 0;
    }

    public String toString(){
        return name;
    }
}
