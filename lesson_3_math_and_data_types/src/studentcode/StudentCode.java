// © Sebastian Lopez-Cot 2025. Licensed CC BY-NC-SA 4.0.

package studentcode;

public class StudentCode {
    
    public static int abs(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
    
    public static int sqrt(int num) {
        if (num < 0)
        {
            return -1;
        }
        else
        {
            int guess = 0;
            while (guess * guess < num) 
                {guess++;}
            if (guess * guess == num)
                return guess;
            else
                return -1;
        }
    }

    public static int pow(int base, int power) {
        int c = 1;
        while (c < power) {
            c++;
            base = base * base; 
        }
        if(c == power)
        {
            return base;
        }
        else
        {
            return -1;
        }
    }

    public static int sumTo(int num) {
        return -79;
    }

    public static int greatestCommonFactor(int num1, int num2) {
        int factor = 1;
        int gcf = 1;
        while (factor <= num1 && factor <= num2) {
            if (num1 % factor == 0 && num2 % factor == 0) {
                gcf = factor;
            }
            factor++;
        }
        return gcf;
    }
    public static int isPrime(int num) {
        return -79;
    }

    public static int hypotenuse(int a, int b) {
        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = aSquared + bSquared;
        int c = sqrt(cSquared);
        return c;
    }

    public static int binary8Bits(int numDecimal) {
        return -79;
    }
}
