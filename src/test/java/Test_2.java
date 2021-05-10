import db.jdbc.DbService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.fintech.qa.homework.utils.BeforeUtils;

public class Test_2 {

    @BeforeEach
    public void getTestData() {
        BeforeUtils.createData();
    }

    @Test
    public void testJBDC_2_1() {
        int testUpdate = new DbService().getNumberUpdate(1);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_2() {
        int testUpdate = new DbService().getNumberUpdate(2);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_3() {
        int testUpdate = new DbService().getNumberUpdate(3);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_4() {
        int testUpdate = new DbService().getNumberUpdate(4);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_5() {
        int testUpdate = new DbService().getNumberUpdate(5);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_6() {
        int testUpdate = new DbService().getNumberUpdate(6);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_7() {
        int testUpdate = new DbService().getNumberUpdate(7);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_8() {
        int testUpdate = new DbService().getNumberUpdate(8);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_9() {
        int testUpdate = new DbService().getNumberUpdate(9);
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_2_10() {
        int testUpdate = new DbService().getNumberUpdate(10);
        Assertions.assertEquals(0, testUpdate);
    }
}
