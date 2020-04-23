
public class tester {
	public static void main(String [] args) {
		LinkedList<String> food =  new LinkedList();
		food.add("apples");
		food.add("bananas");
		food.add("kiwi");
		food.add("bananas");

		System.out.println(food);
		

		IntNode d = new IntNode(10,null);
		IntNode c = new IntNode(20,d);
		IntNode b = new IntNode(30,c);
		IntNode a = new IntNode(40,b);
		System.out.println(addBeforeLast(a, 15));
		IntNode afs = a;
		while(afs != null) {
			System.out.println(afs);
			afs = afs.next;
		}
		
	}
	public static IntNode addBeforeLast(IntNode front, int item) {
		IntNode currentNode = front;
		IntNode newItem = null;
		while(currentNode != null) {
			if(currentNode.next.next == null) {
				newItem = new IntNode(item,currentNode.next);
				currentNode.next = newItem;
				break;
			}
			currentNode = currentNode.next;
		}
		return newItem;
	}
}
