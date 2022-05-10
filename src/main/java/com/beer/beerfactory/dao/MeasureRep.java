package com.beer.beerfactory.dao;

import com.beer.beerfactory.entity.Beer;
import com.beer.beerfactory.entity.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureRep extends JpaRepository<Measure, Integer> {
}
