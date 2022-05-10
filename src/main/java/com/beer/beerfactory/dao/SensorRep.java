package com.beer.beerfactory.dao;

import com.beer.beerfactory.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SensorRep extends JpaRepository<Sensor, Integer> {
}
