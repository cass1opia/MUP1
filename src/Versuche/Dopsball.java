package Versuche;
public class Dopsball{
    private int radius;
    tryClass tryClass;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
}
class Solution{
    public static void main(String[] args){
        Dopsball dopsball = new Dopsball();
        System.out.println(dopsball.getRadius());
        dopsball.setRadius(39);
        System.out.println(dopsball.getRadius());
        System.out.println(dopsball.hashCode());
        System.out.println(dopsball.equals(dopsball));

    }
}

class tryClass{
    private boolean isTrue= true ;
}