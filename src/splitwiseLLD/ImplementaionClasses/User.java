package splitwiseLLD.ImplementaionClasses;

import splitwiseLLD.strategiesClasses.Observer;

import java.util.HashMap;
import java.util.Map;

public class User implements Observer {

    public static int nextUserId = 0;
    public String userId;
    public String name;
    public String email;
    public Map<String, Double> balances; // userId -> amount (positive = they owe you, negative = you owe them)

    public User(String name, String email) {
        this.userId = "user" + (++nextUserId);
        this.name = name;
        this.email = email;
        this.balances = new HashMap<>();
    }

    @Override
    public void update(String message) {
        System.out.println("[NOTIFICATION to " + name + "]: " + message);
    }



}
