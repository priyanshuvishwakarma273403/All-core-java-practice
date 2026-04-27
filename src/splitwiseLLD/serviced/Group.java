package splitwiseLLD.serviced;

import splitwiseLLD.ImplementaionClasses.User;
import splitwiseLLD.model.Expense;
import splitwiseLLD.strategiesClasses.Observer;

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

    public void addMember(User user) {
        members.add(user);
        groupBalances.put(user.userId, new HashMap<>());
        System.out.println(user.name + " added to group " + name);
    }

    public boolean removeMember(String userId){
        if(!canUserLeaveGroup(userId)) {
            System.out.println("\nUser not allowed to leave group without clearing expenses");
            return false;
        }

        members.removeIf(user -> user.userId.equals(userId));

        // Remove from group balances
        groupBalances.remove(userId);

        // Remove this user from other members' balance maps
        for (Map.Entry<String, Map<String, Double>> memberBalance : groupBalances.entrySet()) {
            memberBalance.getValue().remove(userId);
        }
        return true;
    }

    public void notifyMembers(String message) {
        for (Observer observer : members) {
            observer.update(message);
        }
    }

    public boolean isMember(String userId) {
        return groupBalances.containsKey(userId);
    }

    // Update balance within group
    public void updateGroupBalance(String fromUserId, String toUserId, double amount) {
        groupBalances.get(fromUserId).put(toUserId,
                groupBalances.get(fromUserId).getOrDefault(toUserId, 0.0) + amount);
        groupBalances.get(toUserId).put(fromUserId,
                groupBalances.get(toUserId).getOrDefault(fromUserId, 0.0) - amount);

        // Remove if balance becomes zero
        if (Math.abs(groupBalances.get(fromUserId).get(toUserId)) < 0.01) {
            groupBalances.get(fromUserId).remove(toUserId);
        }
        if (Math.abs(groupBalances.get(toUserId).get(fromUserId)) < 0.01) {
            groupBalances.get(toUserId).remove(fromUserId);
        }
    }


}
