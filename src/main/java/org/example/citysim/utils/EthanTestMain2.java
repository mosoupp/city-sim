package org.example.citysim.utils;

import org.example.citysim.utils.OperationalBuilding.FoodBuilding.Farm;

public class EthanTestMain2 {
    public static void main(String[] args) {
        Farm starterFarm = new Farm("This is my new starter farm");
        System.out.println(starterFarm.getFoodProdRate());
        starterFarm.setFoodProdRate(52);
        System.out.println(starterFarm.getFoodProdRate());
        starterFarm.setMaintenanceCost(44);
        System.out.println(starterFarm.getMaintenanceCost());

    }
}
