package ds.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		System.out.println("emptyList:" + list);
		list.addFirst("Mauricio");
		System.out.println("addFirst:" + list);
		list.addFirst("Paulo");
		System.out.println("addFirst:" + list);
		list.addFirst("Guilherme");
		System.out.println("addFirst:" + list);

		list.addEnd("Marcelo");
		System.out.println("addEnd:" + list);

		list.addMiddle(2, "Gabriel");
		System.out.println("addMiddle(2, 'Gabriel'):" + list);

		Object x = list.get(2);
		System.out.println("get(2):" + x);

		System.out.println("sizeList:" + list.size());

		list.removeFirst();
		System.out.println("removeFirst:" + list);

		System.out.println("sizeList:" + list.size());
	}
}