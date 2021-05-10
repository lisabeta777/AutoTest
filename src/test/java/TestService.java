import db.jdbc.DbService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.fintech.qa.homework.utils.BeforeUtils;

public class TestService {

    @BeforeEach
    public void getTestData() {
    BeforeUtils.createData();
}

    @Test
    public void testJBDC_1(){
    int testResult = new DbService().count("select count (*) from public.animal");
    Assertions.assertEquals(10, testResult);
    }

    @Test
    public void testJBDC_3() {
        int testUpdate = new DbService().getSQL("INSERT INTO public.workman (id, \"name\", age, \"position\") VALUES(7, null, 23, 1)");
        Assertions.assertEquals(0, testUpdate);
    }

    @Test
    public void testJBDC_4() {
        int testUpdate = new DbService().getSQL("INSERT INTO public.places (id, \"row\", place_num, \"name\") VALUES(8, 6, 043, 'Загон 5')");
        int testResult = new DbService().count("select count (*) from public.places");
        Assertions.assertEquals(1, testUpdate);
        Assertions.assertEquals(6, testResult);
    }

    @Test
    public void testJBDC_5() {
        int testResult = new DbService()
                .count("select count (*) from public.zoo");
        String testCentre = new DbService()
                .executeQueryGetName("name", "select*from public.zoo where \"name\" = 'Центральный'");
        String testNorth = new DbService()
                .executeQueryGetName("name", "select*from public.zoo where \"name\" = 'Северный'");
        String testWest = new DbService()
                .executeQueryGetName("name", "select*from public.zoo where \"name\" = 'Западный'");

        Assertions.assertEquals(3, testResult);
        Assertions.assertEquals("Центральный", testCentre);
        Assertions.assertEquals("Северный", testNorth);
        Assertions.assertEquals("Западный", testWest);
    }

}
