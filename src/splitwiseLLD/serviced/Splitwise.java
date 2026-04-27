package splitwiseLLD.serviced;

import splitwiseLLD.ImplementaionClasses.User;
import splitwiseLLD.model.Expense;

import java.util.HashMap;
import java.util.Map;

public class Splitwise {
    private Map<String, User> users;
    private Map<String, Group> groups;
    private Map<String, Expense> expenses;

    private static Splitwise instance;

    private Splitwise() {
        users = new HashMap<>();
        groups = new HashMap<>();
        expenses = new HashMap<>();
    }

    public static Splitwise getInstance(){
        if(instance == null){
            instance = new Splitwise();
        }
        return instance;
    }



}
