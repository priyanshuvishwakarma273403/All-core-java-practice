package GenericsPractice;

enum Operation{
    ADD,SUBTRACT,MULTIPLY,DIVIDE;

    public <T extends Number> double add(T num1, T num2){
        switch (this) {
            case ADD:
                return num1.doubleValue() + num2.doubleValue();
            case SUBTRACT:
                return num1.doubleValue() - num2.doubleValue();
            case MULTIPLY:
                return num1.doubleValue() * num2.doubleValue();
            case DIVIDE:
                return num1.doubleValue() / num2.doubleValue();
            default:
                throw new AssertionError("Unknown operation: " + this);
        }
    }
}

public class EnumExample {
    public static void main(String[] args) {
        double result1 = Operation.ADD.add(10, 20);
        double result2 = Operation.SUBTRACT.add(10, 20);
        System.out.println(result1);
        System.out.println(result2);

    }
}
