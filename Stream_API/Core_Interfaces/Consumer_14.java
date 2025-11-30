package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_14 {

    Consumer<Employee> consumer;

    public Consumer_14() {
        Consumer<Employee> custom = new SalaryIncrementConsumer();
        Consumer<Employee> lambda = e -> System.out.println("Employee: " + e.name);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_14 obj = new Consumer_14();
        Employee e = new Employee("Prajkta", 30000);
        obj.consumer.accept(e);
    }
}



 class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}


class SalaryIncrementConsumer implements Consumer<Employee> {

    @Override
    public void accept(Employee emp) {
        emp.salary += 2000;
        System.out.println("Salary increased. New Salary: " + emp.salary);
    }
}