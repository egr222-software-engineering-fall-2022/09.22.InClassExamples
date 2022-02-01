public class DigitSum_B {
    public static void main(String[] args) {
        int number = 29107;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));
        System.out.println("Min: " + digitMin(number));
        number = -456;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));
        System.out.println("Min: " + digitMin(number));
    }

    public static int digitSum(int number) {
        if (number < 0) number *= -1;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;    // extract the last digit
            sum += digit;               // add the last digit to sum
            number /= 10;
        }

        return sum;
    }

    public static int digitMin(int number) {
        if (number < 0) number *= -1;
        int min = 9;

        while (number > 0) {
            int digit = number % 10;        // extract the last digit
            if (min > digit) min = digit;   // add the last digit to sum
            number /= 10;
        }

        return min;
    }
}