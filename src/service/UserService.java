package service;
import dao.BaseHibernateDAO;
import dao.IStudentDAO;
import org.hibernate.Session;
import org.hibernate.Transaction;
import po.Student;

public class UserService extends BaseHibernateDAO implements IUserService{
    private IStudentDAO studentDAO=null;
    public UserService(){}
//    public IStudentDAO getStudentDAO() {
//        return studentDAO;
//    }
    public void setStudentDAO(IStudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public void register(Student student)
    {
        studentDAO.save(student);

    }
}
