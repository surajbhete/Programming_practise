package com.suraj1.example1.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Pen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int penId;
    private String name;
    private int penLife;

    /*public int getPenId() {
        return penId;
    }

    public void setPenId(int penId) {
        this.penId = penId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPenLife() {
        return penLife;
    }

    public void setPenLife(int penLife) {
        this.penLife = penLife;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penId=" + penId +
                ", name='" + name + '\'' +
                ", penLife=" + penLife +
                '}';
    }

    public Pen(int penId, String name, int penLife) {
        this.penId = penId;
        this.name = name;
        this.penLife = penLife;
    }*/
}
