import ch.hesge.cours634.counter.*;

public class Main {

    public static void main(String[] args) throws CounterException {
        testCounter();
        testCounterNoLimite();
        testCounterLimite();
    }

    private static void testCounter() throws CounterException {
        //Création des compteurs
        Counter counter = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new UpperLimitedPositiveCounter(3);

        //Test de base
        counter.inc();
        if (counter.getValue() != 1){
            throw new CounterException("test inc failed");
        }

        //Incrémentation
        c1.inc();
        c1.add(2);
        c2.add(2);
        c2.inc();

        System.out.println("Etape 1 (Pas d'exception) : Valeur compteur 1 : " + c1.getValue() + " et valeur compteur 2 : " + c2.getValue());
    }

    private static void testCounterNoLimite() throws CounterException {
        //Création des compteurs
        Counter c1 = new Counter();
        Counter c2 = new UpperLimitedPositiveCounter(3);

        //Incrémentation
        c1.inc();
        c1.add(2);
        c2.add(2);
        c2.inc();
        c1.inc();
        c1.inc();

        System.out.println("Etape 2 (Pas d'exception) : Valeur compteur 1 : " + c1.getValue() + " et valeur compteur 2 : " + c2.getValue());
    }

    private static void testCounterLimite() throws CounterException {
        //Création des compteurs
        Counter c1 = new Counter();
        Counter c2 = new UpperLimitedPositiveCounter(3);

        //Incrémentation
        c1.inc();
        c1.add(2);
        c2.add(2);
        c2.inc();
        try {
            c2.inc();
            System.out.println("Etape 3 (Exception) : Valeur compteur 1 : " + c1.getValue() + " et valeur compteur 2 : " + c2.getValue());
        }catch (CounterException e){
            System.out.println("Etape 3 : Erreur (Ce qui est normal)");
        }
    }


    private static void testCounterNegativeLimite(){}





}
