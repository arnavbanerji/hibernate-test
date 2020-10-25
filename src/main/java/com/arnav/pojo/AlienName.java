package com.arnav.pojo;

import javax.persistence.Embeddable;

//used to describe full name of Alien.alienName
@Embeddable //this domain class will get embedded into Alien entity
public class AlienName {

    private String fName;
    private String mname;
    private String lName;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "AlienName{" +
                "fName='" + fName + '\'' +
                ", mname='" + mname + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
