public class InputManager {

    private String[] numbersArr;
    private double[] doubleArr;

    protected double[] stringToDoubleArray (String inputString) {

        numbersArr = inputString.split(" ");
        doubleArr = new double[numbersArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            doubleArr[i] = Double.parseDouble(numbersArr[i]);
        }

        return doubleArr;
    }
}
