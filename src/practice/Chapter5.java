package practice;

import static java.time.LocalDate.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(parse("2021-10-21"), "牛乳を買う"));
        tasks.add(new Task(parse("2021-09-15"), "○○社面談"));
        tasks.add(new Task(parse("2021-12-04"), "手帳を買う"));
        tasks.add(new Task(parse("2021-08-10"), "散髪に行く"));
        tasks.add(new Task(parse("2021-11-09"), "スクールの課題を解く"));

        tasks.sort(Comparator.comparing(Task::getLocalDate));

        tasks.forEach(System.out::println);
    }
}
