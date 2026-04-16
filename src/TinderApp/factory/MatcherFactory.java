package TinderApp.factory;

import TinderApp.enumClass.MatcherType;
import TinderApp.repository.BasicMatcher;
import TinderApp.repository.InterestsBasedMatcher;
import TinderApp.repository.LocationBasedMatcher;
import TinderApp.repository.Matcher;

public class MatcherFactory {
    public static Matcher createMatcher(MatcherType type) {
        switch (type) {
            case BASIC:
                return new BasicMatcher();
            case INTERESTS_BASED:
                return new InterestsBasedMatcher();
            case LOCATION_BASED:
                return new LocationBasedMatcher();
            default:
                return new BasicMatcher();
        }
    }
}
