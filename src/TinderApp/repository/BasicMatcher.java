package TinderApp.repository;


import TinderApp.entity.User;

public class BasicMatcher implements Matcher {

    @Override
    public double calculateMatchScore(User user1, User user2) {
        boolean user1LikesUser2Gender = user1.getPreference().isInterestedInGender(user2.getProfile().getGender());
        boolean user2LikesUser1Gender = user2.getPreference().isInterestedInGender(user1.getProfile().getGender());

        if(!user1LikesUser2Gender || !user2LikesUser1Gender) {
            return 0.0;
        }

        // Check distance preference
        double distance = user1.getProfile().getLocation().distanceInKm(user2.getProfile().getLocation());
        boolean user1LikesUser2Distance = user1.getPreference().isDistanceAcceptable(distance);
        boolean user2LikesUser1Distance = user2.getPreference().isDistanceAcceptable(distance);

        if (!user1LikesUser2Distance || !user2LikesUser1Distance) {
            return 0.0;
        }
        return 0.5;
    }
}
