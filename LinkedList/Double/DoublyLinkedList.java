package Double;

public class DoublyLinkedList {
	private DoublyLinkedListNode head;
	private DoublyLinkedListNode tail;
	int size;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(int data) {
		DoublyLinkedListNode newDoublyNode = new DoublyLinkedListNode();
		newDoublyNode.data = data;
		newDoublyNode.next = head;
		newDoublyNode.prev = null;

		if (head != null)
			head.prev = newDoublyNode;

		head = newDoublyNode;

		if (tail == null)
			tail = newDoublyNode;

		++size;
	}

	public void insertLast(int data) {
		DoublyLinkedListNode newDoublyNode = new DoublyLinkedListNode();
		newDoublyNode.data = data;
		newDoublyNode.next = null;
		newDoublyNode.prev = tail;

		if (tail != null)
			tail.next = newDoublyNode;
		tail = newDoublyNode;
		if (head == null)
			head = newDoublyNode;
		++size;
	}

	public DoublyLinkedListNode deleteFirst() {
		if (size == 0)
			throw new RuntimeException("Doubly Linked List is empty");

		DoublyLinkedListNode temp = head;
		head = head.next;
		head.prev = null;
		--size;
		return temp;
	}

	public DoublyLinkedListNode deleteLast() {
		DoublyLinkedListNode temp = tail;
		tail = tail.prev;
		tail.next = null;
		--size;
		return temp;
	}

	public void deleteAfter(DoublyLinkedListNode after) {
		DoublyLinkedListNode temp = head;
		while (temp.next != null && temp.data != after.data)
			temp = temp.next;

		if (temp.next != null)
			temp.next = temp.next.next;
	}

	public void printLinkedListForward() {
		System.out.println("***** DoublyLinkedListNode - Forward (head --> tail) *****");
		DoublyLinkedListNode current = head;

		while (current != null) {
			current.displayDoublyLinkedListNodeData();
			current = current.next;
		}
	}

	public void printLinkedListBacward() {
		System.out.println("***** DoublyLinkedListNode - Backward (tail --> head) *****");
		DoublyLinkedListNode current = tail;

		while (current != null) {
			current.displayDoublyLinkedListNodeData();
			current = current.prev;
		}
	}
}
