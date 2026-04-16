package TinderApp.service;

import TinderApp.entity.Location;
import TinderApp.entity.User;
import TinderApp.repository.BasicLocationStrategy;
import TinderApp.repository.LocationStrategy;

import java.util.List;

public class LocationService {
    private LocationStrategy strategy;
    private static LocationService instance;

    private LocationService() {
        strategy = new BasicLocationStrategy();
    }

    public static LocationService getInstance() {
        if (instance == null) {
            instance = new LocationService();
        }
        return instance;
    }

    public void setStrategy(LocationStrategy newStrategy) {
        strategy = newStrategy;
    }

    public List<User> findNearbyUsers(Location location, double maxDistance, List<User> allUsers) {
        return strategy.findNearbyUsers(location, maxDistance, allUsers);
    }


}
