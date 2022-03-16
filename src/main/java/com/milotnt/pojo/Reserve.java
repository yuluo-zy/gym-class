package com.milotnt.pojo;

import javax.xml.crypto.Data;
import java.util.Date;

public class Reserve {
    public Reserve(Integer id, Date start, Date end, Integer classId) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.classId = classId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private  Integer id;
    private Date start;
    private Date end;

    public Reserve(Date start, Date end, Integer classId) {
        this.start = start;
        this.end = end;
        this.classId = classId;
    }

    private Integer classId;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
