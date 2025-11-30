package coreInterfaces;

import java.util.function.Supplier;

public class Supplier_10 {

    Supplier<Studentt> supplier;

    public Supplier_10() {
        Supplier<Studentt> custom = new StudentSupplier();
        Supplier<Studentt> lambda = () -> new Studentt("Lambda Student", 88);

        supplier = () -> custom.get();
    }

    public static void main(String[] args) {
    	Supplier_10 obj = new Supplier_10();
    	Studentt s = obj.supplier.get();
        System.out.println("Name: " + s.name + ", Marks: " + s.marks);
    }
}


class Studentt {
    String name;
    int marks;

    public Studentt(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class StudentSupplier implements Supplier<Studentt> {

    @Override
    public Studentt get() {
        return new Studentt("Prajkta", 95);
    }
}