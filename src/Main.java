import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Define pools
        Pool poolA = new Pool(1,"Paddling Pool",20);
        Pool poolB = new Pool(2,"adolescents",200);
        Pool poolC = new Pool(3,"AdultsOnly",600);
        Pool pool666 = new Pool(666,"HotterThenHell",666);

        // create complex
        Complex compoundA = new Complex(poolA);

        // add remaning pools
        compoundA.addPool(poolB);
        compoundA.addPool(poolC);
        compoundA.addPool(pool666);

        // generate guests
        Guest Henk = new Guest("GekkeHenkie",38.0,0.1);
        Guest Astrid = new Guest("Astrid",36.9,0.1);
        Guest Piet = new Guest("Piet",37.1,0.2);
        Guest Karel = new Guest("Karel",37.5,0.4);
        Guest Jan = new Guest("Jan",37.1,0.1);
        Guest Klaas = new Guest("Klaas",38.0,0.5);
        Guest JanFrederique = new Guest("JanFrederique",37.9,0.35);
        Guest CoronaPatient = new Guest("COVID19",41.0,0.1);
        Guest TeDiepInHetGlaasje = new Guest("Sergey",38.0,2.1);
        Guest NietGetroffen = new Guest("PechVogel",40.5,0.7);

        System.out.println(Henk.getName() + " has a temperature of: " + Henk.getTemperature() + " and his bloodalcohol is: " + Henk.getBloodAlcohol());
        System.out.println(CoronaPatient.getName() + " has a temperature of: " + CoronaPatient.getTemperature() + " and his bloodalcohol is: " + CoronaPatient.getBloodAlcohol());
        System.out.println(TeDiepInHetGlaasje.getName() + " has a temperature of: " + TeDiepInHetGlaasje.getTemperature() + " and his bloodalcohol is: " + TeDiepInHetGlaasje.getBloodAlcohol());
        System.out.println(NietGetroffen.getName() + " has a temperature of: " + NietGetroffen.getTemperature() + " and his bloodalcohol is: " + NietGetroffen.getBloodAlcohol());

        System.out.println("Is " + CoronaPatient.getName() + " healthy?:" + CoronaPatient.isHealthy());
    }
}
