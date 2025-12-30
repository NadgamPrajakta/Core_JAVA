package basics;

class Printer {
    synchronized void print(String document) {
        System.out.println("Printing: " + document);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        System.out.println("Completed: " + document);
    }
}

class PrintJob extends Thread {
    Printer printer;
    String document;

    PrintJob(Printer printer, String document) {
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.print(document);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        new PrintJob(printer, "Resume.pdf").start();
        new PrintJob(printer, "Invoice.pdf").start();
        new PrintJob(printer, "Report.pdf").start();
    }
}

