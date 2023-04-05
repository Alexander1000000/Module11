import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/* Task2:
   Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
   Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
*/

public class Task2 {

    public static List<String> sortUpperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String[] names = {"Ivan", "Roman", "Anna", "Alex", "Olga", "Denis", "Diana"};
        List<String> nameList = new ArrayList<>(List.of(names));
        List<String> sortedUpperCaseNames = sortUpperCase(nameList);
        System.out.println(sortedUpperCaseNames);
    }
}