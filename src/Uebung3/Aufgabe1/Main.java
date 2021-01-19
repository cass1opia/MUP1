package Uebung3.Aufgabe1;

public class Main {
    public static void main(String[] args){
        MarketSimulator marketSimulator = new MarketSimulator(new MarketShare(5000, 5000),20, 0.8, 0.7);
        marketSimulator.simulate();
        marketSimulator.showMarketDevolopment();
    }
}
