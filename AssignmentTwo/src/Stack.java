public class Stack {

	private int[] stack;
	private int top;

	public Stack() {
		top = -1;
		stack = new int[5];
	}
	
	public Stack(int size) {
		top = -1;
		stack = new int[size];
	}

	public void push(int item) {
		if (top >= stack.length-1) {
			System.out.println("Stack overflow");
		} else {
			stack[++top] = item;
		}
	}

	public void pop() {
		int item = 0;
		if (top < 0) {
			System.out.println("Stack underflow");
		} else {
			item = stack[top--];
			System.out.println(item);
		}
	}
}
