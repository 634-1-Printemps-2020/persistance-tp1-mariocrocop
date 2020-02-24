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
        cmpt = cmpt + step;
    }

    @Override
    public int getValue() {
        return cmpt;
    }
}
