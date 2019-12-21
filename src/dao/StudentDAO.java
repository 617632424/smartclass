package dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import po.Student;
public class StudentDAO extends BaseHibernateDAO implements IStudentDAO{
    public StudentDAO() {
    }

    public void save(Student student) {
        Transaction tran = null;
        Session session = null;
        try {
            session = getSession();
            tran = session.beginTransaction();
            session.save(student);
            tran.commit();
        } catch (RuntimeException re) {
            if(tran != null) tran.rollback();
            throw re;
        } finally {
            session.close();
        }

    }
}
