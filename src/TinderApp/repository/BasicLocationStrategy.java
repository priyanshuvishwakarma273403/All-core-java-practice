package TinderApp.repository;

import TinderApp.entity.Location;
import TinderApp.entity.User;

import java.util.ArrayList;
import java.util.List;

public class BasicLocationStrategy implements LocationStrategy {

    public List<User> findNearbyUsers(Location location, double maxDistance, List<User> allUsers) {
        List<User> nearbyUsers = new ArrayList<>();
        for (User user : allUsers) {
            double distance = location.distanceInKm(user.getProfile().getLocation());
            if (distance <= maxDistance) {
                nearbyUsers.add(user);
            }
        }
        return nearbyUsers;
    }
}
