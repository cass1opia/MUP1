package Uebung3.Aufgabe1;

public class MarketSimulator {
    private MarketShare [] dailyMarketShare;
    private double stayAtA;
    private double stayAtB;

    public MarketSimulator(MarketShare start, int days, double stayAtA, double stayAtB){
        this.dailyMarketShare = new MarketShare[days+1];
        this.dailyMarketShare[0]= start;
        this.stayAtA= stayAtA;
        this.stayAtB= stayAtB;
    }

    public void simulate(){
        for (int i=1; i<dailyMarketShare.length; i++){
            dailyMarketShare[i]=dailyMarketShare[i-1].nextDay(stayAtA, stayAtB);
        }
    }

    public void showMarketDevolopment(){
        String productA=""  , productB="";
        /*
        for (MarketShare day: dailyMarketShare){
            productA+=Integer.toString(day.getBuyerOfA())+ " ";
            productB+=Integer.toString(day.getBuyerOfB())+ " ";
        }
         */
        for(int day=0; day<= dailyMarketShare.length-1; day++){
            productA+=Integer.toString(dailyMarketShare[day].getBuyerOfA())+ " ";
            productB+=Integer.toString(dailyMarketShare[day].getBuyerOfB())+ " ";
        }

        System.out.println("Marktentwicklung");
        System.out.println("Produkt A: " + productA);
        System.out.println("Produkt B: " + productB);
        System.out.println("Finale Marktaufteilung:");
        System.out.println(dailyMarketShare[dailyMarketShare.length-1].toString());

    }
}
