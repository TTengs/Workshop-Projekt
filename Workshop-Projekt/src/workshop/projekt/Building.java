/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.projekt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author theistengs
 */
public class Building {
    
    private List<Sensor> sensor = new ArrayList<>();
    private List<Aktuator> actuator = new ArrayList<>();
    
    private String name;

    public Building(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public List<Sensor> getSensor(){
        return sensor;
    }
    
    public List<Aktuator> getActuator(){
        return actuator;
    }
    
    public void addSensor(int value, String name, boolean sensorType){
       Sensor b = new Sensor(value, name, sensorType);
       sensor.add(b);
    }
    
    public void addActuator(double num, String name){
       Aktuator b = new Aktuator(num, name);
       actuator.add(b);
    }
    
    public List<Sensor> removeSensor(List<Sensor> sensor){
        this.sensor = sensor; // trække fra!
        return this.sensor;
    }
    
    public List<Aktuator> removeActuator(List<Aktuator> actuator){
        this.actuator = actuator; // trække fra!
        return this.actuator;
    }

    @Override
    public String toString() {
        return "Building { " + "sensor = " + sensor + ", actuator = " + actuator + ", name = " + name + '}';
    }
    
    
}