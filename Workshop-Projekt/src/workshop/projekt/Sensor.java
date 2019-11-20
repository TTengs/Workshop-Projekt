package workshop.projekt;

public class Sensor {
   private int value;
   private String name;
   private boolean sensorType; //If true the sensor is a CO2 sensor, and if false it is at temperature sensor.

    public Sensor(int value, String name, boolean sensorType) {
        this.value = value;
        this.name = name;
        this.sensorType = sensorType;
    }

    public int getValue() {
        return this.value;
    }
    
    public String getName() {
        return this.name;
    }

    public String GetSensorType() {
        if (sensorType == true)
        {
            return "CO2Sensor";
        }
        else{
            return "TemperaturSensor";
        }
    }
    
    @Override
    public String toString() {
        return "Sensor{" + "value=" + getValue() + ", name=" + getName() + ", sensorType=" + GetSensorType() + '}';
    }
   
    
   
   
   
}
