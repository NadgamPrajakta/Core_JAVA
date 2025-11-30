package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_17 {

    public static void main(String[] args) {

        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Amit", 40000));
        workers.add(new Worker("Seema", 60000));
        workers.add(new Worker("Rohit", 30000));

        workers.stream()
            .map(new BonusCalculator())
            .forEach(new WorkerBonusPrinter());
    }
}

class Worker {
    String name;
    int salary;

    Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

class BonusCalculator implements Function<Worker, String> {
    public String apply(Worker w) {
        double bonus = w.salary * 0.10;
        return w.name + " → Bonus: " + bonus;
    }
}

class WorkerBonusPrinter implements java.util.function.Consumer<String> {
    public void accept(String t) {
        System.out.println(t);
    }
}
