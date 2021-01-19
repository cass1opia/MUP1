package Uebung3.Aufgabe2;

public class Arbeiter extends Mitarbeiter{
    private double stundenlohn;
    private double geleisteteStunden;

    Arbeiter(String name, double stundenlohn, double geleisteteStunden){
        super(name);
        this.stundenlohn=stundenlohn;
        this.geleisteteStunden=geleisteteStunden;
    }
    double getStundenlohn(){
        return stundenlohn;
    }
    public void setStundenlohn(double stundenlohn){
        this.stundenlohn=stundenlohn;
    }
    public double getGeleisteteStunden(){
        return geleisteteStunden;
    }

    public void setGeleisteteStunden(double geleisteteStunden) {
        this.geleisteteStunden = geleisteteStunden;
    }

    public double berechneVerdienst(){
        return geleisteteStunden*stundenlohn;
    }

    public String toString(){
        return getName()+ " Stundenlohn: " + String.format("%.2f", stundenlohn) + " Euro geleistete Stunden: " + geleisteteStunden + "Stunden";
    }
}
