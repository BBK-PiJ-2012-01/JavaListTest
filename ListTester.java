package ListPackage;

public class ListTester {
	public static void main(String[] args) {
		MyList l = new MyList();
		l.addToEnd(new PrintableObject("One"));
		l.addToEnd(new PrintableObject("Two"));
		l.addToEnd(new PrintableObject("Three"));
		l.print();
	}
}