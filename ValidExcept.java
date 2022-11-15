import java.util.List;

class ValidExcept {
    public static void valid(String a, String b) throws Exception {

        final List<String> roman = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        final List<String> arabian = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");


        if ((roman.contains(a) && arabian.contains(b)) || (roman.contains(b) && arabian.contains(a))) {
            throw new Exception("используются одновременно разные системы счисления, введите [3 + 4] или [III + IV]");
        }
    }


    public static void validNum(int a, int b) throws Exception {
        if (a < 1 || b < 1 || a > 10 || b > 10) {
            throw new Exception("Одно из введённых чисел больше 10");

        }
    }


    public static void validLength(String[] arr) throws Exception {
        if (arr.length != 3) {
            throw new Exception("формат математической операции не удовлетворяет заданию - два операнда и один оператор [3 + 4]");

        }
    }

    public static void validSign(String sign) throws Exception {
        if (sign.contains("+") || sign.contains("-") || sign.contains("*") || sign.contains("/")) {}
           else throw new Exception("Формат не соответствует арифметическому выражению (+, -, /, *)");

    }
}
