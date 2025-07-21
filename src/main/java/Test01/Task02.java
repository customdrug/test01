package Test01;

public class Task02 {


    /// Zadanie 02:
    /// napisz metode String getSequenceName(int[] sequence) ktora zwroci:
    /// - GEOMETRYCZNY - jesli podany ciag jest geometryczny
    /// - ARYTMETYCZNY - jesli podany ciag jest arytmetyczny
    /// - INNY - w przypadku gdy zadne z powyzszych


    private static boolean isGeometric(int[] sequence) {
        if (sequence.length < 2) return false;

        if (sequence[0] == 0) return false;
        double ratio = (double) sequence[1] / sequence[0];

        for (int i = 1; i < sequence.length - 1; i++) {
            if (sequence[i] == 0) return false;
            double currentRatio = (double) sequence[i + 1] / sequence[i];
            if (currentRatio != ratio) {
                return false;
            }
        }
        return true;
    }

    public static String getSequenceName(int[] sequence) {
        if (sequence.length < 2) {
            return "INNY";
        }
        if (Task01.isArithmetic(sequence)) {
            return "ARYTMETYCZNY";
        } else if (isGeometric(sequence)) {
            return "GEOMETRYCZNY";
        } else {
            return "INNY";
        }
    }


}
