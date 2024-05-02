import com.google.common.base.Equivalence;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.auto1.CashbackHackService;

public class CashbackHackServiceTest {

    @Test
    public void testCashBackOnSumLowerThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testCashBackOnSumEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCashBackOnZeroSum() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCashBackOnNegativeSum() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(-10);
        int expected = 1010;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testCashBackOnSumBiggerThanBoundary() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
