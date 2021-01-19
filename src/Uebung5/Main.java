package Uebung5;

public class Main {
    public static void main(String[] args){
        BuchstabenStat buchstabenStat = new BuchstabenStat();
        String projectPath = System.getProperty("user.dir") + "/src/Uebung5/" ;
        try {
            buchstabenStat.analysiere( projectPath + "Faust_kaputt.txt");
        }catch(FalscherDateitypException e){
            System.err.println(e.getMessage());
            System.exit(1);

        }catch(UngueltigesZeichenException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }
        buchstabenStat.zeigeTop10();
        buchstabenStat.schreibeStatistik(projectPath + "FaustStat.TXT");
    }
}
