package Test01;

public class Runner {


    public static void main(String[] args) {


        System.out.println("Task01");

        int[] task01Numbers = {1, 3, 5, 7, 9, 11};
        int[] task01WrongNumbers = {1, 4, 6, 7, 8};
        int[] task01NumbersDescending = {9, 7, 5, 3, 1};
        int[] task01NumbersNegative = {-9, -7, -5, -3};

        System.out.println("--------------------");
        System.out.println("Sprawdzamy tablicę arytmetyczną(Powinno być true)");
        System.out.println(Task01.isArithmetic(task01Numbers));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy tablicę niearytmetyczną(Powinno być false)");
        System.out.println(Task01.isArithmetic(task01WrongNumbers));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy tablicę arytemtyczną malejącą(Powinno być true)");
        System.out.println(Task01.isArithmetic(task01NumbersDescending));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy tablicę arytmetyczną ujemną(Powinno być true)");
        System.out.println(Task01.isArithmetic(task01NumbersNegative));

        System.out.println("--------------------");

        System.out.println("Task02");

        int[] geometricPositive = {2, 6, 18, 54};
        int[] geometricNegative = {-2, 4, -8, 16};
        int[] notGeometric = {2, 4, 9, 20};
        int[] geometricFraction = {81, 27, 9, 3, 1};

        System.out.println("--------------------");
        System.out.println("Sprawdzamy ciąg geometryczny dodatni (powinien dać GEOMETRYCZNY)");
        System.out.println(Task02.getSequenceName(geometricPositive));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy ciąg geometryczny naprzemienny (powinien dać GEOMETRYCZNY)");
        System.out.println(Task02.getSequenceName(geometricNegative));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy ciąg niegeometryczny (powinien dać INNY)");
        System.out.println(Task02.getSequenceName(notGeometric));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy ciąg geometryczny ułamkowy (powinien dać GEOMETRYCZNY)");
        System.out.println(Task02.getSequenceName(geometricFraction));
        System.out.println("--------------------");
        System.out.println("Sprawdzamy ciąg arytmetyczny metodą z Task02 (powinien dać ARYTMETYCZNY)");
        System.out.println(Task02.getSequenceName(task01Numbers));
        System.out.println("--------------------");

        System.out.println("Task03");
        System.out.println("--------------------");
        int[] superPrimes = Task03.superPrimes(1, 100);

        System.out.println("Superpierwsze w zakresie 1–100:");
        for (int n : superPrimes) {
            System.out.print(n + " ");
        }

        System.out.println();
        System.out.println("--------------------");

        System.out.println("Task04");

        Task04 task04 = new Task04();

        task04.readFileAndAnalyze("liczby.txt");


    }
}
