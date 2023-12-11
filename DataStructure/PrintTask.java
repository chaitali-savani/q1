package DataStructure;

import java.util.Scanner;

public class PrintTask {
	
	private static class Que{
		static private String  queu[];
		static private int front,rear,capacity;
		
		Que(int c){
			front = 0 ;
			rear = 0 ;
			capacity = c;
			queu = new String[capacity];
		}
		public static boolean queIsFull() {
			if (rear == capacity-1) {
				System.out.println("Printer Queue is full");
				return true;
			}else {
				return false;
			}
		}
		
		public static boolean isEmpty() {
			if (front == rear) {
				System.out.println("Printer Queue is empty");
				return true;
			}else {
				return false;
			}
		}
		public static void enqueue(String task) {
			if (!queIsFull()) {
				queu[rear++] = task;
			}
		}
		public static String dequeue() {
			if (!isEmpty()) {
				return (queu[front++]);
			}else {
				return "";
			}
		}
		public String peek() {
			if (!isEmpty()) {
				return (queu[front]);			
			}else {
				return null;
			}	
		}
		
		public static void display() {
			
			for(int i = front ; i< rear; i++) {
				System.out.print(queu[i]+ "-->");
				
			}
			System.out.println();
		}
			
		public static void clear() {
			for(int i = front; i <= rear ; i++) {
				queu[i] = null;
			}
			front =0;
			rear =0;
		}                                                                                                      
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String file  = "Form";
		System.out.println("Welcome to the Printer Systerm");
		int c ;
		
		System.out.println("Enter the number of maximum Printing Tasks :");
		c = Integer.parseInt(scanner.nextLine());
		while (c < 0) {
			System.out.println("please Enter a valid number of tasks");
			c= Integer.parseInt(scanner.nextLine());
		}
		Que q = new Que(c);
		q.enqueue(file);
		q.enqueue("File");
		q.enqueue("photo");
		q.enqueue("image");
		q.enqueue("file2");
		q.display();
		
		System.out.println("After dequeue()");
		file = q.dequeue();
		q.display();
		System.out.println("Peek() \n"+q.peek());
		
		System.out.println("clear()");
		q.clear();
		q.display();
		
		
	}

}
