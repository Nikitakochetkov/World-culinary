import com.dao.RecieptDao;
import com.entity.Reciept;
import org.junit.jupiter.api.Test;

class TestRecieptDao {

    @Test
    public void testCreate() {
        RecieptDao recieptDao = new RecieptDao();
        Reciept reciept = new Reciept(1, 1);
        recieptDao.create(reciept);
    }

    @Test
    public void testDelete() {
        RecieptDao recieptDao = new RecieptDao();
        Reciept reciept = new Reciept(1, 1);
        recieptDao.create(reciept);
        recieptDao.delete(reciept);
    }

    @Test
    public void testUpdate() {
        RecieptDao recieptDao = new RecieptDao();
        Reciept reciept = new Reciept(1, 1);
        recieptDao.create(reciept);
        recieptDao.update(new Reciept(1, 2));
    }

    @Test
    public void testFind() {
        RecieptDao recieptDao = new RecieptDao();
        Reciept reciept = new Reciept(1, 1);
        Reciept reciept1 = recieptDao.find(1);
        System.out.println(reciept);
    }
}
