package ch.hesge.cours634.counter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {

    @Test (expected = CounterException.class)
    public void inc() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(2);
        counter.inc();
        counter.inc();
        Assert.assertEquals(2,counter.getValue());
    }

    @Test (expected = CounterException.class)
    public void add() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(5);
        counter.add(10);
    }

    @Test
    public void getValue() throws CounterException {
        UpperLimitedPositiveCounter counter = new UpperLimitedPositiveCounter(10);
        counter.inc();
        counter.add(5);
        counter.add(-1);
        Assert.assertEquals(5,counter.getValue());
    }
}