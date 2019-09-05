package com.gfike.Grimoire.models;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Sighting {

    @Id
    @GeneratedValue
    private int id;

    @EmbeddedId
    @NotNull
    private int monsId;

    @NotNull
    private int count;

    public Sighting(int id, @NotNull int monsId, @NotNull int count) {
        this.id = id;
        this.monsId = monsId;
        this.count = count;
    }

    public Sighting() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonsId() {
        return monsId;
    }

    public void setMonsId(int monsId) {
        this.monsId = monsId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
