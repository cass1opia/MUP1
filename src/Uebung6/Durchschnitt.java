package Uebung6;

public class Durchschnitt implements Operator {

    private int anzahlSummanden = 0;
    private double summe = 0;

    public Durchschnitt(){};

    @Override
    public void verarbeiteWert(double wert) {
        this.summe += wert;
        anzahlSummanden ++;
    }

    @Override
    public double liefereErgebnis() {
        return summe/(double)anzahlSummanden;
    }

    @Override
    public String getBezeichnung() {
        return "Durchschnitt";
    }
}
