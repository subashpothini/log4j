package www.logg.ru;

import www.interf.ru.IPrint;

public class Printer implements IPrint {

	String text;
	int count;
	int year;

	// public Printer() {
	// text = "String";
	// }

	public Printer(String text, int count, int year) {
		this.text = text;
		this.count = count;
		this.year =year;
	}

	public void print() {
		System.out.println(text);
		System.out.println(count + " years old");
		System.out.println(year + " year");


	}

}
