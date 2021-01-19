package Uebung4;
import java.util.*;

public class MenuePlaner {

    private List<Zutat> zutatenListe;
    private Map<String,List<Gericht>> speiseplan;

    public MenuePlaner(Zutat[] zutatenArray) {
        zutatenListe = new ArrayList<>(Arrays.asList(zutatenArray));
        speiseplan = new HashMap<>();
    }

    private int zufallszahl(int minimum, int maximum) {
        return (int)(Math.random() * (maximum + 1 - minimum)) + minimum;
    }

    public Gericht erstelleGericht() {
        double anzahlZutaten = zufallszahl(3, 5), hinzugefuegt = 0;
        Gericht gericht = new Gericht();
        while (hinzugefuegt < anzahlZutaten) {

            //get a random Zutat
            Zutat neueZutat = zutatenListe.get(Math.round(zufallszahl(0, zutatenListe.size()-1)));

            if (!gericht.hatZutat(neueZutat)) gericht.addZutat(neueZutat);
            hinzugefuegt++;
        }
        return gericht;
    }

    public void erstelleMenueFuerWochentag(String tag, int anzahlGerichte){
        speiseplan.put(tag, new ArrayList<Gericht>());
        for(int i=0; i<anzahlGerichte; i++) speiseplan.get(tag).add(erstelleGericht());
    }

    public void erstelleSpeiseplan(){
        erstelleMenueFuerWochentag("Montag", 4);
        erstelleMenueFuerWochentag("Dienstag", 4);
        erstelleMenueFuerWochentag("Mittwoch", 5);
    }

    public String getMenueFuerWochentag(String tag){
        //Creating the Output-String with a StringBuilder
        StringBuilder string = new StringBuilder();
        if(speiseplan.containsKey(tag)) string.append(tag + ":\n");
        else return "Die Mensa hat geschlossen!";

        //Sort and reverse the List of Gericht
        Collections.sort(speiseplan.get(tag));
        Collections.reverse(speiseplan.get(tag));

        for(Gericht gericht: speiseplan.get(tag)) string.append(gericht.toString() + "\n");

        return string.toString();
    }


}
