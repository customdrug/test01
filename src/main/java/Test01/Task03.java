package Test01;

import java.util.ArrayList;
import java.util.List;

public class Task03 {


    /// Zadanie 03:
    /// napisz metodę int[] superPrimes(int from, int to) ktora zwroci wszystkie liczby super-pierwsze z zakresu <from, to>
    /// takż liczbą jest np: 11, dlaczego? Bo liczba super pierwsza to taka która sama jest liczbą pierwszą oraz jej suma cyfr
    /// też jest liczbą pierwszą. (a liczba pierwsza to taka ktora ma dokładnie dwa dzielniki, nie wiecej, nie mniej)


    private static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum;
    }


    public static int[] superPrimes(int from, int to) {
        List<Integer> result = new ArrayList<>();

        for (int i = from; i < to; i++) {
            if (isPrime(i) && isPrime(sumOfDigits(i))) {
                result.add(i);
            }
        }
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }


}





