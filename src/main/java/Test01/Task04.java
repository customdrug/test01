package Test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task04 {


    /// Zadanie 04:
    /// dany jest plik liczby.txt
    /// w ktorym w kazdym wierszu sa liczby rozdzielone spacja.
    /// np:
    /// 1 2 3 4
    /// 10 20 30 40 50 70
    /// 1 3 2 55 4 3 222 4 6 7
    /// itp
    /// dla kazdej linii nalezy stworzyc raport w postaci:
    /// - okreslic monotonicznosc ciagu
    /// - znalezc mina, maxa w ciagu
    /// - znalezc najpopularniejsza liczbe z ciagu
    /// - stwierdzic czy miedzy min i max znajduja sie wszystkie mozliwe liczby naturalne.


    private String getMonotonicity(int[] numbers) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1])
                isDecreasing = false;
            else if (numbers[i] > numbers[i + 1])
                isIncreasing = false;
        }

        if (isIncreasing) {
            return "Monotoniczny rosnąco!";
        } else if (isDecreasing) {
            return "Monotoniczny malejąco!";
        } else {
            return "Niemonotoniczny!";
        }
    }

    private String getMinMax(int[] numbers) {
        if (numbers.length == 0) return "Brak danych";

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        return "Min: " + min + ", Max: " + max;

    }

    private String getPopularNumber(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        int mostPopular = numbers[0];

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostPopular = entry.getKey();
            }
        }

        return "Najpopularniejsza liczba to: " + mostPopular + " Pojawiła się " + maxCount + " razy.";

    }

    private static boolean isFullRange(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        Set<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
            if (num < min) min = num;
            if (num > max) max = num;
        }
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                return false;
            }
        }
        return true;
    }

    private void getReport(int[] numbers) {
        System.out.println("Monotoniczność: " + getMonotonicity(numbers));
        System.out.println("Min i Max: " + getMinMax(numbers));
        System.out.println(getPopularNumber(numbers));
        if (isFullRange(numbers)) {
            System.out.println("Przedział zawiera pełen zakres liczb naturalnych.");
        } else {
            System.out.println("Przedział nie zawiera pełnego zakresu liczb naturalnych.");
        }

    }

    public void readFileAndAnalyze(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                int[] numbers = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    numbers[i] = Integer.parseInt(parts[i]);
                }

                System.out.println("Analiza linii: " + line);
                getReport(numbers);
                System.out.println("--------------");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku: " + fileName);
        }
    }


}
