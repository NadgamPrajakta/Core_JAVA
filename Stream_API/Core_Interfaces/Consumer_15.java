package coreInterfaces;

import java.util.function.Consumer;

public class Consumer_15 {

    Consumer<Stud_One> consumer;

    public Consumer_15() {
        Consumer<Stud_One> custom = new GradePrinterConsumer();
        Consumer<Stud_One> lambda = st -> System.out.println("Student: " + st.name);

        consumer = lambda.andThen(custom);
    }

    public static void main(String[] args) {
    	Consumer_15 obj = new Consumer_15();
    	Stud_One s = new Stud_One("Prajkta", 82);
        obj.consumer.accept(s);
    }
}


class Stud_One{
    public String name;
    public int marks;

    public Stud_One(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}


class GradePrinterConsumer implements Consumer<Stud_One> {

    @Override
    public void accept(Stud_One s) {
        if (s.marks >= 90)
            System.out.println("Grade: A");
        else if (s.marks >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}
