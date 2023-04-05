import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
   який "перемішує" елементи зі стрімів first та second,
   зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.
*/

public class Task5 {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T>secondList = second.collect(Collectors.toList());
        Iterator<T> secondIterator = secondList.iterator();

        return first.filter(e -> secondIterator.hasNext()).
                flatMap(e -> Stream.of(e, secondIterator.next()));
    }

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        List<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        Stream<Integer> firstStream = firstList.stream();
        Stream<Integer> secondStream = secondList.stream();

        Stream<Integer> zippedStream = zip(firstStream, secondStream);
        zippedStream.forEach(System.out::println);
    }
}