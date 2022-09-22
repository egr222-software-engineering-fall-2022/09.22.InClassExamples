public class DigitSum_B {
    public static void main(String[] args) {
        int number = 29107;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));     // should return 19 (2+9+1+0+7)
        System.out.println("Min: " + digitMin(number));     // should return 0
        number = -456;
        System.out.println("Number: " + number);
        System.out.println("Sum: " + digitSum(number));     // should return 15 (4+5+6)
        System.out.println("Min: " + digitMin(number));     // should return 4
    }

    public static int digitSum(int number) {
        if (number == 0)  return 0;

        if (number < 0)
            number *= -1; // convert to a positive number

        int sum = number % 10;
        number /= 10;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }

    public static int digitMin(int number) {
        if (number == 0)  return 0;

        if (number < 0)
            number *= -1; // convert to a positive number

        int min = number % 10;
        number /= 10;

        while (number > 0) {
            int digit = number % 10;
            if (digit < min) min = digit;
            number /= 10;
        }
        
        return min;
    }
}