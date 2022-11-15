public class Main {
    public static String calc(String input) throws Exception {
        String[] numRom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        String[] arr = input.split(" ");
        int a;
        int b;
        int dozens;
        int units;
        int arabAns = 0;
        String sign = arr[1];
        ValidExcept.validSign(sign);
        ValidExcept.valid(arr[0], arr[2]);
        boolean a1 = false;
        for (String s : numRom)
            if (arr[0].equals(s)) {
                a1 = true;
                break;
            } else if (s.equals(arr[2])) {
                a1 = true;
                break;
            }


        if (a1) {
            a = Convert.romanToInt(arr[0]);
            b = Convert.romanToInt(arr[2]);

        } else {

            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[2]);
        }
        ValidExcept.validLength(arr);
        ValidExcept.validNum(a, b);

        switch (sign) {
            case "+" -> arabAns = a + b;
            case "-" -> arabAns = a - b;
            case "*" -> arabAns = a * b;
            case "/" -> arabAns = a / b;
        }

        if (a1) {
            dozens = arabAns / 10;
            units = arabAns % 10;

            return (Convert.romDozens(dozens) + Convert.romUnits(units));
        } else {
            return Integer.toString(arabAns);
        }


    }

}

