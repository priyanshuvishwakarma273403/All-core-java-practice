package TinderApp.repository;

import TinderApp.entity.Location;
import TinderApp.entity.User;

import java.util.List;

public interface LocationStrategy {
    List<User> findNearbyUsers(Location location, double maxDistance, List<User> allUsers);
}
