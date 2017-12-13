//Linked List traversal practice
class Practice<T>{
	Node<T> head;
	Node<T> tail;
	int size = 0;

	public class Node<T>{
		T data;
		Node<T> next;

		Node(T data){
			this.data = data;
		}
	}

	private void append(T data){
		Node newNode = new Node(data);
		if (head == null){
			head = tail = newNode;
		}
		else{
			Node n = new Node(data);
			tail.next = n;
			tail = tail.next;
		}
		size++;
	}

	private void method1(Node c){
		if (c == null){
			return;
		}
		System.out.println(c.data);
		method1(c.next);
	}

	private void method2(Node c){
		if (c == null){
			return;
		}
		method2(c.next);
		System.out.println(c.data);
	}

	public static void main(String[]args){
		Practice p = new Practice<>();
		for (int i = 0; i < 3; i++){
			p.append(i);
		}
		p.method1(p.head);
		System.out.println("break");
		p.method2(p.head);
	}
}