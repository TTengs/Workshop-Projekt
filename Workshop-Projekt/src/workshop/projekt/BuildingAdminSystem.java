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

public class BuildingAdminSystem {
    private static List<Building> Buildings = new ArrayList<>();
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building b = new Building("Bygning1");
        
        Buildings.add(b);
        b.addActuator(10, "A1");
        
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
