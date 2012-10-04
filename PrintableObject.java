package ListPackage;

public class PrintableObject extends Object {
	String str;
	PrintableObject(String new_str) {
		super();
		str = new_str;
	}
	
	public String getString() {
		return str;
	}
}