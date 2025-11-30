package coreInterfaces;

import java.util.function.Function;

public class Function_12 {

    Function<Employeee, Double> func;

    public Function_12() {
        Function<Employeee, Double> custom = new SalaryFunction();
        func = custom;
    }

    public static void main(String[] args) {
    	Function_12 obj = new Function_12();
    	Employeee e = new Employeee("Prajkta", 45000);
        System.out.println(obj.func.apply(e));
    }
}


class Employeee {
    public String name;
    public double salary;

    Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class SalaryFunction implements Function<Employeee, Double> {
    @Override
    public Double apply(Employeee e) {
        return e.salary + 5000;
    }
}