import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    
    double[] doubleArr;
    double a, b;

    private void start (int operation) {

        try (Scanner in = new Scanner(System.in)) {

            System.out.println("Enter the process type: \n 1. Process with 2 numbers \n 2. Process with more than two numbers.");

            int processType = in.nextInt();

            if (processType > 2 | processType < 0) {
                throw new InputOutOfBoundsException();
            }

            switch (processType) {
                case 1:
                    System.out.print("Enter a: ");
                    a = in.nextDouble();
                    System.out.print("Enter b: ");
                    b = in.nextDouble();
                    break;

                case 2:
                    System.out.println("Enter the numbers as space separated.");
                    in.nextLine();
                    String inputString = in.nextLine();
                    
                    InputManager im = new InputManager();
                    doubleArr = im.stringToDoubleArray(inputString);
                    break;
            
                default:
                    break;
            }
            
            switch (operation) {
                case 1:
                    Addition add = new Addition();
                    if (processType == 1) {
                        System.out.println(add.calculate(a,b));
                    }
                    if (processType == 2) {
                        System.out.println(add.calculate(doubleArr));
                    }
                    break;

                case 2:
                    Subtraction s = new Subtraction();
                    if (processType == 1) {
                        System.out.println(s.calculate(a,b));
                    }
                    if (processType == 2) {
                        System.out.println(s.calculate(doubleArr));
                    }
                    break;

                case 3:
                    Multiplication m = new Multiplication();
                    if (processType == 1) {
                        System.out.println(m.calculate(a,b));
                    }
                    if (processType == 2) {
                        System.out.println(m.calculate(doubleArr));
                    }
                    break;

                case 4:
                    Division d = new Division();
                    if (processType == 1) {
                        System.out.println(d.calculate(a,b));
                    }
                    if (processType == 2) {
                        System.out.println(d.calculate(doubleArr));
                    }
                    break;
            
                default:
                    break;
            }
        } catch (InputOutOfBoundsException e) {
            System.out.println("Enter 1 or 2");
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers only");
        }
    }


    public static void main(String[] args) {

        System.out.println("Select an Operation: \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division");

        try (Scanner in = new Scanner(System.in)) {

            int operation = in.nextInt();
            if (operation < 1 | operation > 4) {
                throw new InputOutOfBoundsException();
            }

            Calculator c = new Calculator();
            c.start(operation);

        } catch (InputMismatchException | InputOutOfBoundsException e) {
            System.out.println("Enter 1 or 2 or 3 or 4 based on operation.");
        } catch (NumberFormatException e) {
            System.out.println("Enter numbers only");
        }
    }
}




