package splitwiseLLD.ImplementaionClasses;

import splitwiseLLD.model.Split;
import splitwiseLLD.strategiesClasses.SplitStrategy;

import java.util.ArrayList;
import java.util.List;

public class EqualSplit implements SplitStrategy {

    @Override
    public List<Split> calculateSplit(double totalAmount, List<String> userIds, List<Double> values) {
        List<Split> splits = new ArrayList<>();
        double amountPerUsers = totalAmount / values.size();
        for(String userId : userIds) {
            splits.add(new Split(userId, amountPerUsers));
        }
        return splits;
    }
}
