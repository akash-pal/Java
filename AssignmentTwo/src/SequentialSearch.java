public class SequentialSearch {

	private int array[];

	public SequentialSearch(int[] array) {
		super();
		this.array = array;
	}

	public void search(int element) {
		
		int flag=0,pos=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				pos=i+1;
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println(element + " is at position " + pos);
		}

	}

}
