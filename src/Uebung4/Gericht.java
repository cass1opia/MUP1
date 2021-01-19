package Uebung4;

import java.util.ArrayList;
import java.util.List;

public class Gericht implements Comparable<Gericht> {
    private List<Zutat> zutaten;
    private double preis;

    public Gericht(){
        this.zutaten = new ArrayList<>();
        this.preis= 1.0;
    }

    public void addZutat(Zutat zutat){
        this.zutaten.add(zutat);
        this.preis+=zutat.getPreis();
    }

    public boolean hatZutat(Zutat zutat){
        if(zutaten.contains(zutat)) return true;
        else return false;
    }

    public String getName(){
        StringBuilder string = new StringBuilder();
        for(Zutat zutat: this.zutaten){
           string.append(zutat.getName().substring(0,3));
        }
        return string.toString();
    }

    public boolean istVegan(){
        for(Zutat zutat: this.zutaten){
            if(!zutat.getVegan()) return false;
        }
        return true;
    }

    public int compareTo(Gericht vergleichsobjekt){
        if(this.preis>vergleichsobjekt.preis) return -1;
        if(this.preis==vergleichsobjekt.preis) return 0;
        else return 1;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append(this.getName()+ " ");
        if(this.istVegan()) string.append("(vegan)"+ " ");
        for(Zutat zutat: this.zutaten) string.append(zutat.getName()+ " ");
        string.append(String.format("%.2f", this.preis) + " Euro");
        return string.toString();
    }
}
