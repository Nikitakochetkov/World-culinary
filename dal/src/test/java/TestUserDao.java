import com.dao.AdministratorDao;
import com.dao.UserDao;
import com.entity.Administrator;
import com.entity.User;
import org.junit.jupiter.api.Test;

class TestUserDao {

    @Test
    public void testCreate() {
        UserDao userDao = new UserDao();
        User user = new User(1, "Nikita", "Cooler", "Kochetkov", 21, "Flash");
        userDao.create(user);
    }

    @Test
    public void testDelete() {
        UserDao userDao = new UserDao();
        User user = new User(1, "Nikita", "Cooler", "Kochetkov", 21, "Flash");
        userDao.create(user);
        userDao.delete(user);
    }

    @Test
    public void testUpdate() {
        UserDao userDao = new UserDao();
        User user = new User(2, "Nikolai", "Killer", "Petushkov", 54, "Svicha");
        userDao.create(user);
        userDao.update(user);
    }

    @Test
    public void testFind() {
        UserDao userDao = new UserDao();
        User user = new User(2, "Nikolai", "Killer", "Petushkov", 54, "Svicha");
        User user1 = userDao.find(2);
        System.out.println(user);
    }
}
