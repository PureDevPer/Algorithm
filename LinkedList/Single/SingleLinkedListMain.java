package Single;

public class SingleLinkedListMain {
	public static void main(String[] args) {
		SingleLinkedList sll = new SingleLinkedList();

		for (int i = 0; i < 10; ++i)
			sll.insertFirst(i);

		sll.printLinkedList();

		SingleLinkedListNode node = new SingleLinkedListNode();
		sll.deleteFirst();
		node.data = 4;

		sll.deleteAfter(node);
		sll.printLinkedList();
	}
}
