
public class Main {
    public static void main(String[] args) {

        fibonacciSequence(12);
        System.out.println();
        fibonacciRecursive(0, 1, 1, 12);

        

    }

    // fibonacci sequence generated with a loop
    public static void fibonacciSequence(int numTerms) {
        int counter = 1;
        int num1 = 0;
        int num2 = 1;
        int current_value = 1;

        System.out.print(1 + " ");

        while(counter < numTerms) {
            counter++;
            System.out.print(current_value + " ");
            num1 = num2;
            num2 = current_value;
            current_value = num1 + num2;
        }

    }


    // fibonacci sequence generated recursively
    public static void fibonacciRecursive(int num1, int num2, int count, int counter) {
        if(count == 1) {
            System.out.print(1 + " ");
        }
        int currentValue = num1 + num2;
        System.out.print(currentValue + " ");

        num1 = num2;
        num2 = currentValue;

        if(count < counter -1) {
            count++;
            fibonacciRecursive(num1, num2, count, counter);
        }


    }



}