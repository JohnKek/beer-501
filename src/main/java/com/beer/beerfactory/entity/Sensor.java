package com.beer.beerfactory.entity;

import javax.persistence.*;

@Entity
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor")
    int id_sensor;

    @Column(name = "name_sensor")
    String name_sensor;

    public Sensor(int id_sensor, String name_sensor) {
        this.id_sensor = id_sensor;
        this.name_sensor = name_sensor;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id_sensor=" + id_sensor +
                ", name_sensor='" + name_sensor + '\'' +
                '}';
    }

    public int getId_sensor() {
        return id_sensor;
    }

    public void setId_sensor(int id_sensor) {
        this.id_sensor = id_sensor;
    }

    public String getName_sensor() {
        return name_sensor;
    }

    public void setName_sensor(String name_sensor) {
        this.name_sensor = name_sensor;
    }

    public Sensor() {
    }
}
