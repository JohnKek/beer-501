package com.beer.beerfactory.service;

import com.beer.beerfactory.dao.SensorRep;
import com.beer.beerfactory.entity.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class SensorServiceImp implements SensorService {
    @Autowired
    private SensorRep sensorRep;

    @Override
    public void saveSensor(Sensor sensor) {
        sensorRep.save(sensor);
    }

    @Override
    public void deleteSensor(int id) {
        sensorRep.deleteById(id);
    }

    @Override
    public Sensor getSensor(int id) {
        Optional<Sensor> optional = sensorRep.findById(id);
        Sensor sensor = null;
        if (optional.isPresent()) {
            sensor = optional.get();

        } else {
            throw new EntityNotFoundException("Объект не найден");
        }
        return sensor;
    }
}
