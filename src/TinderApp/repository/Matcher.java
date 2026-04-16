package TinderApp.repository;

import TinderApp.entity.User;

public interface Matcher {
    double calculateMatchScore(User user1, User user2);
}
