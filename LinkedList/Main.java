
public class Main {
	public static void main(String[] args) {
		
		// ***************************************************
		// LinkedListNode
		// ***************************************************
		LinkedListNode first = new LinkedListNode(0, null, null);
		LinkedListNode head = first;
		LinkedListNode second = first;

		for (int i = 1; i < 10; ++i) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println("***** LinkedListNode *****");
		System.out.println(head.printForward());
	}
}
