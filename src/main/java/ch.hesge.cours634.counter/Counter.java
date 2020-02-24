package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    protected int cmpt = 0; //Compteur
    //protected int max; //Compteur max

    public Counter() {
        //this.max = max;
    }

    @Override
    public void inc() throws CounterException {
        cmpt++;
    }

    @Override
    public void add(int step) throws CounterException {
        checkMin(step);
        cmpt = cmpt + step;
    }

    //Permet d'éviter les valeur négatives
    protected void checkMin(int step) throws CounterException {
        if(cmpt+step <= 0){
            throw new CounterException("La valeur du compteur ne peux pas être négative");
        }
    }

    @Override
    public int getValue() {
        return cmpt;
    }
}
