package Uebung1;

public class Name {
   public static void main(String[] args)
    {
        String name= "Adrian Schmidt";
        String eman= "";
        for(int i = 0; i!=name.length(); i++)
        {
            eman += name.charAt(name.length()-1 -i);
        }
        System.out.println(eman);
    }
}

