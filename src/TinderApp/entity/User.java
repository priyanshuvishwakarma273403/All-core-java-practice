package TinderApp.entity;

import TinderApp.enumClass.SwipeAction;
import TinderApp.repository.NotificationObserver;
import TinderApp.repository.UserNotificationObserver;
import TinderApp.service.NotificationService;

import java.util.HashMap;
import java.util.Map;

public class User {

    private String id;
    private UserProfile profile;
    private Preferences preferences;
    private Map<String, SwipeAction> swipeHistory;
    private NotificationObserver notificationObserver;

    public User(String userId){
        id = userId;
        profile = new UserProfile();
        preferences = new Preferences();
        swipeHistory = new HashMap<>();
        notificationObserver = new UserNotificationObserver(userId);
        NotificationService.getInstance().registerObserver(userId, notificationObserver);
    }

    public String getId() {
        return id;
    }

    public UserProfile getProfile(){
        return profile;
    }

    public Preferences getPreference() {
        return preferences;
    }

    public void swipe(String otherUserId, SwipeAction action) {
        swipeHistory.put(otherUserId, action);
    }

    public boolean hasLiked(String otherUserId) {
        return swipeHistory.containsKey(otherUserId) && swipeHistory.get(otherUserId) == SwipeAction.RIGHT;
    }

    public boolean hasDisliked(String otherUserId) {
        return swipeHistory.containsKey(otherUserId) && swipeHistory.get(otherUserId) == SwipeAction.LEFT;
    }

    public boolean hasInteractedWith(String otherUserId) {
        return swipeHistory.containsKey(otherUserId);
    }

    public void displayProfile() {  // Principle of least knowledge
        profile.display();
    }

}
