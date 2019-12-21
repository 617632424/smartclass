package service;
import dao.BaseHibernateDAO;
import dao.IReleaseTestDAO;
import po.ReleaseTest;
public class TeacherService extends BaseHibernateDAO implements ITeacherService{
    private IReleaseTestDAO releaseTestDAO=null;
    public TeacherService(){}

    public TeacherService(IReleaseTestDAO releaseTestDAO) {
        this.releaseTestDAO = releaseTestDAO;
    }

    public IReleaseTestDAO getReleaseTestDAO() {
        return releaseTestDAO;
    }

    public void setReleaseTestDAO(IReleaseTestDAO releaseTestDAO) {
        this.releaseTestDAO = releaseTestDAO;
    }

    public void startTest(ReleaseTest rt)
    {
        releaseTestDAO.save(rt);

    }
}
