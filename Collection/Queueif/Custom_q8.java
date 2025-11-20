package queueif;

import java.util.ArrayDeque;
import java.util.Queue;

public class Custom_q8 {

	public static void main(String[] args) {
		
		Queue<PrintJob> printQueue = new ArrayDeque<PrintJob>();
		
		printQueue.offer(new PrintJob(1, "Report.pdf"));
		printQueue.offer(new PrintJob(2, "Resume.docx"));
		printQueue.offer(new PrintJob(3, "Invoice.xlsx"));
		
		while(!printQueue.isEmpty()) {
			
			System.out.println("Printing: " + printQueue.poll());
		}

	}

}


class PrintJob {
	
	int id;
	String filename;
	
	public PrintJob(int id, String name) {
		
		this.id = id;
		this.filename = filename;
	}
	
	public String toString() {
		
		return "PrintJob[id=" + id + ", file=" + filename + "]";
	}
}
