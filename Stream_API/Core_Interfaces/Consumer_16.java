package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_16 {

    Consumer<Employee> consumer;

    public Consumer_16() {
        Consumer<Employee> custom = new BonusConsumer();
        Consumer<Employee> lambda = e -> System.out.println("Processing Employee: " + e.name);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_16 obj = new Consumer_16();
        Employee e = new Employee("John", 45000);
        obj.consumer.accept(e);

        System.out.println("Final salary: " + e.salary);
    }
}


class BonusConsumer implements Consumer<Employee> {

    @Override
    public void accept(Employee emp) {
        System.out.println("Bonus added: ₹5000");
        emp.salary += 5000;
    }
}
