import org.example.CashbackHackService;
import org.junit.Assert;
import org.junit.Test;

public class CashbackServiceJUnitJupiterTest {

    @Test
    public void shouldTestTheRemainingAMount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIfAmountIsEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldTestIfAmountIs500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
