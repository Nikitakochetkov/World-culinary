import com.dao.KitchenDao;
import com.entity.Kitchen;
import org.junit.jupiter.api.Test;

class TestKichenDao {

    @Test
    public void testCreate() {
        KitchenDao kitchenDao = new KitchenDao();
        Kitchen kitchen = new Kitchen(1, "Belarus");
        kitchenDao.create(kitchen);
    }

    @Test
    public void testDelete() {
        KitchenDao kitchenDao = new KitchenDao();
        Kitchen kitchen = new Kitchen(1, "Belarus");
        kitchenDao.create(kitchen);
        kitchenDao.delete(kitchen);
    }

    @Test
    public void testUpdate() {
        KitchenDao kitchenDao = new KitchenDao();
        Kitchen kitchen = new Kitchen(1, "Belarus");
        kitchenDao.create(kitchen);
        kitchenDao.update(new Kitchen(1,"Russia"));
    }

    @Test
    public void testFind() {
        KitchenDao kitchenDao = new KitchenDao();
        Kitchen kitchen = new Kitchen(1, "Belarus");
        Kitchen kitchen1 = kitchenDao.find(1);
        System.out.println(kitchen);
    }
}
