package TinderApp.service;

import TinderApp.entity.ChatRoom;
import TinderApp.entity.User;
import TinderApp.enumClass.MatcherType;
import TinderApp.factory.MatcherFactory;
import TinderApp.repository.Matcher;

import java.util.ArrayList;
import java.util.List;

public class DatingApp{

    private List<User> users;
    private List<ChatRoom> chatRooms;
    private Matcher matcher;

    private static DatingApp instance;

    private DatingApp(){
        users = new ArrayList<>();
        chatRooms = new ArrayList<>();
        matcher = MatcherFactory.createMatcher(MatcherType.LOCATION_BASED);
    }

    public static DatingApp getInstance(){
        if(instance == null){
            instance = new DatingApp();
        }
        return instance;
    }

    public void setMatcher(MatcherType type){
        matcher = MatcherFactory.createMatcher(type);
    }

    public User createUser(String userId){
        User user = new User(userId);
        users.add(user);
        return user;
    }

    public User getUserById(String userId){
        for(User user : users){
            if(user.getId().equals(userId)){
                return user;
            }
        }
        return null;
    }


    public List<User> findNearbyUsers(String userId, double maxDistance){
        User user = getUserById(userId);
        if(user == null){
            return new ArrayList<>();
        }

        List<User> nearbyUsers = LocationService.getInstance().findNearbyUsers(
                user.getProfile().getLocation(), maxDistance, users
        );


        nearbyUsers.remove(user);

        List<User> filteredUsers = new ArrayList<>();

        for(User otherUser : nearbyUsers){
            if(!user.hasInteractedWith(otherUser.getId())){
                    double score = matcher.calculateMatchScore(user, otherUser);

                    if(score > 0){
                        filteredUsers.add(otherUser);
                }
            }
        }
        return filteredUsers;
    }

}
