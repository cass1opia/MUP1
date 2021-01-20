package Uebung6;

public class Summe implements Operator{

    private double summe = 0;

    public Summe(){};

    @Override
    public void verarbeiteWert(double wert) {
        this.summe += wert;
    }

    @Override
    public double liefereErgebnis() {
        return this.summe;
    }

    @Override
    public String getBezeichnung() {
        return "Summe";
    }
}
