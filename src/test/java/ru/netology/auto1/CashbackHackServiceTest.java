package ru.netology.auto1;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testCashBackOnSumLowerThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCashBackOnSumEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCashBackOnZeroSum() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCashBackOnNegativeSum() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(-10);
        int expected = 1010;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCashBackOnSumBiggerThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}

