package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    protected int max; //Compteur max

    public UpperLimitedPositiveCounter(int max) {
        //super(max);
        this.max =  max;
    }

    //private int cmpt = 0; //Compteur
    //private int max; //Compteur max

    @Override
    public void inc() throws CounterException {
        checkMax(1);
        cmpt++;
    }

    @Override
    public void add(int step) throws CounterException {
        checkMin(step);
        checkMax(step);
        cmpt = cmpt + step;
    }

    private void checkMax(int step) throws CounterException {
        if (cmpt+step > max){
            throw new CounterException("Le compteur a atteint sa limite !");
        }
    }

    @Override
    public int getValue() {
        return cmpt;
    }
}
