package Double;

public class DoublyLinkedListMain {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();

		for (int i = 0; i < 10; ++i)
			dll.insertFirst(i);

		dll.insertLast(20);
		dll.insertLast(30);

		dll.printLinkedListForward();
		System.out.println();
		dll.printLinkedListBacward();
		System.out.println();

		dll.deleteFirst();
		dll.printLinkedListForward();
		System.out.println();

		dll.deleteLast();
		dll.printLinkedListForward();
		System.out.println();
	}
}
