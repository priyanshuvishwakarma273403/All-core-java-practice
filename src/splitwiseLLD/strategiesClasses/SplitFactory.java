package splitwiseLLD.strategiesClasses;

import splitwiseLLD.ImplementaionClasses.EqualSplit;
import splitwiseLLD.ImplementaionClasses.ExactSplit;
import splitwiseLLD.ImplementaionClasses.PercentageSplit;
import splitwiseLLD.enumClasses.SplitType;

public class SplitFactory {
    public static SplitStrategy getSplitStrategy(SplitType type) {
        switch (type) {
            case EQUAL -> {
                return new EqualSplit();
            }
            case EXACT -> {
                return  new ExactSplit();
            }
            case PERCENTAGE ->  {
                return new PercentageSplit();
            }
            default -> {
                return new EqualSplit();
            }
        }
    }
}
