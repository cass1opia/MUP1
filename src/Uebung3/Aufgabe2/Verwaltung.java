package Uebung3.Aufgabe2;

public class Verwaltung{
    private Mitarbeiter[] mitarbeiter;
    public Verwaltung(int anzahlMitarbeiter){
        mitarbeiter= new Mitarbeiter[anzahlMitarbeiter];
    }
    public Mitarbeiter[] getMitarbeiter(){
        return mitarbeiter;
    }

    public boolean addMitarbeiter(Mitarbeiter neuerMitarbeiter){
        for(int i=0 ; i<mitarbeiter.length; i++){
            if(mitarbeiter[i]==null){
               mitarbeiter[i]= neuerMitarbeiter;
               return true;
            }
        }
        return false;
    }

    public boolean removeMitarbeiter(Mitarbeiter mitarbeiter){
        for (int i=0; i<this.mitarbeiter.length; i++){
            if(this.mitarbeiter[i]==mitarbeiter){
                this.mitarbeiter[i]=null;
                return true;
            }
        }
        return false;
    }

    public double berechnePersonalkosten(){
        double personalkosten=0;
        for (Mitarbeiter mitarbeiter: this.mitarbeiter){
            if(mitarbeiter!=null) personalkosten+=mitarbeiter.berechneVerdienst();
        }
        return personalkosten;
    }

    public void zeigeArbeiterMitWenigerAlsXStunden(double stunden){
        for(Mitarbeiter mitarbeiter: this.mitarbeiter){
            if(mitarbeiter instanceof Arbeiter && ((Arbeiter) mitarbeiter).getGeleisteteStunden()<=stunden){
                System.out.println(mitarbeiter.toString());
            }
        }

    }
}
