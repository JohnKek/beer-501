package com.beer.beerfactory.service;

import com.beer.beerfactory.entity.Beer;
import com.beer.beerfactory.entity.Measure;

import java.util.List;

public interface MeasureService {
    public List<Measure> getAllMeasure();

    public void saveMeasure(Measure measure);

}
