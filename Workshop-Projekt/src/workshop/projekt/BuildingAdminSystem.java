package workshop.projekt;

import java.util.ArrayList;
import java.util.List;


public class BuildingAdminSystem {
    
    private static List<Building> Buildings = new ArrayList<>();
       
    
    public static void main(String[] args) {
        Building b = new Building("Bygning1");
        
        Buildings.add(b);
        b.addActuator(10, "A1");
        b.addSensor(65, "CO2_Sensor1", true);
        
        getBuildings();
        
    }   
    
    public static void getBuildings(){
        for (Building b : Buildings){
            System.out.println(b);
        }
    }
    
    public void removeBuilding(String name){
        
    }
}
