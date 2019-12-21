package dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import po.ReleaseTest;
public class ReleaseTestDAO extends BaseHibernateDAO implements IReleaseTestDAO{
    public ReleaseTestDAO() {
    }

    public void save(ReleaseTest rt){
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.save(rt);
            tran.commit();
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            throw re;
        } finally {
            session.close();
        }
    }
}
