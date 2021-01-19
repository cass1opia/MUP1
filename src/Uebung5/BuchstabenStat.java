package Uebung5;
import Tutorium.Streams.IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BuchstabenStat {
    private Map<Character, Integer> buchstabenHäufigkeit;
    private long buchstabenAnzahl;

    public BuchstabenStat(){
        this.buchstabenAnzahl= 0;
        buchstabenHäufigkeit = new HashMap<Character, Integer>();
    }

    private void pruefeDateityp(String dateiname)throws FalscherDateitypException {
        //check wether the string ends with .txt(case-insensitive) with a regular Expression
        if (!dateiname.substring(dateiname.length()-4).matches("(?i).txt")){
            throw new FalscherDateitypException(dateiname);
        }
    }

    private void verarbeiteZeichen (char character)throws UngueltigesZeichenException{
        character = Character.toUpperCase(character);
        if(Character.isLetter(character)){
            if(buchstabenHäufigkeit.containsKey(character)) {
                buchstabenHäufigkeit.replace(character, buchstabenHäufigkeit.get(character) + 1);
            }
            else {
                buchstabenHäufigkeit.put(character, 1);
            }
            buchstabenAnzahl++;
        }
        else if(!Character.isDefined(character)) throw new UngueltigesZeichenException();
    }

    private void verarbeiteZeile (String zeile) throws UngueltigesZeichenException {
        for(char character : zeile.toCharArray()) verarbeiteZeichen(character);
    }

    public void analysiere (String dateiname) throws FalscherDateitypException, UngueltigesZeichenException{
        pruefeDateityp(dateiname);
        int zeilenNummer =0;
        try(FileReader fR = new FileReader(dateiname, StandardCharsets.UTF_8);BufferedReader bR = new BufferedReader(fR)){
            String zeile = bR.readLine();
            while(zeile!=null) {
                zeilenNummer++;
                verarbeiteZeile(zeile);
                zeile = bR.readLine();
            }
        }catch(FileNotFoundException e){
            System.err.println("Die Datei konnte nicht gefunden werden.");
            System.exit(1);
        }catch(IOException e){
            System.err.println("Die Datei konnte nicht gelesen werden.");
            System.exit(1);
        }catch(UngueltigesZeichenException e) {
            throw new UngueltigesZeichenException(dateiname, zeilenNummer);
        }
    }

    public void zeigeTop10() {
        Set<Map.Entry<Character, Integer>> entrySet = buchstabenHäufigkeit.entrySet();
        List<Map.Entry<Character, Integer>> listOfEntries = new ArrayList<>(entrySet);
        Collections.sort(listOfEntries, Map.Entry.comparingByValue());
        System.out.println("Buchstaben-Top 10:");
        for (Map.Entry<Character, Integer> entry : listOfEntries) System.out.println(entry);
    }

    public String statistik (){
        StringBuilder stringB = new StringBuilder();
        for(Map.Entry<Character, Integer> entry: buchstabenHäufigkeit.entrySet()){
            String anteil = String.format("%.2f", (((double)entry.getValue()/buchstabenAnzahl)));
            stringB.append(entry.getKey() + ": " + anteil + System.lineSeparator());
        }
        return stringB.toString();
    }

    public void schreibeStatistik (String dateiname){
        try(FileWriter fw = new FileWriter(dateiname); BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(statistik());
        }catch(IOException e){
            System.err.println("Datei konnte nicht beschrieben werden.");
            System.exit(1);
        }
    }
}
