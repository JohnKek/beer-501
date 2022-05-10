package com.beer.beerfactory.service;

import com.beer.beerfactory.entity.Measure;
import com.beer.beerfactory.entity.Sensor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SensorService {

    public void saveSensor(Sensor sensor);

    public void deleteSensor(int id);

    public Sensor getSensor(int id);
}
