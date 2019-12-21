package action;
import po.ReleaseTest;
import service.ITeacherService;
public class TeacherAction {
    private ReleaseTest releaseTest;
    private ITeacherService teacherService=null;

    public ReleaseTest getReleaseTest() {
        return releaseTest;
    }

    public void setReleaseTest(ReleaseTest releaseTest) {
        this.releaseTest = releaseTest;
    }

    public ITeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(ITeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public String startTest() {
        teacherService.startTest(releaseTest);
        return "success";
    }

}
