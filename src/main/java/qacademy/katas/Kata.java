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
}
