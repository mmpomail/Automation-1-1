package ru.netology.auto1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {

    @Test
    public void testCashBackOnSumLowerThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCashBackOnSumEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCashBackOnZeroSum() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCashBackOnNegativeSum() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(-10);
        int expected = 1010;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCashBackOnSumBiggerThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

