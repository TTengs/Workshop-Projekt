/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.projekt;

import java.util.ArrayList;

/**
 *
 * @author theistengs
 */
public class BuildingAdminSystem {
    
    private static ArrayList<Building> buildings;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building b = new Building();
        
        buildings.add(b);
        
        
        getBuildings();
        
    }   
    
    public static void getBuildings(){
        for (Building b : buildings){
            System.out.println(b);
        }
    }
    
    public void removeBuilding(String name){
        
    }
}
