package splitwiseLLD.serviced;

import java.util.HashMap;
import java.util.Map;

public class DebtSimplifier {
    public static Map<String, Map<String, Double>> simlifyDebts(
            Map<String, Map<String, Double>> groupBalances){
        Map<String, Double> netAmounts = new HashMap<>();
        for(Map.Entry<String, Map<String, Double>> userBalance : groupBalances.entrySet()){
            netAmounts.put(userBalance.getKey(),0.0);
        }

        for(Map.Entry<String, Map<String, Double>> userBalance : groupBalances.entrySet()){
            String creditorId = userBalance.getKey();
            for(Map.Entry<String, Double> balance : userBalance.getValue().entrySet()) {
                String debtorId = balance.getKey();
                Double amount = balance.getValue();

                if (amount > 0) {
                    netAmounts.put(creditorId, netAmounts.get(creditorId) + amount);  // creditor receives
                    netAmounts.put(debtorId, netAmounts.get(debtorId) - amount);
                }
            }
        }

    }

}
