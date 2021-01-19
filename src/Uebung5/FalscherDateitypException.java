package Uebung5;

public class FalscherDateitypException extends Exception{
    public FalscherDateitypException(String dateiname){
        super(dateiname + "hat eine nicht kompatible Dateiendung.");
    }
}
