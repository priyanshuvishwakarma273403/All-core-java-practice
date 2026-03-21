//package GenericsPractice;
//
//public interface Calculator<T>{
//    T calculate(T a, T b);
//}
//
//enum ArithmeticOperation implements Calculator<Integer>{
//    ADD{
//        @Override
//        public Integer calculate(Integer a, Integer b) {
//            return a + b;
//        }
//    },
//    SUBTRACT{
//        @Override
//        public Integer calculate(Integer a, Integer b) {
//            return a - b;
//        }
//    },
//    MULTIPLY{
//        @Override
//        public Integer calculate(Integer a, Integer b) {
//            return a * b;
//        }
//    },
//    DIVIDE{
//        @Override
//        public Integer calculate(Integer a, Integer b) {
//            return a / b;
//        }
//    }
//}
//
//public class EnumExample2 {
//    public static void main(String[] args) {
//
//        int result1 = ArithmeticOperation.ADD.calculate(10,5);
//        int result2 = ArithmeticOperation.SUBTRACT.calculate(10,5);
//        int result3 = ArithmeticOperation.MULTIPLY.calculate(10,5);
//        int result4 = ArithmeticOperation.DIVIDE.calculate(10,5);
//        System.out.println(result1);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);
//
//
//    }
//}
