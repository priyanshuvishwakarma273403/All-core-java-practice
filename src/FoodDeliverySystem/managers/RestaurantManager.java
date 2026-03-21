package FoodDeliverySystem.managers;


import FoodDeliverySystem.modals.Restaurant;

import java.util.ArrayList;
import java.util.List;

//Singleton
public class RestaurantManager {
    private List<Restaurant> restaurants = new ArrayList<>();
    private static RestaurantManager instance = null;

    private RestaurantManager(){
        //private constructor
    }

    public static RestaurantManager getInstance(){
        if(instance == null){
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchByLocation(String location){
       List<Restaurant> results = new ArrayList<>();
       location = location.toLowerCase();
       for(Restaurant r : restaurants){
           String rl = r.getLocation().toLowerCase();
           if(rl.equals(location)){
               results.add(r);
           }
       }
       return results;
    }
}
