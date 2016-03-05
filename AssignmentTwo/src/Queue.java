
public class Queue {

	private int array[];
	private int rear;
	private int front;
	
	
	
	public Queue() {
		super();
		rear=front=-1;
		array = new int[5];
	}
	
	public Queue(int size) {
		super();
		rear=front=-1;
		array = new int[size];
	}

	public void enqueue(int value){
		
		if(rear>=array.length-1)
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			array[++rear]=value;
			front=0;
		}
	}
	
	public void dequeue(){
		
		if(front==-1)
		{
			System.out.println("Queue Underflow");
		}
		else if(rear+1==front)
		{
			rear=front=-1;
		}
		else
		{
			int value=0;
			value = array[front++];
			System.out.println(value);	
		}
	}
}
