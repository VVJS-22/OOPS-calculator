public class Multiplication extends OperationClass {
    public double calculate(double ...numbers) {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i ++) {
            result*=numbers[i];
        }

        return result;
    }
}
