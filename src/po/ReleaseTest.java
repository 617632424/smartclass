package po;

import java.util.Date;

public class ReleaseTest implements java.io.Serializable {
    int qId;
    String tId;
    String clId;
    String context;
    String type;
    String answer;
    Date startTime;
    Date endTime;

    public ReleaseTest(int qId, String tId, String clId, String context, String type, String answer, Date startTime, Date endTime) {
        this.qId = qId;
        this.tId = tId;
        this.clId = clId;
        this.context = context;
        this.type = type;
        this.answer = answer;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public ReleaseTest() {
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getClId() {
        return clId;
    }

    public void setClId(String clId) {
        this.clId = clId;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
