package com.gfike.Grimoire.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Sighting {

    @Id
    @GeneratedValue
    private int id;

    @OneToOne
    private Monster monster;

    @NotNull
    private int count;


    public Sighting() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
