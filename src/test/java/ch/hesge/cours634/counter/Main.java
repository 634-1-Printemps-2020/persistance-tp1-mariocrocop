import ch.hesge.cours634.counter.*;

public class Main {

    //public static void main(String[] args) { System.out.println("Hello World!");}

    public static void main(String[] args) throws CounterException {
        System.out.println("Hello World!");

        //Création des compteurs
        Counter c1 = new Counter(3);
        Counter c2 = new UpperLimitedPositiveCounter(3);

        //Incrémentation
        c1.add(2);
        c1.inc();

        c2.add(2);
        c2.inc();

        System.out.println("Etape 1 : Valeur compteur 1 : " + c1.getValue() + " et valeur compteur 2 : " + c2.getValue());

        //Incrémentation de trop pour le compteur sans limite
        c1.inc();
        System.out.println("Etape 2 : Valeur compteur 1 : " + c1.getValue() + " et valeur compteur 2 : " + c2.getValue());

        //Incrémentation de trop pour le compteur avec limite
        c2.inc();
        System.out.println("Etape 3 : Valeur compteur 1 : " + c1.getValue() + " et valeur compteur 2 : " + c2.getValue());

    }




}
