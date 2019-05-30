package Single;

public class SingleLinkedList {
	private SingleLinkedListNode head;

	public boolean isEmpty() {
		return head == null;
	}

	public void insertFirst(int data) {
		SingleLinkedListNode newNode = new SingleLinkedListNode();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
	}

	public SingleLinkedListNode deleteFirst() {
		SingleLinkedListNode temp = head;
		head = head.next;
		return temp;
	}

	public void deleteAfter(SingleLinkedListNode after) {
		SingleLinkedListNode temp = head;
		while (temp.next != null && temp.data != after.data)
			temp = temp.next;

		if (temp.next != null)
			temp.next = temp.next.next;
	}

	public void insertLast(int data) {
		SingleLinkedListNode current = head;
		while (current.next != null)
			current = current.next;

		SingleLinkedListNode newNode = new SingleLinkedListNode();
		newNode.data = data;
		current.next = newNode;
	}

	public void printLinkedList() {
		System.out.println("***** SingleLinkedListNode (head --> last) *****");
		SingleLinkedListNode current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}
}
