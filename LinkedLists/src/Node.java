
public class Node<T> {
	Node<T> next;
	T val;
	
	public Node(Node<T> next, T val) {
		this.next = next;
		this.val = val;
	}
}
