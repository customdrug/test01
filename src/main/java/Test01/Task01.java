package Test01;

public class Task01 {

    /// Zadanie 01:
    /// napisz metode boolean isArithmetic(int[] sequence), ktora zwroci informacje o tym czy dany
    /// jako argument ciag jest arytmetyczny czy nie.

    public static boolean isArithmetic(int[] sequence) {
        if (sequence.length < 2)
            return false;
        int diff = sequence[1] - sequence[0];
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i + 1] - sequence[i] != diff) {
                return false;
            }
        }
        return true;
    }

}
