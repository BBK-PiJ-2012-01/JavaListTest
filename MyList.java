package ListPackage;

public class MyList {
	private Object[] items;
	private int number_of_items, list_size;
	private static int INITIAL_LENGTH = 10;
	
	MyList() {
		list_size = INITIAL_LENGTH;
		items = new Object[list_size];
		number_of_items = 0;
	}
	
	public void addToEnd(Object obj) {
		number_of_items++;
		if (number_of_items > list_size)
			increaseListSize();
		items[number_of_items] = obj;
		
	public void print() {
		for (int index=0; index<number_of_items; index++) {
			System.out.println(obj.getString());
		}
	}
	
	void increaseListSize() {
		Object[] old_items = items;
		items = new Object[list_size*2];
		
		for (int i=0; i<list_size; i++) {
			items[i] = old_items[i]
		}
	}
}

