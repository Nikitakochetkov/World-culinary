import com.dao.AdministratorDao;
import com.entity.Administrator;
import org.junit.jupiter.api.Test;

class TestAdministratorDao {

    @Test
    public void testCreate() {
        AdministratorDao administratorDao = new AdministratorDao();
        Administrator administrator = new Administrator(1, "Blocked", 1);
        administratorDao.create(administrator);
    }

    @Test
    public void testDelete() {
        AdministratorDao administratorDao = new AdministratorDao();
        Administrator administrator = new Administrator(1, "Blocked", 1);
        administratorDao.create(administrator);
        administratorDao.delete(administrator);
    }

    @Test
    public void testUpdate() {
        AdministratorDao administratorDao = new AdministratorDao();
        Administrator administrator = new Administrator(1, "Blocked", 1);
        administratorDao.create(administrator);
        administratorDao.update(new Administrator(1, "Allowed", 1));
    }

    @Test
    public void testFind() {
        AdministratorDao administratorDao = new AdministratorDao();
        Administrator administrator1 = new Administrator(2,"Postponted", 2);
        Administrator administrator3 = administratorDao.find(1);
        System.out.println(administrator1);
    }
}
