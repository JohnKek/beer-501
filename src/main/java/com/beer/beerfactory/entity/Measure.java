package com.beer.beerfactory.entity;

import javax.persistence.*;

@Entity
@Table(name = "measure")
public class Measure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_measure")
    int id_measure;

    @Override
    public String toString() {
        return "Measure{" +
                "id_measure=" + id_measure +
                ", value_measure=" + value_measure +
                ", sensor_measure=" + sensor_measure +
                '}';
    }

    @Column(name = "value_measure")
    double value_measure;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "sensor_measure")
    private Sensor sensor_measure;

    public int getId_measure() {
        return id_measure;
    }

    public void setId_measure(int id_measure) {
        this.id_measure = id_measure;
    }

    public double getValue_measure() {
        return value_measure;
    }

    public void setValue_measure(double value_measure) {
        this.value_measure = value_measure;
    }

    public Sensor getSensor_measure() {
        return sensor_measure;
    }

    public void setSensor_measure(Sensor sensor_measure) {
        this.sensor_measure = sensor_measure;
    }

    public Measure(int id_measure, double value_measure, Sensor sensor_measure) {
        this.id_measure = id_measure;
        this.value_measure = value_measure;
        this.sensor_measure = sensor_measure;
    }

    public Measure() {
    }
}
