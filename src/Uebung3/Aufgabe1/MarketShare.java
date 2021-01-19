package Uebung3.Aufgabe1;

public class MarketShare {
    private int buyerOfA;
    private int buyerOfB;

    /*Constructor for the class MarketShare to set BuyerOfA and BuyerOfB*/
    public MarketShare(int buyerOfA, int buyerOfB){
        this.buyerOfA= buyerOfA;
        this.buyerOfB= buyerOfB;
    }

    /*Getter Methods */
    public int getBuyerOfA(){
        return this.buyerOfA;
    }
    public int getBuyerOfB(){
        return this.buyerOfB;
    }

    public MarketShare nextDay(double stayAtA, double stayAtB){
        int newBuyerOfA=0, newBuyerOfB=0;
        for (int i=1; i<=buyerOfA; i++){
            if(Math.random()>stayAtA) newBuyerOfB++;
            else newBuyerOfA++;
        }
        for (int i=1; i<=buyerOfB; i++){
            if(Math.random()>stayAtB) newBuyerOfA++;
            else newBuyerOfB++;
        }
        return new MarketShare(newBuyerOfA, newBuyerOfB);
    }

    public String toString(){
        return "Marktanteil Käufer Produkt A: " + buyerOfA + " ("
                + Math.round(100.0*(buyerOfA)/(buyerOfA+buyerOfB))
                + "%)" + " Käufer von Produkt B: " + buyerOfB
                + " (" + Math.round(100.0 *(buyerOfB)/(buyerOfA+buyerOfB)) + "%)";
    }
}
