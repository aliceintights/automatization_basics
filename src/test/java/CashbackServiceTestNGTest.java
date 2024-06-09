import org.example.CashbackHackService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackServiceTestNGTest {

    @Test
    public void shouldTestTheRemainingAMount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldTestIfAmountIsEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldTestIfAmountIs500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
}
