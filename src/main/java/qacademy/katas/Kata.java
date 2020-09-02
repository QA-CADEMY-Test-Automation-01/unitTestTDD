package qacademy.katas;

public class Kata {
    public static String createPhoneNumber1(int[] numbers) {
        String newNum = "";
        for (int i : numbers) {
            newNum = newNum.concat(String.valueOf(i));
        }
        return String.format("(%s) %s-%s", newNum.substring(0, 3), newNum.substring(3, 6), newNum.substring(6));
    }

    public static String createPhoneNumber2(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray()); // Second solution
    }

    public static String maxMinString(String numbers) {
        int mayor;
        int menor;
        String[] arreglo = (numbers.split(" "));
        mayor = Integer.parseInt(arreglo[0]);
        menor = mayor;
        for (String numberN : arreglo) {

            if (numberN.isEmpty()) {
                continue;
            }

            int num1 = Integer.parseInt(numberN);
            if (mayor < num1) mayor = num1;
            if (menor > num1) menor = num1;
        }
        return "".concat(String.valueOf(mayor)).concat(" ").concat(String.valueOf(menor));
    }

    public static String camelCase(String word) {
        if (word.isEmpty()) {
            return word;
        }
        if (word.length() == 1 && !word.isBlank()) {
            return word.toUpperCase();
        }
        StringBuilder resultCamelCase = new StringBuilder();
        for (String s : word.strip().split(" ")) {
            if (s.isEmpty()) {
                continue;
            }
            resultCamelCase.append(s.substring(0, 1).toUpperCase().concat(s.substring(1)));
        }
        return resultCamelCase.toString();
    }

    public static int multiplos3y5(int numero) {
        int sum = 0;
        for (int i = 0; i < numero; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    public static String getMiddle(String a) {
        int lengthA = a.length();
        int half = lengthA / 2;
        return lengthA % 2 == 0 ? a.substring(half - 1, half + 1) : a.substring(half, half + 1);
    }
}
