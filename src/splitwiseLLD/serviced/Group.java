package splitwiseLLD.serviced;

import splitwiseLLD.ImplementaionClasses.User;
import splitwiseLLD.model.Expense;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    private User getUserByuserId(String userId) {
        User user = null;

        for(User member : members) {
            if(member.userId.equals(userId)) {
                user = member;
            }
        }
        return user;
    }

    public static int nextGroupId = 0;
    public String groupId;
    public String name;
    public List<User> members; //observers
    public Map<String, Expense> groupExpenses; // Group's own expense book
    public Map<String, Map<String, Double>> groupBalances; // memberId -> {otherMemberId -> balance}

    public Group(String name) {
        this.groupId = "group" + (++nextGroupId);
        this.name = name;
        this.members = new ArrayList<>();
        this.groupExpenses = new HashMap<>();
        this.groupBalances = new HashMap<>();
    }



}
