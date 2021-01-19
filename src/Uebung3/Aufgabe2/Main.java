package Uebung3.Aufgabe2;

public class Main {
    public static void main(String [] args){
        Verwaltung verwaltung = new Verwaltung(20);
        String [] namen = {"beppo", "cassiopeia", "meister Hora", "Momo", "Goofy", "Albus Dumbledore", "Rooney", "Sofie Amundsen"};
        for (int i=0; i<4; i++) verwaltung.addMitarbeiter(new Arbeiter(namen[i], 10*Math.random(), 100*Math.random()));
        for (int i=0; i<4; i++) verwaltung.addMitarbeiter(new Angestellter(namen[3+i], 20000*Math.random()));
        System.out.println("Personalkosten(1): " + String.format("%.2f", verwaltung.berechnePersonalkosten()) + " Euro");
        verwaltung.removeMitarbeiter(verwaltung.getMitarbeiter()[0]);
        System.out.println("Personalkosten(2): " + String.format("%.2f", verwaltung.berechnePersonalkosten()) + " Euro");
        verwaltung.zeigeArbeiterMitWenigerAlsXStunden(100);
    }
}
