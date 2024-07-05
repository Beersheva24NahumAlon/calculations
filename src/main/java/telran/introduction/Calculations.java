package telran.introduction;
public class Calculations {
    public static int sum(int op1, int op2) {
        return op1 + op2;    
    }
    public static int multiply(int op1, int op2) {
        return op1 * op2;
    }
    public static int devide(int op1, int op2) {
        if (op2 == 0) {
            return 0;
        }
        return op1 / op2;
    }
    public static int subtract(int op1, int op2) {
        return op1 - op2;
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static int maxDigit(int number) {
        int max = 0;
        if (number < 0) {
            number *= -1;
        }
        while (number > 0) {
            if (number % 10 > max) {
                max = number % 10; 
            }
            number /= 10;
        }
        return max;
    }
    public static boolean isDevidedOn(int number, int dividor) {
        if (dividor == 0) {
            return false;
        }
        if (number % dividor != 0) {
            return false;
        }
        return true;
    }
}