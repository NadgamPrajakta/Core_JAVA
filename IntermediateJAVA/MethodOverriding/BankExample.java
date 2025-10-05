package MethodOverriding;

//Parent class
class Bank {
 public double getRateOfInterest() {
     return 5.0;  // Default interest rate
 }
}

//Child class 1
class SBI extends Bank {
 @Override
 public double getRateOfInterest() {
     return 6.5;  // SBI rate
 }
}

//Child class 2
class HDFC extends Bank {
 @Override
 public double getRateOfInterest() {
     return 7.2;  // HDFC rate
 }
}

//Child class 3
class ICICI extends Bank {
 @Override
 public double getRateOfInterest() {
     return 6.8;  // ICICI rate
 }
}

//Main class
public class BankExample {
 public static void main(String[] args) {
     Bank b1 = new SBI();
     Bank b2 = new HDFC();
     Bank b3 = new ICICI();

     System.out.println("SBI Interest Rate: " + b1.getRateOfInterest() + "%");
     System.out.println("HDFC Interest Rate: " + b2.getRateOfInterest() + "%");
     System.out.println("ICICI Interest Rate: " + b3.getRateOfInterest() + "%");
 }
}

