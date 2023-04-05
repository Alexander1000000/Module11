import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* Task1:
   Метод приймає на вхід список імен.
   Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами,
   що стоять під непарним індексом (1, 3 тощо).
 */

public class Task1 {

    public static String getIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] names = {"Ivan", "Roman", "Anna", "Alex", "Olga", "Denis", "Diana"};
        List<String> namesList = new ArrayList<>(List.of(names));
        String sortIndexedNames = getIndexedNames(namesList);
        System.out.println(sortIndexedNames);
    }
}