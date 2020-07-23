import com.dao.AdministratorDao;
import com.dao.KitchenDao;
import com.dao.RecieptDao;
import com.dao.UserDao;
import com.entity.Administrator;
import com.entity.Kitchen;
import com.entity.Reciept;
import com.entity.User;

public class StarterApp {
//todoo Config HikariCP
    private static AdministratorDao administratorDao = new AdministratorDao();
    private static KitchenDao kitchenDao = new KitchenDao();
    private static UserDao userDao = new UserDao();
    private static RecieptDao recieptDao = new RecieptDao();

    public static void main(String[] args) {

        Administrator administrator1 = new Administrator(1,"Allowed", 1);
        Administrator administrator2 = new Administrator(2,"Blocked", 2);

        administratorDao.create(administrator1);
        administratorDao.create(administrator2);

        administratorDao.update(new Administrator(2));

        administratorDao.delete(new Administrator(2));

        Administrator administrator3 = administratorDao.find(1);
        System.out.println(administrator3);
        System.out.println(" -- Your permition is -- : " + administrator3.getPermission());


        Kitchen kitchen = new Kitchen(1, "Belarus");

        kitchenDao.create(kitchen);
        kitchenDao.update(new Kitchen(1, "Brazilian"));
        kitchenDao.delete(new Kitchen(1, "Brazilian"));

        Kitchen kitchen1 = kitchenDao.find(1);
        System.out.println(kitchen1);


        User user = new User(1, "Nikita", "Cooler", "Kochetkov", 21, "Flash");
        User user1 = new User(2, "Max", "Divan", "Nickto", 98, "Stalker");
        User user2 = new User(3, "Aleksei", "Iue", "Iskatel", 32, "Thandom");

        userDao.create(user);
        userDao.create(user1);
        userDao.create(user2);

        userDao.update(new User(1, "Ivan", "Cop", "Ivanushka", 22, "Prostak"));
        userDao.delete(new User(1));

        User user3 = userDao.find(1);
        System.out.println(user1);
        System.out.println(" -- Your role is -- : " + user1.getRole());
        System.out.println(user3.toString());

        Reciept reciept = new Reciept(1, 1);
        Reciept reciept1 = new Reciept(2, 1);
        Reciept reciept2 = new Reciept(3, 2);

        recieptDao.create(reciept);
        recieptDao.create(reciept1);
        recieptDao.create(reciept2);

        recieptDao.update(new Reciept(1, 2));
        recieptDao.delete(new Reciept(2));

        Reciept reciept3 = recieptDao.find(2);
        System.out.println(reciept3);
        System.out.println("Your reciept is : " + reciept.getId());
    }
}
