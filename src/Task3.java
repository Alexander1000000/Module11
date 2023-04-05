import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Task3:
   Є масив: ["1, 2, 0", "4, 5"].
   Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому,
   наприклад: "0, 1, 2, 4, 5"
*/

public class Task3 {
    private static final List<String> STRING_NUMBERS = Arrays.asList("1, 2, 0", "4, 5");

    public static void main(String[] args) {

        String result = STRING_NUMBERS.stream()
                .map(str -> str.split(", "))
                .flatMap(Arrays::stream)
                .map(Integer::valueOf)
                .sorted()
                .map(num ->String.valueOf(num))
                .collect(Collectors.joining(", "));

        System.out.println("Отсортированные числа: " + result);
    }
}