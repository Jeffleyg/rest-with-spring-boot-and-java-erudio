package br.com.compasso;

import br.com.compasso.exeptions.UnsupportedMathOperationException;

public class MathUtil {

	public static void validateNumericInputs(String... numbers) {
        for (String number : numbers) {
            if (!isNumeric(number)) {
                throw new UnsupportedMathOperationException("Please provide valid numeric inputs");
            }
        }
    }

    public static void validateNumericInput(String number) {
        if (!isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please provide a valid numeric input");
        }
    }

    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        if (isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

    public static Double calculateSquareRoot(String number) {
        return Math.sqrt(convertToDouble(number));
    }
}
