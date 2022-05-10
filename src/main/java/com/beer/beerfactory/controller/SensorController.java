package com.beer.beerfactory.controller;

import com.beer.beerfactory.entity.Measure;
import com.beer.beerfactory.entity.Sensor;
import com.beer.beerfactory.service.MeasureService;
import com.beer.beerfactory.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sensor")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @Autowired
    private MeasureService measureService;

    @PostMapping("/save")
    public Sensor addSensor(@RequestBody Sensor sensor) {
        sensorService.saveSensor(sensor);
        return sensor;
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        sensorService.deleteSensor(id);
    }


    @PostMapping("/{value}/{id}")
    public void createMeasure(@PathVariable int id, @PathVariable double value) {
        Sensor sensor = sensorService.getSensor(id);
        Measure measure = new Measure();
        measure.setSensor_measure(sensor);
        measure.setValue_measure(value);
        measureService.saveMeasure(measure);
    }

    @GetMapping("/measure")
    public List<Measure> getAllMeasure() {
        List<Measure> measures = measureService.getAllMeasure();
        return measures;
    }
}
