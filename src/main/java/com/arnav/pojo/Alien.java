package com.arnav.pojo;

import javax.persistence.*;

@Entity
@Table(name = "alien_table") //mention schema of table name in case u dont want POJO class name to be the database table name
public class Alien {

    @Id
    private int alienID;
    @Transient //if you dont want this property to act as a column
    private String alienName;
    @Column(name = "alien_color") //mention explicitly schema of column name
    private String color;

    public int getAlienID() {
        return alienID;
    }

    public void setAlienID(int alienID) {
        this.alienID = alienID;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlienName(String alienName) {
        this.alienName = alienName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //if you are not overriding toString(), by default it will get hash code of the object
    @Override
    public String toString() {
        return "Alien{" +
                "alienID=" + alienID +
                ", alienName='" + alienName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
