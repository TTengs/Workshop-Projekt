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
    
    public List<Sensor> getSensor(){
        return sensor;
    }
    
    public List<Aktuator> getActuator(){
        return actuator;
    }
    
    public void addSensor(List<Sensor> sensor){
        this.sensor = sensor;
    }
    
    public void addActuator(List<Sensor> actuato){
        this.actuator = actuator;
    }
    
    public List<Sensor> removeSensor(List<Sensor> sensor){
        this.sensor = sensor; // trække fra!
        return this.sensor;
    }
    
    public List<Aktuator> removeActuator(List<Aktuator> actuator){
        this.actuator = actuator; // trække fra!
        return this.actuator;
    }
    
}
