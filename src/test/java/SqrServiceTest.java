import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SqrService;

public class SqrServiceTest {

    @Test
    public void testSqr1() {
        int excepted = 3;

        SqrService service = new SqrService();
        int n = service.calcSqr(200, 300);

        Assertions.assertEquals(excepted, n);
    }

    @Test
    public void testSqr2() {
        int excepted = 5;

        SqrService service = new SqrService();
        int n = service.calcSqr(100, 200);

        Assertions.assertEquals(excepted, n);
    }
}
