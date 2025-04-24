package myspring.di.xml;

public class ConsolePrinter implements Printer {
	
	public ConsolePrinter() {
		System.out.println(this.getClass().getName() +  " 기본 생성자");
	}
	public void print(String message) {
		System.out.println(message);
	}
}
