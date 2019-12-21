package po;

public class Teacher implements java.io.Serializable{
    String tid;
    String tname;

    public Teacher(String tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Teacher() {
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
