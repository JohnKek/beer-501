package com.beer.beerfactory.entity;

import javax.persistence.*;

@Entity
@Table(name = "beer")
public class Beer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_beer")
    int id;

    @Column(name = "name_beer")
    String name_beer;

    @Column(name = "value_beer")
    double value_beer;

    public Beer() {
    }

    public Beer(int id, String name_beer, double velue_beer) {
        this.id = id;
        this.name_beer = name_beer;
        this.value_beer = velue_beer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_beer() {
        return name_beer;
    }

    public void setName_beer(String name_beer) {
        this.name_beer = name_beer;
    }

    public double getValue_beer() {
        return value_beer;
    }

    public void setValue_beer(double velue_beer) {
        this.value_beer = velue_beer;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "id=" + id +
                ", name_beer='" + name_beer + '\'' +
                ", velue_beer=" + value_beer +
                '}';
    }
}
