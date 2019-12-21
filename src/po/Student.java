package po;

public class Student implements java.io.Serializable{
    String stuid;
    String stuname;

    public Student(String stuid, String stuname) {
        this.stuid = stuid;
        this.stuname = stuname;
    }

    public Student() {
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }
}
