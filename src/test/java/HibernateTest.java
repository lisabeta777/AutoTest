import db.hibernate.DbHibernateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.fintech.qa.homework.utils.BeforeUtils;

public class HibernateTest {
    @BeforeEach
    public void getTestData() {
        BeforeUtils.createData();
    }

    @Test
    public void insertTestHibernate(){
        System.out.println(new DbHibernateService().getAnimalName("Бусинка"));
    }
}
