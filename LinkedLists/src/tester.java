
public class tester {
	public static void main(String [] args) {
		LinkedList<String> food =  new LinkedList();
		food.add("apples");
		food.add("bananas");
		food.add("kiwi");
		food.add("bananas");

		System.out.println(food);
		IntNode h = new IntNode(70,null);
		IntNode g = new IntNode(60,h);
		IntNode f = new IntNode(50,g);
		IntNode e = new IntNode(40,f);

		IntNode d = new IntNode(40,null);
		IntNode c = new IntNode(30,d);
		IntNode b = new IntNode(20,c);
		IntNode a = new IntNode(10,b);
		printLinked(a);
		System.out.println();
		printLinked(e);
		System.out.println();
		printLinked(commonElements(e,a));
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
	public static void deleteEveryOther(IntNode front) {
		if(front == null) {return;}
		IntNode current = front;
		while(current.next != null) {
			current.next = current.next.next;
			current = current.next;
		}
	}
	public static IntNode commonElements(IntNode frontL1, IntNode frontL2) {
		IntNode frontNode = null;
		IntNode cu = null;
		IntNode currentNode = frontL1;
		while(currentNode != null) {
			IntNode currentNode2 = frontL2;
			while(currentNode2 != null) {
				if(currentNode.data == currentNode2.data) {
					if(frontNode != null) {
						cu.next = currentNode2;
						cu = cu.next;
					}else {
						frontNode = currentNode2;
						cu = frontNode;
					}
				}
				currentNode2 = currentNode2.next;
			}
			currentNode = currentNode.next;
		}
		return frontNode;
		
	}
	public static void printLinked(IntNode front) {
		IntNode afs = front;
		while(afs != null) {
			System.out.print(afs);
			afs = afs.next;
		}
	}
}
