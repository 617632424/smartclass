package action;
import po.Student;
import service.IUserService;
public class UserAction {
    private Student regstudent;
    private IUserService userService=null;

    public Student getRegstudent() {
        return regstudent;
    }

    public void setRegstudent(Student regstudent) {
        this.regstudent = regstudent;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }
    public String register() {
        userService.register(regstudent);
        return "success";
    }

}
